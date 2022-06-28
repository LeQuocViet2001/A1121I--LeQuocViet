package model;

public class SanPham {

    private int id;
    private  String ten;
    private int soLuong;
    private double gia;
    private String mauSac;
    private String moTa;
    private int idMuc;



    public int getId() {
        return id;
    }

    public String getTen() {
        return ten;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public double getGia() {
        return gia;
    }

    public String getMauSac() {
        return mauSac;
    }

    public String getMoTa() {
        return moTa;
    }

    public int getIdMuc() {
        return idMuc;
    }

    public SanPham(int id, String ten, int soLuong, double gia, String mauSac, String moTa, int idMuc) {
        this.id = id;
        this.ten = ten;
        this.soLuong = soLuong;
        this.gia = gia;
        this.mauSac = mauSac;
        this.moTa = moTa;
        this.idMuc = idMuc;
    }


    @Override
    public String toString() {
        return "SanPham{" +
                "id=" + id +
                ", ten='" + ten + '\'' +
                ", soLuong=" + soLuong +
                ", gia=" + gia +
                ", mauSac='" + mauSac + '\'' +
                ", moTa='" + moTa + '\'' +
                ", idMuc=" + idMuc +
                '}';
    }
}
