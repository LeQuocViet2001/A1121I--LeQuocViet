package com.example.endmodulestudent.entity;


import javax.persistence.*;
import java.util.List;

@Entity
public class Class {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idClass;
    private String nameClass;
    private int khoaClass;

    @OneToMany(cascade = CascadeType.ALL
    ,mappedBy ="classHoc")
    private List<Student> studentList;



    public Class() {
    }

    public int getIdClass() {
        return idClass;
    }

    public void setIdClass(int idClass) {
        this.idClass = idClass;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public int getKhoaClass() {
        return khoaClass;
    }

    public void setKhoaClass(int khoaClass) {
        this.khoaClass = khoaClass;
    }

    public Class(int idClass, String nameClass, int khoaClass) {
        this.idClass = idClass;
        this.nameClass = nameClass;
        this.khoaClass = khoaClass;
    }
}
