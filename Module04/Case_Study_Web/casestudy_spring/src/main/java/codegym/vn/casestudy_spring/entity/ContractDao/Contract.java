package codegym.vn.casestudy_spring.entity.ContractDao;


import codegym.vn.casestudy_spring.entity.CustomerDAO.Customer;
import codegym.vn.casestudy_spring.entity.EmployeeDAO.Employee;
import codegym.vn.casestudy_spring.entity.ServiceDAO.Service;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
public class Contract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idContract;


    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate startDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate endDate;

    private double deposit;
    private double totalMoney;

    @ManyToOne
    @JoinColumn(name = "serviceId", referencedColumnName = "serviceId")
    private Service service;

    @ManyToOne
    @JoinColumn(name = "customerId", referencedColumnName = "customerId")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "employeeId", referencedColumnName = "employeeId")
    private Employee employee;

    public Contract() {
    }

    public Contract(int idContract, LocalDate startDate, LocalDate endDate, double deposit, double totalMoney, Service service, Customer customer, Employee employee) {
        this.idContract = idContract;
        this.startDate = startDate;
        this.endDate = endDate;
        this.deposit = deposit;
        this.totalMoney = totalMoney;
        this.service = service;
        this.customer = customer;
        this.employee = employee;
    }

    public int getIdContract() {
        return idContract;
    }

    public void setIdContract(int idContract) {
        this.idContract = idContract;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public List<ContracDetail> getContracDetailListattachments() {
        return contracDetailListattachments;
    }

    public void setContracDetailListattachments(List<ContracDetail> contracDetailListattachments) {
        this.contracDetailListattachments = contracDetailListattachments;
    }

    @OneToMany(cascade = CascadeType.ALL,
            mappedBy = "contract")
    private List<ContracDetail> contracDetailListattachments;





}
