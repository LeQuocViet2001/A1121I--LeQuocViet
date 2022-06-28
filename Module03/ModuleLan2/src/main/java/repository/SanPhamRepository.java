package repository;

import model.Category;
import model.SanPham;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SanPhamRepository  implements SanPhamRepositoryImpl{

    private  final  String GET_ALL_SANPHAM = "SELECT * FROM lan2.san_pham;";
    private  final  String GET_ALL_DANHMUC = "SELECT * FROM lan2.danh_muc;";
    private  final  String ADD_NOTE = "INSERT INTO `lan2`.`san_pham` ( `ten`, `so_luong`, `gia`, `mau_sac`, `mo_ta`, `id_muc`)" +
            " VALUES ( ?,?,?,?,?,?);";

    private final  String DEL_SPHAM = " DELETE FROM `lan2`.`san_pham` WHERE (`id` = ?); ";
    private final  String GET_LIST_SEARCH = " SELECT * FROM lan2.san_pham where ten like  ? ;";
    private final  String GET_SP_BY_ID = " SELECT * FROM lan2.san_pham where id = ? ;";

    private final  String EDIT_SPHAM = " UPDATE `lan2`.`san_pham` SET " +
            "`ten` = ?, `so_luong` = ?, `gia` = ?," +
            " `mau_sac` = ?, `mo_ta` = ?, `id_muc` = ? WHERE (`id` = ?  );  ";

    @Override
    public List<SanPham> getAllListSanPham() {
        List<SanPham> list = new ArrayList<>();
        Connection cn = BaseRepository.getConnect();
        try {
            PreparedStatement ps = cn.prepareStatement(GET_ALL_SANPHAM);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id");
                String ten = rs.getString("ten");
                int soLuong = rs.getInt("so_luong");
                double gia = rs.getDouble("gia");
                String mausac = rs.getString("mau_sac");
                String mota = rs.getString("mo_ta");
                int idMuc = rs.getInt("id_muc");

                SanPham sanPham = new SanPham(id,ten,soLuong,gia,mausac,mota,idMuc);
                        System.out.println(sanPham.toString());
                list.add(sanPham);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return  list;


    }

    @Override
    public List<Category> getAllListDanhMuc() {
        List<Category> list = new ArrayList<>();
        Connection cn = BaseRepository.getConnect();
        try {
            PreparedStatement ps = cn.prepareStatement(GET_ALL_DANHMUC);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id_muc");
                String ten = rs.getString("ten_muc");

                Category category = new Category(id,ten);
                list.add(category);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return  list;
    }

    @Override
    public SanPham getSanPham(int ids) {
        Connection cn = BaseRepository.getConnect();
        try {
            PreparedStatement ps = cn.prepareStatement(GET_SP_BY_ID);
            ps.setInt(1, ids);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id");
                String ten = rs.getString("ten");
                int soLuong = rs.getInt("so_luong");
                double gia = rs.getDouble("gia");
                String mausac = rs.getString("mau_sac");
                String mota = rs.getString("mo_ta");
                int idMuc = rs.getInt("id_muc");

                SanPham sanPham = new SanPham(id,ten,soLuong,gia,mausac,mota,idMuc);
                System.out.println(sanPham.toString());
                return  sanPham;
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return  null;

    }

    @Override
    public boolean addSanPham(SanPham sanPham) {

        Connection cn = BaseRepository.getConnect();
        try {
            PreparedStatement ps = cn.prepareStatement(ADD_NOTE);

            ps.setString(1, sanPham.getTen());
            ps.setInt(2, sanPham.getSoLuong());
            ps.setDouble(3, sanPham.getGia());
            ps.setString(4,sanPham.getMauSac());
            ps.setString(5,sanPham.getMoTa());
            ps.setInt(6, sanPham.getIdMuc());

            return (ps.executeUpdate()>0)? true: false;


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;

    }

    @Override
    public boolean editSanPham(SanPham sanPham) {
        Connection cn = BaseRepository.getConnect();
        try {
            PreparedStatement ps  = cn.prepareStatement(EDIT_SPHAM);
            ps.setString(1, sanPham.getTen());
            ps.setInt(2,sanPham.getSoLuong());
            ps.setDouble(3, sanPham.getGia() );

            ps.setString(4, sanPham.getMauSac());
            ps.setString(5, sanPham.getMoTa());

            ps.setInt(6 ,sanPham.getIdMuc());
            ps.setInt(7 , sanPham.getId() );

            if( ps.executeUpdate() > 0) return true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delSanPham(int id) {

        Connection cn = BaseRepository.getConnect();
        try {
            PreparedStatement ps = cn.prepareStatement(DEL_SPHAM);
            ps.setInt(1,id);
            return  (ps.executeUpdate()>0) ? true: false;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return false;
    }

    @Override
    public List<SanPham> getListSearch(String searchName) {
        List<SanPham> list = new ArrayList<>();
        Connection cn = BaseRepository.getConnect();
        try {
            PreparedStatement ps = cn.prepareStatement(GET_LIST_SEARCH);
            ps.setString(1, "%"+searchName  + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id");
                String ten = rs.getString("ten");
                int soLuong = rs.getInt("so_luong");
                double gia = rs.getDouble("gia");
                String mausac = rs.getString("mau_sac");
                String mota = rs.getString("mo_ta");
                int idMuc = rs.getInt("id_muc");

                SanPham sanPham = new SanPham(id,ten,soLuong,gia,mausac,mota,idMuc);
                System.out.println(sanPham.toString());
                list.add(sanPham);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return  list;
    }
}
