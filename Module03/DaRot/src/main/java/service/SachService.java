package service;

import model.Sach;
import model.TheMuon;
import repository.SachRepository;
import repository.SachRepositoryImpl;

import java.util.List;

public class SachService implements SachServiceImpl  {
    private SachRepositoryImpl sachRepository = new SachRepository();
    @Override
    public List<Sach> getAllSach() {
        return sachRepository.getAllSach();
    }

    @Override
    public Sach getSachById(int idSach) {
        return sachRepository.getSachById(idSach);
    }

    @Override
    public boolean addTheMuon(TheMuon theMuon) {
        return  sachRepository.addTheMuon(theMuon);
    }
}

