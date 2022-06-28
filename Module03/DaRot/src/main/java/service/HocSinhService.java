package service;

import model.HocSinh;
import repository.HocSinhRepository;
import repository.HocSinhRepositoryImpl;

import java.util.List;

public class HocSinhService  implements  HocSinhServiceImpl{
    private HocSinhRepositoryImpl hocSinhRepository = new HocSinhRepository();


    @Override
    public List<HocSinh> getListHocSinh() {
        return  hocSinhRepository.getListHocSinh();
    }
}
