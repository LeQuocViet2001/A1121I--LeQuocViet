package model.service;

import model.bean.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> getAllListCustomer();

    boolean addCustomer(Customer customer);

    Customer getCustomerById(int id);

    boolean editCustomer(Customer customer);

    boolean deleteCustomer(int id);

    List<Customer> searchCustomer(String searchName, String searchBirtday, String searchType_id);
}
