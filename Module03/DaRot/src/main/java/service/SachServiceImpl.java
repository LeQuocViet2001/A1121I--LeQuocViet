package service;

import model.Sach;
import model.TheMuon;

import java.util.List;

public interface SachServiceImpl {
    List<Sach> getAllSach();

    Sach getSachById(int idSach);

    boolean addTheMuon(TheMuon theMuon);
}
