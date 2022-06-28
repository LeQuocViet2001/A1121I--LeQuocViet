package service;

import model.Category;
import model.SanPham;
import repository.SanPhamRepository;
import repository.SanPhamRepositoryImpl;

import java.util.List;

public class SanPhamService implements  SanPhamServiceImpl{
    private SanPhamRepositoryImpl sanPhamRepository = new SanPhamRepository();
    @Override
    public List<SanPham> getAllListSanPham() {
        return sanPhamRepository.getAllListSanPham();
    }

    @Override
    public List<Category> getAllListDanhMuc() {
        return sanPhamRepository.getAllListDanhMuc();
    }

    @Override
    public SanPham getSanPham(int id) {
        return sanPhamRepository.getSanPham(id);
    }

    @Override
    public boolean addSanPham(SanPham sanPham) {
        return sanPhamRepository.addSanPham(sanPham);
    }

    @Override
    public boolean editSanPham(SanPham sanPham) {
        return sanPhamRepository.editSanPham(sanPham);
    }

    @Override
    public boolean delSanPham(int id) {
        return  sanPhamRepository.delSanPham(id);
    }

    @Override
    public List<SanPham> getListSearch(String searchName) {
        return  sanPhamRepository.getListSearch(searchName);
    }
}
