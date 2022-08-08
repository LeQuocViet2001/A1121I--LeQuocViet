package model.repository.impl;

import model.bean.EmployeeDAO.Role;
import model.bean.User;
import model.repository.BaseRepository;
import model.repository.inteface.ILoginRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginRepository implements ILoginRepository {

    @Override
    public User checkExits(User u) {
        Connection connection = BaseRepository.getConnect();
        String sql = "select ur.role_id, u.username, u.password, r.role_name from user_role  ur\n" +
                "inner join user u on u.username = ur.username\n" +
                "inner join role r on r.role_id = ur.role_id where u.username = ? and u.password = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, u.getUsername());
            ps.setString(2, u.getPassword());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String name = rs.getString("username");
                String pass = rs.getString("password");

                Role role = new Role(rs.getInt("role_id"), rs.getString("role_name"));

                return new User(name, pass, role);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return null;
        }

        return null;
    }


}
