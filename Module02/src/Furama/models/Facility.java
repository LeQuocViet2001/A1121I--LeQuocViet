package Furama.models;

import Furama.service.utils.ReadandWrite;

import java.io.Serializable;

public abstract class Facility implements Serializable {


     public int Id;
     public String tenDichVu;
     public double dienTichDung;
     public double chiPhiThue;
     public int soLuongNguoiMax;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String kieuThue;

    public Facility(int id, String tenDichVu, double dienTichDung, double chiPhiThue, int soLuongNguoiMax, String kieuThue) {
        Id = id;
        this.tenDichVu = tenDichVu;
        this.dienTichDung = dienTichDung;
        this.chiPhiThue = chiPhiThue;
        this.soLuongNguoiMax = soLuongNguoiMax;
        this.kieuThue = kieuThue;
    }




    public String getTenDichVu() {
        return tenDichVu;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "Id=" + Id +
                ", tenDichVu='" + tenDichVu + '\'' +
                ", dienTichDung=" + dienTichDung +
                ", chiPhiThue=" + chiPhiThue +
                ", soLuongNguoiMax=" + soLuongNguoiMax +
                ", kieuThue='" + kieuThue + '\'' +
                '}';
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public double getDienTichDung() {
        return dienTichDung;
    }

    public void setDienTichDung(double dienTichDung) {
        this.dienTichDung = dienTichDung;
    }

    public double getChiPhiThue() {
        return chiPhiThue;
    }

    public void setChiPhiThue(double chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
    }

    public int getSoLuongNguoiMax() {
        return soLuongNguoiMax;
    }

    public void setSoLuongNguoiMax(int soLuongNguoiMax) {
        this.soLuongNguoiMax = soLuongNguoiMax;
    }

    public String getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(String kieuThue) {
        this.kieuThue = kieuThue;
    }
}
