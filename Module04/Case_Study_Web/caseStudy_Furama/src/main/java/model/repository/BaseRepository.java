package model.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseRepository {
    private static final String URL = "jdbc:mysql://localhost:3306/cg_furama"; // sửa lại tên của csdl
    private static final String USER = "root";// mặc định của mysql
    private static final String PASS = "";// do cài đặt khi cài đặt mysql

    // trả về một kết nối
    public static Connection getConnect() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return connection;
    }
}
