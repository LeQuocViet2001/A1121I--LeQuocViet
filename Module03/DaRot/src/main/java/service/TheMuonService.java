package service;

import model.TheMuon;
import repository.TheMuonRepository;
import repository.TheMuonRepositoryImpl;

import java.util.List;

public class TheMuonService implements TheMuonServiceImpl {
    private TheMuonRepositoryImpl theMuonRepository = new TheMuonRepository();
    @Override
    public List<TheMuon> getListAll() {
      return    theMuonRepository.getListAll();
    }

    @Override
    public TheMuon getById(String id) {
        return  theMuonRepository.getById(id);
    }

    @Override
    public boolean traSach(String maMuon, int maSach) {
        return theMuonRepository.traSach(maMuon,maSach);
    }

    @Override
    public List<TheMuon> searchTheMuon(String searchHocSinh, String searchSach, String searchTacGia) {
        return  theMuonRepository.searchTheMuon(searchHocSinh,searchSach,searchTacGia);
    }
}
