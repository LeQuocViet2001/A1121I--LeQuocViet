package model.bean.EmployeeDAO;

import model.bean.ObjectType2Filed;

public class Division extends ObjectType2Filed {
    public Division(int id, String name) {
        super(id, name);
    }


    public int getDivisionId() {
        return super.getId();
    }


    public String getDivisionName() {
        return super.getName();
    }
}
