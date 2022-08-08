package model.repository.impl;

import model.bean.ObjectType2Filed;
import model.repository.BaseRepository;
import model.repository.inteface.IOpject2FieldRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Opject2FieldRepository implements IOpject2FieldRepository {

    @Override
    public List<ObjectType2Filed> getAllList2Field(String nameTable) {
        List<ObjectType2Filed> objectList = new ArrayList<>();
        Connection cn = BaseRepository.getConnect();
        PreparedStatement ps = null;
        try {
            ps = cn.prepareStatement("select * from " + nameTable);
//            ps.setString(1,nameTable);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                objectList.add(new ObjectType2Filed(id, name));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


        return objectList;
    }
}
