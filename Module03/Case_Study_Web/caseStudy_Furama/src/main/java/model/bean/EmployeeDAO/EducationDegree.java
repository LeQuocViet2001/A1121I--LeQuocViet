package model.bean.EmployeeDAO;

import model.bean.ObjectType2Filed;

public class EducationDegree  extends ObjectType2Filed {
    public EducationDegree(int id, String name) {
        super(id, name);
    }

    public int getEducationDegreeId() {
        return super.getId();
    }

    public String getEducationDegreeName() {
        return super.getName();
    }
}
