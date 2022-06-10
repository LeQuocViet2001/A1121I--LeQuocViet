package model.service.impl;

import model.bean.Employee;
import model.bean.User;
import model.repository.impl.EmployeeRepository;
import model.repository.inteface.IEmployeeRepository;
import model.service.IEmployeeServiee;

import java.util.List;

public class EmployeeServire  implements IEmployeeServiee {

                private IEmployeeRepository iEmployeeRepository = new EmployeeRepository();
    @Override
    public List<Employee> getAllListEmployee() {
        return iEmployeeRepository.getAllListEmployee();
    }

    @Override
    public boolean addEmployee(User user,Employee employee) {
        return iEmployeeRepository.addEmployee(user,employee);
    }

    @Override
    public Employee getEmployeerById(int id) {
        return iEmployeeRepository.getEmployeerById(id);
    }

    @Override
    public boolean editEmployee(Employee employee) {
        return iEmployeeRepository.editEmployee(employee);
    }

    @Override
    public boolean deleteEmployee(int id) {

        return iEmployeeRepository.deleteEmployee(id);
    }
}
