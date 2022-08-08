package model.service.impl;

import model.bean.Customer;
import model.repository.inteface.ICustomerRepository;
import model.repository.impl.CustomerRepository;
import model.service.ICustomerService;

import java.util.List;

public class CustomerService implements ICustomerService {

    private ICustomerRepository iCustomerRepository = new CustomerRepository();

    @Override
    public List<Customer> getAllListCustomer() {
        return iCustomerRepository.getAllListCustomer();
    }

    @Override
    public boolean addCustomer(Customer customer) {
        return iCustomerRepository.addCustomer(customer);
    }

    @Override
    public Customer getCustomerById(int id) {
        return iCustomerRepository.getCustomerById(id);
    }

    @Override
    public boolean editCustomer(Customer customer) {
        return iCustomerRepository.editCustomer(customer);
    }

    @Override
    public boolean deleteCustomer(int id) {
        return iCustomerRepository.delete(id);
    }

    @Override
    public List<Customer> searchCustomer(String searchName, String searchBirtday, String searchType_id) {
        return iCustomerRepository.searchCustomer(searchName, searchBirtday, searchType_id);
    }
}
