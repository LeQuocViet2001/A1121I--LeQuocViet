package repository;

import model.Sach;
import model.TheMuon;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SachRepository implements SachRepositoryImpl {
    private final  String  GET_ALL = " SELECT * FROM endmodule.sach; ";
    private final  String  GET_SACH_BY_ID = " SELECT * FROM endmodule.sach where ma_sach = ? ; ";
    private final  String  ADD_THE_MUON = " INSERT INTO `endmodule`.`the_muon_sach` (`ma_muon_sach`, `ma_sach`, `ma_hs`," +
            " `trang_thau`, `ngay_muon`, `ngay_tra`) " +
            "VALUES ( ?, ?, ?,?,?,? ); ";

    @Override
    public Sach getSachById(int idSach) {
        Connection cn = BaseRepository.getConnect();
        try {
            PreparedStatement ps = cn.prepareStatement(GET_SACH_BY_ID);
            ps.setInt(1,idSach);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                int maSachch = rs.getInt("ma_sach");
                String tenSach = rs.getString("ten_sach");
                String tacGia = rs.getString("tac_gia");
                String moTa = rs.getString("mo_ta");
                int soLuong = rs.getInt("so_luong");

                Sach sach = new Sach(maSachch,tenSach,tacGia,moTa,soLuong);
                System.out.println(sach.toString());
                return  sach;

            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return  null;
    }

    @Override
    public boolean addTheMuon(TheMuon theMuon) {
        Connection cn = BaseRepository.getConnect();
        try {
            PreparedStatement ps = cn.prepareStatement(ADD_THE_MUON);

            ps.setString(1, theMuon.getMaMuon());
            ps.setInt(2,theMuon.getMaSach());
            ps.setInt(3,theMuon.getMaHocSinh());
            ps.setBoolean(4,theMuon.isStatus());
            ps.setString(5 ,theMuon.getNgayMuon());
            ps.setString(6,  theMuon.getNgayTra());


            return (ps.executeUpdate()>0)? true: false;


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }

    @Override
    public List<Sach> getAllSach() {
        List<Sach> list = new ArrayList<>();
        Connection cn = BaseRepository.getConnect();
        try {
            PreparedStatement ps = cn.prepareStatement(GET_ALL);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                int maSachch = rs.getInt("ma_sach");
                String tenSach = rs.getString("ten_sach");
                String tacGia = rs.getString("tac_gia");
                String moTa = rs.getString("mo_ta");
                int soLuong = rs.getInt("so_luong");

                Sach sach = new Sach(maSachch,tenSach,tacGia,moTa,soLuong);
                System.out.println(sach.toString());

                list.add(sach);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return  list;


    }
}
