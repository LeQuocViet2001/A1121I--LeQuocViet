package model.repository.inteface;

import model.bean.Employee;
import model.bean.User;

import java.util.List;

public interface IEmployeeRepository {
    List<Employee> getAllListEmployee();

     boolean addEmployee(User user, Employee employee);

    Employee getEmployeerById(int id);

    boolean editEmployee(Employee employee);

    boolean deleteEmployee(int id);
}
