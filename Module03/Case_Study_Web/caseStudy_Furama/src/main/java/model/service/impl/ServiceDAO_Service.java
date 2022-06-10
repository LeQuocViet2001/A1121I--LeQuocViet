package model.service.impl;

import model.bean.Rent_Type;
import model.bean.Service;
import model.repository.impl.ServiceDAORepository;
import model.repository.inteface.IServiceDAORepository;
import model.service.IServiceDAO_Service;

import java.util.List;

public class ServiceDAO_Service implements IServiceDAO_Service {
    private IServiceDAORepository iServiceDAORepository =new ServiceDAORepository();
    @Override
    public List<Rent_Type> getListRent_Type() {
        return iServiceDAORepository.getListRent_Type();
    }

    @Override
    public boolean addService(Service service) {
        return  iServiceDAORepository.addService(service);
    }

    @Override
    public List<Service> getAllListService() {
        return  iServiceDAORepository.getAllListService();
    }
}
