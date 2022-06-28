package repository;

import model.Category;
import model.SanPham;

import java.util.List;

public interface SanPhamRepositoryImpl {

    List<SanPham> getAllListSanPham();
    List<Category> getAllListDanhMuc();

    SanPham getSanPham( int id);
    boolean addSanPham(SanPham sanPham);
    boolean editSanPham(SanPham sanPham);
    boolean delSanPham(int id);

    List<SanPham> getListSearch(String searchName);


}
