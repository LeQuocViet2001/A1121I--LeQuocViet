package Furama.models;

import java.io.Serializable;

public class Person implements Serializable {
    private int id;
    private String hoTen;
    private int tuoi;
    private boolean gioiTinh;
    private long soDT;
    private String email;

    public Person(int id, String hoTen, int tuoi, boolean gioiTinh,  long soDT, String email) {
        this.id = id;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.soDT = soDT;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", hoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", gioiTinh=" + gioiTinh +
                ", soDT=" + soDT +
                ", email='" + email + '\'';
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }



    public long getSoDT() {
        return soDT;
    }

    public void setSoDT(long soDT) {
        this.soDT = soDT;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
