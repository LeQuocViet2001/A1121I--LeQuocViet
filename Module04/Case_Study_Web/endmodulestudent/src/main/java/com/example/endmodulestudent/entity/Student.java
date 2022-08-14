package com.example.endmodulestudent.entity;


import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import java.util.Date;

@Entity
public class Student {


    @Id
//    @Pattern(regexp = "^KH\\-\\d{4}$", message = "{errorId}")
    private  String idStudent;


//    @Pattern(regexp = "^[a-zA-Z0-9\\s]+$", message = "khong chua ky tu dac biet")
    private String name;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column( columnDefinition = "date")
    private Date birthday;
    private String idCard;
    private String phonge;

    @Email(message = "{emailError}")
    private String email;
    private String address;
    private boolean gender;
    @Min(value = 0, message = "{pointError}")
    @Max(value = 100, message = "{pointError}")
    private double point;

    @ManyToOne
    @JoinColumn(name = "idClass", referencedColumnName = "idClass")
    private Class classHoc;


    public String getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhonge() {
        return phonge;
    }

    public void setPhonge(String phonge) {
        this.phonge = phonge;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    public Class getClassHoc() {
        return classHoc;
    }

    public void setClassHoc(Class classHoc) {
        this.classHoc = classHoc;
    }

    public Student() {
    }

    public Student(String idStudent, String name, Date birthday, String idCard, String phonge, String email, String address, boolean gender, double point) {
        this.idStudent = idStudent;
        this.name = name;
        this.birthday = birthday;
        this.idCard = idCard;
        this.phonge = phonge;
        this.email = email;
        this.address = address;
        this.gender = gender;
        this.point = point;
    }
}
