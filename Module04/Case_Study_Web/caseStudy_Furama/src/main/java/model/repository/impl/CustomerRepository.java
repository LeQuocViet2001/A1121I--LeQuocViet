package model.repository.impl;

import model.bean.Customer;
import model.repository.BaseRepository;
import model.repository.inteface.ICustomerRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {


    @Override
    public List<Customer> getAllListCustomer() {
        List<Customer> list = new ArrayList<>();
        Connection connection = BaseRepository.getConnect();

        try {
            PreparedStatement ps = connection.prepareStatement("select * from customer;");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int customer_id = rs.getInt("customer_id");
                int customer_type_id = rs.getInt("customer_type_id");
                String customer_name = rs.getString("customer_name");
                String customer_birthday = rs.getString("customer_birthday");
                boolean customer_gender = rs.getBoolean("customer_gender");
                String customer_id_card = rs.getString("customer_id_card");
                String customer_phone = rs.getString("customer_phone");
                String customer_email = rs.getString("customer_email");
                String customer_address = rs.getString("customer_address");

                list.add(new Customer(customer_id, customer_type_id, customer_name, customer_birthday, customer_gender, customer_id_card, customer_phone, customer_email, customer_address));

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }


    @Override
    public boolean addCustomer(Customer customer) {
        String sql = "INSERT INTO `customer` (`customer_type_id`, `customer_name`, `customer_birthday`," +
                " `customer_gender`, `customer_id_card`, `customer_phone`, `customer_email`, `customer_address`) " +
                "VALUES ( ?, ?, ?, ?, ?,?,?, ?);";
        Connection cn = BaseRepository.getConnect();
        try {
            PreparedStatement ps = cn.prepareStatement(sql);

            ps.setInt(1, customer.getCustomer_type_id());
            ps.setString(2, customer.getCustomer_name());
            ps.setString(3, customer.getCustomer_birthday());
            ps.setBoolean(4, customer.isCustomer_gender());
            ps.setString(5, customer.getCustomer_id_card());
            ps.setString(6, customer.getCustomer_phone());
            ps.setString(7, customer.getCustomer_email());
            ps.setString(8, customer.getCustomer_address());

            if (ps.executeUpdate() > 0)
                return true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }

    @Override
    public Customer getCustomerById(int id) {
        String sql = "select * from customer where customer_id = ? ";

        Connection connection = BaseRepository.getConnect();

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int customer_id = rs.getInt("customer_id");
                int customer_type_id = rs.getInt("customer_type_id");
                String customer_name = rs.getString("customer_name");
                String customer_birthday = rs.getString("customer_birthday");
                boolean customer_gender = rs.getBoolean("customer_gender");
                String customer_id_card = rs.getString("customer_id_card");
                String customer_phone = rs.getString("customer_phone");
                String customer_email = rs.getString("customer_email");
                String customer_address = rs.getString("customer_address");
                return new Customer(customer_id, customer_type_id, customer_name, customer_birthday, customer_gender, customer_id_card, customer_phone, customer_email, customer_address);

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean editCustomer(Customer customer) {
        Connection cn = BaseRepository.getConnect();
        String sql = " UPDATE `customer` SET `customer_type_id` = ?, `customer_name` = ?," +
                " `customer_birthday` = ?, `customer_gender` = ?, `customer_id_card` = ?," +
                " `customer_phone` = ?, " +
                "`customer_email` = ?, `customer_address` = ? WHERE (`customer_id` = ?);";
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, customer.getCustomer_type_id());
            ps.setString(2, customer.getCustomer_name());
            ps.setString(3, customer.getCustomer_birthday());
            ps.setBoolean(4, customer.isCustomer_gender());
            ps.setString(5, customer.getCustomer_id_card());
            ps.setString(6, customer.getCustomer_phone());
            ps.setString(7, customer.getCustomer_email());
            ps.setString(8, customer.getCustomer_address());
            ps.setInt(9, customer.getCustomer_id());

            if (ps.executeUpdate() > 0) return true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        Connection cn = BaseRepository.getConnect();
        PreparedStatement ps = null;
        try {
            ps = cn.prepareStatement("delete from customer where customer_id = ?");
            ps.setInt(1, id);
            System.out.println(id);
            if (ps.executeUpdate() > 0) return true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;

    }

    @Override
    public List<Customer> searchCustomer(String searchName, String searchBirtday, String searchType_id) {
        Connection cn = BaseRepository.getConnect();
        List<Customer> list = new ArrayList<>();
        try {

            PreparedStatement ps = cn.prepareStatement("select * from customer where customer_type_id like ?" +
                    " and customer_name like ? and customer_birthday like ? ;");

            ps.setString(1, "%" + searchType_id + "%");
            ps.setString(2, "%" + searchName + "%");
            ps.setString(3, "%%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int customer_id = rs.getInt("customer_id");
                int customer_type_id = rs.getInt("customer_type_id");
                String customer_name = rs.getString("customer_name");
                String customer_birthday = rs.getString("customer_birthday");
                boolean customer_gender = rs.getBoolean("customer_gender");
                String customer_id_card = rs.getString("customer_id_card");
                String customer_phone = rs.getString("customer_phone");
                String customer_email = rs.getString("customer_email");
                String customer_address = rs.getString("customer_address");

                list.add(new Customer(customer_id, customer_type_id, customer_name, customer_birthday, customer_gender, customer_id_card, customer_phone, customer_email, customer_address));
                System.out.println("1");
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;

    }
}
