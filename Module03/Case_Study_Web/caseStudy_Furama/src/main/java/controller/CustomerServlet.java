package controller;

import model.bean.Customer;
import model.bean.CustomerType;
import model.bean.ObjectType2Filed;
import model.service.ICustomerService;
import model.service.IOpject2FieldService;
import model.service.impl.CustomerService;
import model.service.impl.Opject2FieldService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet",  urlPatterns = "/customer" )
public class CustomerServlet extends HttpServlet {
    private final IOpject2FieldService iOpject2FieldService = new Opject2FieldService();

    private final ICustomerService iCustomerService = new CustomerService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null)
            action = "";
        switch (action) {
            case "add": {
                addCustomer(request, response);
                response.sendRedirect("/customer");
                break;
            }
            case "edit": {
                editCustomer(request, response);
                response.sendRedirect("/customer");
                break;
            }
            case "delete": {
                int id = Integer.parseInt(request.getParameter("idDelete"));
                if (iCustomerService.deleteCustomer(id) == true) {
                    System.out.println("ok");

                } else System.out.println("no");
                response.sendRedirect("/customer");
                break;
            }
            case "search": {
                String searchName = request.getParameter("searchName");
                String searchBirtday = request.getParameter("searchBirtday");
                String searchType_id = request.getParameter("searchType_id");


                List<Customer> customers = iCustomerService.searchCustomer(searchName, searchBirtday, searchType_id);
                request.setAttribute("customers",customers);

                List<CustomerType> customerTypeList =    iOpject2FieldService.getAllListCustomer();
                request.setAttribute("customerTypeList",customerTypeList);
                RequestDispatcher dispatcher = request.getRequestDispatcher("view/customer/customerHome.jsp");
                dispatcher.forward(request,response);
                break;
            }


        }
    }



    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if( action==null)
            action ="";
        switch (action){
            case "add":{
                showFormAddCustomer(request,response);
                response.sendRedirect("/customer");
                break;
            }
            case "edit":{
                showFormEdit(request,response);
                response.sendRedirect("/customer");

                break;

            }
            default:{
                List<Customer> customers = iCustomerService.getAllListCustomer();
                request.setAttribute("customers",customers);
                List<CustomerType> customerTypeList =    iOpject2FieldService.getAllListCustomer();
                request.setAttribute("customerTypeList",customerTypeList);
                RequestDispatcher dispatcher = request.getRequestDispatcher("view/customer/customerHome.jsp");
                dispatcher.forward(request,response);
                break;

            }
        }


    }

    private void showFormEdit(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Customer customer =  iCustomerService.getCustomerById(id);
        request.setAttribute("customer",customer );
        List<CustomerType> customerTypeList =    iOpject2FieldService.getAllListCustomer();
        request.setAttribute("customerTypeList",customerTypeList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/customer/FormEditCustomer.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showFormAddCustomer(HttpServletRequest request, HttpServletResponse response) {

        List<CustomerType> customerTypeList =    iOpject2FieldService.getAllListCustomer();
        request.setAttribute("customerTypeList",customerTypeList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/customer/FormAddCustomer.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private void addCustomer(HttpServletRequest request, HttpServletResponse response) {
//        int customer_id =  Integer.parseInt(request.getParameter("customer_id"));
        int customer_type_id = Integer.parseInt(request.getParameter("customer_type_id"));
        String customer_name = request.getParameter("customer_name");
        String customer_birthday = request.getParameter("customer_birthday");
        boolean customer_gender = Boolean.parseBoolean( request.getParameter("customer_gender"));
        System.out.println( customer_gender );
        String customer_id_card = request.getParameter("customer_id_card");
        String customer_phone = request.getParameter("customer_phone");
        String customer_email = request.getParameter("customer_email");
        String customer_address = request.getParameter("customer_address");
        Customer customer = new Customer(0 , customer_type_id, customer_name,customer_birthday, customer_gender,customer_id_card,customer_phone,customer_email,customer_address);


        HttpSession session = request.getSession();
        if(    iCustomerService.addCustomer(customer) == true){
            session.setAttribute("msgSucces"," them thanh cong");
        }
        else{
            session.setAttribute("msgFail"," them That bai");
        }

    }
    private void editCustomer(HttpServletRequest request, HttpServletResponse response) {
        int customer_id =  Integer.parseInt(request.getParameter("customer_id"));
        int customer_type_id = Integer.parseInt(request.getParameter("customer_type_id"));
        String customer_name = request.getParameter("customer_name");
        String customer_birthday = request.getParameter("customer_birthday");
        boolean customer_gender = Boolean.parseBoolean( request.getParameter("customer_gender"));
        System.out.println( customer_gender );
        String customer_id_card = request.getParameter("customer_id_card");
        String customer_phone = request.getParameter("customer_phone");
        String customer_email = request.getParameter("customer_email");
        String customer_address = request.getParameter("customer_address");
        Customer customer = new Customer(customer_id , customer_type_id, customer_name,customer_birthday, customer_gender,customer_id_card,customer_phone,customer_email,customer_address);


        HttpSession session = request.getSession();
        if( iCustomerService.editCustomer(customer) == true){
            session.setAttribute("msgSucces"," sua thanh cong");
        }
        else{
            session.setAttribute("msgFail"," sua That bai");
        }
    }

}
