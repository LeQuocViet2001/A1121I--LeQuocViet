package controller;

import model.bean.ContractDAO.AttachService;
import model.bean.ContractDAO.Contract;
import model.bean.ContractDAO.ContractDetail;
import model.bean.Customer;
import model.bean.Employee;
import model.bean.Service;
import model.service.IContractService;
import model.service.ICustomerService;
import model.service.IEmployeeServiee;
import model.service.IServiceDAO_Service;
import model.service.impl.ContractService;
import model.service.impl.CustomerService;
import model.service.impl.EmployeeServire;
import model.service.impl.ServiceDAO_Service;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ContractServlet", urlPatterns = "/contract")
public class ContractServlet extends HttpServlet {

    private IContractService iContractService = new ContractService();
    private IServiceDAO_Service iServiceDAO_service = new ServiceDAO_Service();
    private ICustomerService iCustomerService = new CustomerService();
    private IEmployeeServiee iEmployeeServiee = new EmployeeServire();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action ==null) action = "";

        switch (action){
            case "add":{
                    addContract(request,response);
                response.sendRedirect("/contract");
                break;
            }
            case "addDetail":{
                addDetailContract(request,response);
                response.sendRedirect("/contract");
                break;
            }
        }

    }

    private void addDetailContract(HttpServletRequest request, HttpServletResponse response) {

        int quantity = Integer.parseInt(request.getParameter("quantity"));
        int contract_id = Integer.parseInt(request.getParameter("contract_id"));
        int attach_service_id = Integer.parseInt(request.getParameter("attach_service_id"));
        ContractDetail contractDetail = new ContractDetail(0,contract_id,attach_service_id,quantity);

        HttpSession session = request.getSession();
        if( iContractService.addDetailContract(contractDetail) == true){
            session.setAttribute("msgSucces"," Them thanh cong");
        }
        else{
            session.setAttribute("msgFail"," Them That bai");
        }


    }

    private void addContract(HttpServletRequest request, HttpServletResponse response) {
        double contract_deposit = Double.parseDouble(request.getParameter("contract_deposit"));
        double contract_total_money = Double.parseDouble(request.getParameter("contract_total_money"));
        String contract_start_date = request.getParameter("contract_start_date");
        String contract_end_date = request.getParameter("contract_end_date");

        int employee_id = Integer.parseInt(request.getParameter("employee_id"));
        int customer_id = Integer.parseInt(request.getParameter("customer_id"));
        int service_id = Integer.parseInt(request.getParameter("service_id"));
        Contract contract = new Contract(0,contract_start_date,contract_end_date,contract_deposit,contract_total_money,employee_id,customer_id,service_id);

        HttpSession session = request.getSession();
        if( iContractService.addContract(contract) == true){
            session.setAttribute("msgSucces"," Them thanh cong");
        }
        else{
            session.setAttribute("msgFail"," Them That bai");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action ==null) action = "";

        switch (action){
            case "add":{
                 showFormAdd(request,response);
                break;
            }
            case "addDetail":{
                showFormAddDetail(request,response);
                break;
            }
            default:{
                List<Contract> contractList = iContractService.getListContract();
                request.setAttribute("contractList",contractList );
                RequestDispatcher dispatcher = request.getRequestDispatcher("view/contract/contractHome.jsp");
                dispatcher.forward(request,response);

            }
        }
    }

    private void showFormAddDetail(HttpServletRequest request, HttpServletResponse response) {

        List<AttachService> attachServiceList = iContractService.getListAttachService();
        request.setAttribute("attachServiceList",attachServiceList);

        int contract_id =Integer.parseInt(request.getParameter("id"));
        request.setAttribute("contract_id",contract_id );
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/contract/formDetailContract.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showFormAdd(HttpServletRequest request, HttpServletResponse response) {

        List<Employee> employeeList = iEmployeeServiee.getAllListEmployee();
        List<Customer> customerList = iCustomerService.getAllListCustomer();
        List<Service> serviceList = iServiceDAO_service.getAllListService();
        request.setAttribute("employeeList",employeeList);
        request.setAttribute("customerList",customerList);
        request.setAttribute("serviceList",serviceList);

        RequestDispatcher dispatcher = request.getRequestDispatcher("view/contract/FormAddNewContract.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
