package model.service;

import model.bean.Rent_Type;
import model.bean.Service;

import java.util.List;

public interface IServiceDAO_Service {

    List<Rent_Type> getListRent_Type();
    boolean addService(Service service);
    List<Service> getAllListService();

}
