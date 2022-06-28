package model;

public class HocSinh {

    private int maHocSinh;
    private  String ten;
    private  String lop;

    public HocSinh(int maHocSinh, String ten, String lop) {
        this.maHocSinh = maHocSinh;
        this.ten = ten;
        this.lop = lop;
    }

    public void setMaHocSinh(int maHocSinh) {
        this.maHocSinh = maHocSinh;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public int getMaHocSinh() {
        return maHocSinh;
    }

    public String getTen() {
        return ten;
    }

    public String getLop() {
        return lop;
    }

    @Override
    public String toString() {
        return "HocSinhRepositoryImpl{" +
                "maHocSinh=" + maHocSinh +
                ", ten='" + ten + '\'' +
                ", lop='" + lop + '\'' +
                '}';
    }
}
