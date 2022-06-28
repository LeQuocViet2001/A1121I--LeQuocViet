package repository;

import model.Sach;
import model.TheMuon;

import java.util.List;

public interface SachRepositoryImpl {

    Sach getSachById(int idSach);
    boolean addTheMuon(TheMuon theMuon);

    List<Sach> getAllSach();
}
