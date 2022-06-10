package model.bean.EmployeeDAO;

import model.bean.ObjectType2Filed;

public class Position extends ObjectType2Filed {


    public Position(int id, String name) {
        super(id, name);
    }


    public int getPosition_id() {
        return super.getId();
    }


    public String getPosition_name() {
        return super.getName();
    }
}
