package model.repository.impl;

import model.bean.Rent_Type;
import model.bean.Service;
import model.repository.BaseRepository;
import model.repository.inteface.IServiceDAORepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ServiceDAORepository implements IServiceDAORepository {
    @Override
    public List<Rent_Type> getListRent_Type() {
        List<Rent_Type> list = new ArrayList<>();
        Connection cn = BaseRepository.getConnect();
        try {
            PreparedStatement ps = cn.prepareStatement("SELECT * FROM cg_furama.rent_type;");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int it = rs.getInt(1);
                String name = rs.getString(2);
                double cost = rs.getDouble(3);
                list.add(new Rent_Type(it, name, cost));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }

    @Override
    public boolean addService(Service service) {
        Connection cn = BaseRepository.getConnect();
        String sql = "INSERT INTO `cg_furama`.`service` ( " +
                "`service_name`, `service_area`, `service_cost`, `service_max_people`," +
                " `rent_type_id`, `service_type_id`, `standard_room`, `description_other_convenience`," +
                " `pool_area`, `number_of_floors`)" +
                " VALUES ( ? , ?, ? , ?,?,?,?,?,?,?);\n";
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, service.getService_name());
            ps.setInt(2, service.getService_area());
            ps.setDouble(3, service.getService_cost());
            ps.setInt(4, service.getService_max_people());
            ps.setInt(5, service.getRent_type_id());
            ps.setInt(6, service.getService_type_id());
            ps.setString(7, service.getStandard_room());
            ps.setString(8, service.getDescription_other_convenience());
            ps.setDouble(9, service.getPool_area());
            ps.setInt(10, service.getNumber_of_floors());

            if (ps.executeUpdate() > 0)
                return true;


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }

    @Override
    public List<Service> getAllListService() {
        Connection cn = BaseRepository.getConnect();
        List<Service> list = new ArrayList<>();
        try {
            PreparedStatement ps = cn.prepareStatement("select * from service");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int service_id = rs.getInt("service_id");
                int service_area = rs.getInt("service_area");
                int service_max_people = rs.getInt("service_max_people");
                int rent_type_id = rs.getInt("rent_type_id");
                int service_type_id = rs.getInt("service_type_id");
                int number_of_floors = rs.getInt("number_of_floors");
                double service_cost = rs.getDouble("service_cost");
                double pool_area = rs.getDouble("pool_area");

                String service_name = rs.getString("service_name");
                String standard_room = rs.getString("standard_room");
                String description_other_convenience = rs.getString("description_other_convenience");

                Service service = new Service(service_id, service_name, service_area, service_cost, service_max_people, rent_type_id, service_type_id, number_of_floors, standard_room, description_other_convenience, pool_area);
                list.add(service);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }

}
