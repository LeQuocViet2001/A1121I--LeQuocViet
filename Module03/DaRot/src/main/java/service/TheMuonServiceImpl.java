package service;

import model.TheMuon;

import java.util.List;

public interface TheMuonServiceImpl {

    List<TheMuon> getListAll();
    TheMuon getById(String id);

    boolean traSach(String maMuon, int maSach);

    List<TheMuon> searchTheMuon(String searchHocSinh, String searchSach, String searchTacGia);
}
