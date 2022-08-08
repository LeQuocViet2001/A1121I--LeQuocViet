package model.service;

import model.bean.Customer;
import model.bean.CustomerType;
import model.bean.EmployeeDAO.Division;
import model.bean.EmployeeDAO.EducationDegree;
import model.bean.EmployeeDAO.Position;
import model.bean.EmployeeDAO.Role;
import model.bean.ObjectType2Filed;
import model.bean.Service_type;

import java.util.List;

public interface IOpject2FieldService {
    List<ObjectType2Filed> getAllList2Field(String nameTable);

    List<CustomerType> getAllListCustomer();

    List<Division> getAllListDivison();

    List<Position> getAllListPositon();

    List<Role> getListRole(int i);

    List<EducationDegree> getAllListEducationDegree();

    List<Service_type> getListService_type();


}
