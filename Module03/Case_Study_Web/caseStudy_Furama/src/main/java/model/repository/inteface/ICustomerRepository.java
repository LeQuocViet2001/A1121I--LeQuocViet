package model.repository.inteface;

import model.bean.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> getAllListCustomer();

    boolean addCustomer(Customer customer);

    Customer getCustomerById(int id);

    boolean editCustomer(Customer customer);

    boolean delete(int id);

    List<Customer> searchCustomer(String searchName, String searchBirtday, String searchType_id);
}
