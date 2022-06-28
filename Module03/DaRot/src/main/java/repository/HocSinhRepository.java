package repository;

import javafx.scene.layout.HBox;
import model.HocSinh;
import model.Sach;

import javax.swing.plaf.IconUIResource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HocSinhRepository implements HocSinhRepositoryImpl {

    private  final  String GET_ALL_HSINH = " SELECT * FROM endmodule.hoc_sinh; ";
    @Override
    public List<HocSinh> getListHocSinh() {
        List<HocSinh> list = new ArrayList<>();
        Connection cn = BaseRepository.getConnect();
        try {
            PreparedStatement ps = cn.prepareStatement(GET_ALL_HSINH);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                int maHSinh = rs.getInt("ma_hs");
                String tenHSinh = rs.getString("ten_hs");
                String lop = rs.getString("lop");

                HocSinh hocSinh = new HocSinh(maHSinh,tenHSinh, lop);
                System.out.println(hocSinh.toString());
                list.add(hocSinh);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return  list;
    }
}
