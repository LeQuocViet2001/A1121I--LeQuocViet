package Furama.models;

import java.io.Serializable;

public class Customer extends Person implements Serializable  {


   private String loaiKhach;
   private String diaChi;

    public String getLoaiKhach() {
        return loaiKhach;
    }

    public void setLoaiKhach(String loaiKhach) {
        this.loaiKhach = loaiKhach;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public Customer(int id, String hoTen, int tuoi, boolean gioiTinh, long soDT, String email, String loaiKhach, String diaChi) {
        super(id, hoTen, tuoi, gioiTinh, soDT, email);
        this.loaiKhach = loaiKhach;
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "Customer{" +
                super.toString() + '\'' +
                "loaiKhach='" + loaiKhach + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}
