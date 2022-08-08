package model.repository.impl;

import model.bean.Customer;
import model.bean.Employee;
import model.bean.User;
import model.repository.BaseRepository;
import model.repository.inteface.IEmployeeRepository;
import model.service.IEmployeeServiee;
import model.service.impl.EmployeeServire;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    @Override
    public List<Employee> getAllListEmployee() {
        List<Employee> list = new ArrayList<>();
        Connection connection = BaseRepository.getConnect();
        try {
            PreparedStatement ps = connection.prepareStatement("select * from employee;");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int employee_id = rs.getInt("employee_id");
                String employee_name = rs.getString("employee_name");
                String employee_birthday = rs.getString("employee_birthday");
                String employee_id_card = rs.getString("employee_id_card");
                double employee_salary = rs.getDouble("employee_salary");
                String employee_phone = rs.getString("employee_phone");
                String employee_email = rs.getString("employee_email");
                String employee_address = rs.getString("employee_address");
                int position_id = rs.getInt("position_id");
                int education_degree_id = rs.getInt("education_degree_id");
                int division_id = rs.getInt("division_id");
                String username = rs.getString("username");

                list.add(new Employee(employee_id, employee_name, employee_birthday, employee_id_card, employee_salary, employee_phone, employee_email, employee_address, position_id, education_degree_id, division_id, username));

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }

    @Override
    public boolean addEmployee(User user, Employee employee) {
        Connection cn = BaseRepository.getConnect();
        try {
            CallableStatement cal = cn.prepareCall("call add_user( ? , ? , ?  ) ");
            cal.setString(1, user.getUsername());
            cal.setString(2, user.getPassword());
            cal.setInt(3, user.getRole().getRole_Id());

            if (cal.executeUpdate() > 0) {
                System.out.println("tao add thanh cong");
                String sql = "INSERT INTO `cg_furama`.`employee` (`employee_name`, `employee_birthday`, `employee_id_card`, `employee_salary`, " +
                        "`employee_phone`, " +
                        "`employee_email`, `employee_address`, `position_id`, `education_degree_id`," +
                        " `division_id`, `username`) VALUES (?,? ,?,?  ,?,?,?,?,?,?,?);";
                PreparedStatement ps = cn.prepareStatement(sql);
                ps.setString(1, employee.getEmployee_name());
                ps.setString(2, employee.getEmployee_birthday());
                ps.setString(3, employee.getEmployee_id_card());
                ps.setDouble(4, employee.getEmployee_salary());
                ps.setString(5, employee.getEmployee_phone());
                ps.setString(6, employee.getEmployee_email());
                ps.setString(7, employee.getEmployee_address());
                ps.setInt(8, employee.getPosition_id());
                ps.setInt(9, employee.getEducation_degree_id());
                ps.setInt(10, employee.getDivision_id());
                ps.setString(11, employee.getUsername());

                if (ps.executeUpdate() > 0) return true;
                else {
                    ps = cn.prepareStatement("DELETE FROM `cg_furama`.`user_role` WHERE (`role_id` = ?) and (`username` = ?);");
                    ps.setString(1, user.getUsername());
                    ps.setString(2, user.getPassword());
                    ps.executeUpdate();
                    return false;
                }
            } else {
                return false;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return false;
    }

    @Override
    public Employee getEmployeerById(int id) {
        Connection connection = BaseRepository.getConnect();
        try {
            PreparedStatement ps = connection.prepareStatement("select * from employee where employee_id = ?  ;");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int employee_id = rs.getInt("employee_id");
                String employee_name = rs.getString("employee_name");
                String employee_birthday = rs.getString("employee_birthday");
                String employee_id_card = rs.getString("employee_id_card");
                double employee_salary = rs.getDouble("employee_salary");
                String employee_phone = rs.getString("employee_phone");
                String employee_email = rs.getString("employee_email");
                String employee_address = rs.getString("employee_address");
                int position_id = rs.getInt("position_id");
                int education_degree_id = rs.getInt("education_degree_id");
                int division_id = rs.getInt("division_id");
                String username = rs.getString("username");

                return new Employee(employee_id, employee_name, employee_birthday, employee_id_card, employee_salary, employee_phone, employee_email, employee_address, position_id, education_degree_id, division_id, username);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean editEmployee(Employee employee) {
        String sql = "UPDATE `cg_furama`.`employee` SET `employee_name` = ?, `employee_birthday` = ?, `employee_id_card` = ?, " +
                "`employee_salary` = ?, `employee_phone` = ?, `employee_email` = ?, `employee_address` = ?, `position_id` = ?, " +
                "`education_degree_id` = ?, `division_id` = ? WHERE (`employee_id` = ?);";
        Connection c = BaseRepository.getConnect();
        try {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, employee.getEmployee_name());
            ps.setString(2, employee.getEmployee_birthday());
            ps.setString(3, employee.getEmployee_id_card());
            ps.setDouble(4, employee.getEmployee_salary());
            ps.setString(5, employee.getEmployee_phone());
            ps.setString(6, employee.getEmployee_email());
            ps.setString(7, employee.getEmployee_address());
            ps.setInt(8, employee.getPosition_id());
            ps.setInt(9, employee.getEducation_degree_id());
            ps.setInt(10, employee.getDivision_id());
            ps.setInt(11, employee.getEmployee_id());

            if (ps.executeUpdate() > 0) return true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean deleteEmployee(int id) {
        Connection cn = BaseRepository.getConnect();
        try {
            PreparedStatement ps = cn.prepareStatement("delete from employee where employee_id = ?");
            ps.setInt(1, id);
            if (ps.executeUpdate() > 0)
                return true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return false;
    }
}
