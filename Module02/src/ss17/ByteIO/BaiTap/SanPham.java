package ss17.ByteIO.BaiTap;

import java.io.Serializable;

public class SanPham implements Serializable {


    private int masp;
    private String name;
    private  String hang;
    private double gia;

    public int getMasp() {
        return masp;
    }

    public void setMasp(int masp) {
        this.masp = masp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    private  String mota;

    public SanPham(int masp, String name, double gia) {
        this.masp = masp;
        this.name = name;
        this.hang = "ABC";
        this.gia = gia;
        this.mota = "them sao";
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "masp=" + masp +
                ", name='" + name + '\'' +
                ", hang='" + hang + '\'' +
                ", gia=" + gia +
                ", mota='" + mota + '\'' +
                '}';
    }
}
