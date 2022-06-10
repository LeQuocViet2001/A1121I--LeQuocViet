package model.service;

import model.bean.Customer;
import model.bean.Employee;
import model.bean.User;

import java.util.List;

public interface IEmployeeServiee {

    List<Employee> getAllListEmployee();

    boolean addEmployee(User user,Employee employee);

    Employee getEmployeerById(int id);

    boolean editEmployee(Employee employee);

    boolean deleteEmployee(int id);
}
