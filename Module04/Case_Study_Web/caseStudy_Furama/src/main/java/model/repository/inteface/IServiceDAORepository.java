package model.repository.inteface;

import model.bean.Rent_Type;
import model.bean.Service;

import java.util.List;

public interface IServiceDAORepository {
    List<Rent_Type> getListRent_Type();

    boolean addService(Service service);

    List<Service> getAllListService();
}
