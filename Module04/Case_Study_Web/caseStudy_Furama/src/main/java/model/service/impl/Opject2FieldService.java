package model.service.impl;

import model.bean.Customer;
import model.bean.CustomerType;
import model.bean.EmployeeDAO.Division;
import model.bean.EmployeeDAO.EducationDegree;
import model.bean.EmployeeDAO.Position;
import model.bean.EmployeeDAO.Role;
import model.bean.ObjectType2Filed;
import model.bean.Service_type;
import model.repository.impl.Opject2FieldRepository;
import model.repository.inteface.IOpject2FieldRepository;
import model.service.IOpject2FieldService;

import java.util.ArrayList;
import java.util.List;

public class Opject2FieldService implements IOpject2FieldService {
    private IOpject2FieldRepository iOpjectRepository = new Opject2FieldRepository();

    @Override
    public List<ObjectType2Filed> getAllList2Field(String nameTable) {
        return iOpjectRepository.getAllList2Field(nameTable);
    }

    @Override
    public List<CustomerType> getAllListCustomer() {
        List<CustomerType> customerList = new ArrayList<>();
        for (ObjectType2Filed tmp :
                getAllList2Field("customer_type")
        ) {
            customerList.add(new CustomerType(tmp.getId(), tmp.getName()));

        }
        return customerList;
    }

    @Override
    public List<Division> getAllListDivison() {
        List<Division> customerList = new ArrayList<>();
        for (ObjectType2Filed tmp :
                getAllList2Field("division")
        ) {
            customerList.add(new Division(tmp.getId(), tmp.getName()));

        }
        return customerList;
    }

    @Override
    public List<Position> getAllListPositon() {
        List<Position> customerList = new ArrayList<>();
        for (ObjectType2Filed tmp :
                getAllList2Field("positions")
        ) {
            customerList.add(new Position(tmp.getId(), tmp.getName()));

        }
        return customerList;
    }

    @Override
    public List<Role> getListRole(int i) {
        List<Role> customerList = new ArrayList<>();
        for (ObjectType2Filed tmp :
                getAllList2Field("role")
        ) {

            if (tmp.getId() <= i)
                customerList.add(new Role(tmp.getId(), tmp.getName()));

        }
        return customerList;
    }

    @Override
    public List<EducationDegree> getAllListEducationDegree() {
        List<EducationDegree> customerList = new ArrayList<>();
        for (ObjectType2Filed tmp :
                getAllList2Field("education_degree")
        ) {
            customerList.add(new EducationDegree(tmp.getId(), tmp.getName()));

        }
        return customerList;
    }

    @Override
    public List<Service_type> getListService_type() {
        List<Service_type> customerList = new ArrayList<>();
        for (ObjectType2Filed tmp :
                getAllList2Field("education_degree")
        ) {
            customerList.add(new Service_type(tmp.getId(), tmp.getName()));

        }
        return customerList;
    }


}
