package Furama.models;

import java.io.Serializable;

public class Employee extends Person implements Serializable {
    private String trinhDo;
    private  String viTri;
    private double luong;

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public Employee(int id, String hoTen, int tuoi, boolean gioiTinh, long soDT, String email, String trinhDo, String viTri, double luong) {
        super(id, hoTen, tuoi, gioiTinh, soDT, email);
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "Employee{" +
                super.toString() + '\'' +
                "trinhDo='" + trinhDo + '\'' +
                ", viTri='" + viTri + '\'' +
                ", luong=" + luong +
                '}';
    }
}

