package controller;

import model.bean.Customer;
import model.bean.Employee;
import model.bean.EmployeeDAO.Division;
import model.bean.EmployeeDAO.EducationDegree;
import model.bean.EmployeeDAO.Position;
import model.bean.EmployeeDAO.Role;
import model.bean.User;
import model.repository.inteface.IOpject2FieldRepository;
import model.service.IEmployeeServiee;
import model.service.IOpject2FieldService;
import model.service.impl.EmployeeServire;
import model.service.impl.Opject2FieldService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "EmployeeServlet", urlPatterns = "/employee")
public class EmployeeServlet extends HttpServlet {
    private IEmployeeServiee iEmployeeServiee = new EmployeeServire();

    private IOpject2FieldService iOpject2FieldService = new Opject2FieldService();
    private List<Position> positionList = iOpject2FieldService.getAllListPositon();
    private List<EducationDegree> educationDegreeList = iOpject2FieldService.getAllListEducationDegree();
    private List<Division> divisionList = iOpject2FieldService.getAllListDivison();
    private List<Role> roleList;


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) action = "";
        switch (action) {
            case "add": {
                addEmployee(request, response);
                break;
            }
            case "delete": {
                deleteEmployee(request, response);
                break;
            }
            case "edit": {
                editEmployee(request, response);
                break;

            }

        }
        response.sendRedirect("/employee");

    }

    private void editEmployee(HttpServletRequest request, HttpServletResponse response) {
        int employee_id = Integer.parseInt(request.getParameter("employee_id"));
        int position_id = Integer.parseInt(request.getParameter("position_id"));
        int education_degree_id = Integer.parseInt(request.getParameter("education_degree_id"));
        int division_id = Integer.parseInt(request.getParameter("division_id"));
        double employee_salary = Double.parseDouble(request.getParameter("employee_salary"));

        String employee_name = request.getParameter("employee_name");
        String employee_birthday = request.getParameter("employee_birthday");
        String employee_id_card = request.getParameter("employee_id_card");
        String employee_phone = request.getParameter("employee_phone");
        String employee_email = request.getParameter("employee_email");
        String employee_address = request.getParameter("employee_address");
        Employee employee = new Employee(employee_id, employee_name, employee_birthday, employee_id_card, employee_salary, employee_phone, employee_email, employee_address, position_id, education_degree_id, division_id, "");

        HttpSession session = request.getSession();
        if (iEmployeeServiee.editEmployee(employee)) {
            session.setAttribute("msgSucces", " Sua thanh cong");
        } else {
            session.setAttribute("msgFail", " Sua That bai");
        }
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//        int role_id = Integer.parseInt(request.getParameter("role_id"));
    }

    private void deleteEmployee(HttpServletRequest request, HttpServletResponse response) {
        int idDelete = Integer.parseInt(request.getParameter("idDelete"));
        System.out.println(idDelete);
        HttpSession session = request.getSession();
        if (iEmployeeServiee.deleteEmployee(idDelete)) {
            session.setAttribute("msgSucces", " Xoa thanh cong");
        } else {
            session.setAttribute("msgFail", " Xoa That bai");
        }
    }

    private void addEmployee(HttpServletRequest request, HttpServletResponse response) {

        //  int employee_id = Integer.parseInt(request.getParameter("employee_id"));
        int position_id = Integer.parseInt(request.getParameter("position_id"));
        int education_degree_id = Integer.parseInt(request.getParameter("education_degree_id"));
        int division_id = Integer.parseInt(request.getParameter("division_id"));
        double employee_salary = Double.parseDouble(request.getParameter("employee_salary"));

        String employee_name = request.getParameter("employee_name");
        String employee_birthday = request.getParameter("employee_birthday");
        String employee_id_card = request.getParameter("employee_id_card");
        String employee_phone = request.getParameter("employee_phone");
        String employee_email = request.getParameter("employee_email");
        String employee_address = request.getParameter("employee_address");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        int role_id = Integer.parseInt(request.getParameter("role_id"));


        Employee employee = new Employee(0, employee_name, employee_birthday, employee_id_card, employee_salary, employee_phone, employee_email, employee_address, position_id, education_degree_id, division_id, username);
        User user = new User(username, password, new Role(role_id, "null"));


        HttpSession session = request.getSession();
        if (iEmployeeServiee.addEmployee(user, employee)) {
            session.setAttribute("msgSucces", " Them thanh cong");
        } else {
            session.setAttribute("msgFail", " Them That bai");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) action = "";
        switch (action) {
            case "add": {
                showFormAddEmployee(request, response);
                break;
            }
            case "edit": {
                showFormEdit(request, response);
            }

            default: {
                List<Employee> employeeList = iEmployeeServiee.getAllListEmployee();
                request.setAttribute("employeeList", employeeList);
                request.setAttribute("educationDegreeList", educationDegreeList);
                request.setAttribute("positionList", positionList);
                request.setAttribute("divisionList", divisionList);
                RequestDispatcher dispatcher = request.getRequestDispatcher("view/employee/employeeHome.jsp");
                dispatcher.forward(request, response);
            }
        }
    }

    private void showFormEdit(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
        User now_role = (User) session.getAttribute("user");
        if (now_role.getRole().getRole_Id() == 1) {
            session.setAttribute("msgWarring", "Khong co quyen");
            try {
                response.sendRedirect("/employee");
            } catch (IOException e) {
                e.printStackTrace();
            }

        } else {
            int id = Integer.parseInt(request.getParameter("id"));
            Employee employee = iEmployeeServiee.getEmployeerById(id);
            request.setAttribute("e", employee);
            request.setAttribute("educationDegreeList", educationDegreeList);
            request.setAttribute("positionList", positionList);
            request.setAttribute("divisionList", divisionList);
            RequestDispatcher dispatcher = request.getRequestDispatcher("view/employee/FormEditEmployee.jsp");
            try {
                dispatcher.forward(request, response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    private void showFormAddEmployee(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
        User now_role = (User) session.getAttribute("user");
        if (now_role.getRole().getRole_Id() == 1) {
            session.setAttribute("msgWarring", "Khong co quyen");
            try {
                response.sendRedirect("/employee");
            } catch (IOException e) {
                e.printStackTrace();
            }

        } else {
            roleList = iOpject2FieldService.getListRole(now_role.getRole().getRole_Id());
            request.setAttribute("roleList", roleList);
            request.setAttribute("educationDegreeList", educationDegreeList);
            request.setAttribute("positionList", positionList);
            request.setAttribute("divisionList", divisionList);

            RequestDispatcher dispatcher = request.getRequestDispatcher("view/employee/formAddEmployee.jsp");
            try {
                dispatcher.forward(request, response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
