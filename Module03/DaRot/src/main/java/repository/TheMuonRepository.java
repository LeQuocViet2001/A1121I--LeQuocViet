package repository;

import model.HocSinh;
import model.Sach;
import model.TheMuon;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TheMuonRepository  implements TheMuonRepositoryImpl{

    private final String GET_ALL = "select  t.*, h.ten_hs, h.lop, s.ten_sach, s.tac_gia, s.mo_ta, s.so_luong\n" +
            "from the_muon_sach t \n" +
            "inner join hoc_sinh h on  h.ma_hs = t.ma_hs\n" +
            "inner join sach s on s.ma_sach = t.ma_sach";

    private final String GET_THE_BYID = "select  t.*, h.ten_hs, h.lop, s.ten_sach, s.tac_gia, s.mo_ta, s.so_luong\n" +
            "from the_muon_sach t \n" +
            "inner join hoc_sinh h on  h.ma_hs = t.ma_hs\n" +
            "inner join sach s on s.ma_sach = t.ma_sach where t.ma_muon_sach = ?";

    private final String TRA_SACH = "call tra_sach( ?, ?);";

    private final String SEARCH = "select  t.*, h.ten_hs, h.lop, s.ten_sach, s.tac_gia, s.mo_ta, s.so_luong\n" +
            "from the_muon_sach t \n" +
            "inner join hoc_sinh h on  h.ma_hs = t.ma_hs\n" +
            "inner join sach s on s.ma_sach = t.ma_sach where t.ma_sach like ? and  t.ma_hs like ? and  s.tac_gia like ?";

    @Override
    public List<TheMuon> getListAll() {
        Connection cm = BaseRepository.getConnect();
        List<TheMuon> list = new ArrayList<>();
        try {
            PreparedStatement ps = cm.prepareStatement(GET_ALL);
            ResultSet rs = ps.executeQuery();

            while (rs.next()){

                String maMuonSach = rs.getString("ma_muon_sach");
                int maSach = rs.getInt("ma_sach");
                int maHSinh = rs.getInt("ma_hs");
                boolean status = rs.getBoolean("trang_thau");
                String ngayTra = rs.getString("ngay_tra");
                String ngayMuon = rs.getString("ngay_muon");


                String tenHsinh = rs.getString("ten_hs");
                String lop = rs.getString("lop");
                HocSinh hocSinh = new HocSinh(maHSinh, tenHsinh,lop );

                String ten_sach = rs.getString("ten_sach");
                String tac_gia = rs.getString("tac_gia");
                String mo_ta = rs.getString("mo_ta");
                int so_luong = rs.getInt("so_luong");

                Sach sach = new Sach(maSach, ten_sach,tac_gia,mo_ta,so_luong );

                TheMuon theMuon = new TheMuon(maMuonSach,maSach,maHSinh,status,ngayMuon,ngayTra,sach,hocSinh );
                list.add(theMuon);

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
            return list;
    }

    @Override
    public TheMuon getById(String id) {
        Connection cm = BaseRepository.getConnect();
        try {
            PreparedStatement ps = cm.prepareStatement(GET_THE_BYID);
            ps.setString(1,id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()){

                String maMuonSach = rs.getString("ma_muon_sach");
                int maSach = rs.getInt("ma_sach");
                int maHSinh = rs.getInt("ma_hs");
                boolean status = rs.getBoolean("trang_thau");
                String ngayTra = rs.getString("ngay_tra");
                String ngayMuon = rs.getString("ngay_muon");


                String tenHsinh = rs.getString("ten_hs");
                String lop = rs.getString("lop");
                HocSinh hocSinh = new HocSinh(maHSinh, tenHsinh,lop );

                String ten_sach = rs.getString("ten_sach");
                String tac_gia = rs.getString("tac_gia");
                String mo_ta = rs.getString("mo_ta");
                int so_luong = rs.getInt("so_luong");

                Sach sach = new Sach(maSach, ten_sach,tac_gia,mo_ta,so_luong );

                TheMuon theMuon = new TheMuon(maMuonSach,maSach,maHSinh,status,ngayMuon,ngayTra,sach,hocSinh );
                return  theMuon;

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean traSach(String maMuon, int maSach) {
        Connection cn = BaseRepository.getConnect();
        try {
            CallableStatement call = cn.prepareCall(TRA_SACH);
            call.setString(1,maMuon);
            call.setInt(2,maSach);
            if( call.executeUpdate() > 0 ) return  true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return  false;
    }

    @Override
    public List<TheMuon> searchTheMuon(String searchHocSinh, String searchSach, String searchTacGia) {
        Connection cm = BaseRepository.getConnect();
        List<TheMuon> list = new ArrayList<>();
        try {
            PreparedStatement ps = cm.prepareStatement(SEARCH);
            ps.setString(1, "%"+  searchSach.trim() + "%");
            ps.setString(2, "%"+  searchHocSinh.trim()+ "%");

            ps.setString(3, "%"+  searchTacGia.trim() + "%");

            ResultSet rs = ps.executeQuery();

            while (rs.next()){

                String maMuonSach = rs.getString("ma_muon_sach");
                int maSach = rs.getInt("ma_sach");
                int maHSinh = rs.getInt("ma_hs");
                boolean status = rs.getBoolean("trang_thau");
                String ngayTra = rs.getString("ngay_tra");
                String ngayMuon = rs.getString("ngay_muon");


                String tenHsinh = rs.getString("ten_hs");
                String lop = rs.getString("lop");
                HocSinh hocSinh = new HocSinh(maHSinh, tenHsinh,lop );

                String ten_sach = rs.getString("ten_sach");
                String tac_gia = rs.getString("tac_gia");
                String mo_ta = rs.getString("mo_ta");
                int so_luong = rs.getInt("so_luong");

                Sach sach = new Sach(maSach, ten_sach,tac_gia,mo_ta,so_luong );

                TheMuon theMuon = new TheMuon(maMuonSach,maSach,maHSinh,status,ngayMuon,ngayTra,sach,hocSinh );
                list.add(theMuon);

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }
}
