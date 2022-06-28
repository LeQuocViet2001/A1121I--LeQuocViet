package model;

public class TheMuon {

    private  String maMuon;
    private int maSach;
    private int maHocSinh;
    private  boolean status;
    private String ngayMuon;
    private String ngayTra;

    public String getMaMuon() {
        return maMuon;
    }

    public int getMaSach() {
        return maSach;
    }

    public int getMaHocSinh() {
        return maHocSinh;
    }

    public boolean isStatus() {
        return status;
    }

    public String getNgayMuon() {
        return ngayMuon;
    }

    public String getNgayTra() {
        return ngayTra;
    }

    public TheMuon(String maMuon, int maSach, int maHocSinh, boolean status, String ngayMuon, String ngayTra) {
        this.maMuon = maMuon;
        this.maSach = maSach;
        this.maHocSinh = maHocSinh;
        this.status = status;
        this.ngayMuon = ngayMuon;
        this.ngayTra = ngayTra;
    }

    public void setNgayMuon(String ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public void setNgayTra(String ngayTra) {
        this.ngayTra = ngayTra;
    }

    @Override
    public String toString() {
        return "TheMuon{" +
                "maMuon='" + maMuon + '\'' +
                ", maSach=" + maSach +
                ", maHocSinh=" + maHocSinh +
                ", status=" + status +
                ", ngayMuon='" + ngayMuon + '\'' +
                ", ngayTra='" + ngayTra + '\'' +
                '}';
    }

    private Sach sach;
    private HocSinh hocSinh;

    public Sach getSach() {
        return sach;
    }

    public HocSinh getHocSinh() {
        return hocSinh;
    }

    public void setMaMuon(String maMuon) {
        this.maMuon = maMuon;
    }

    public void setMaSach(int maSach) {
        this.maSach = maSach;
    }

    public void setMaHocSinh(int maHocSinh) {
        this.maHocSinh = maHocSinh;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setSach(Sach sach) {
        this.sach = sach;
    }

    public void setHocSinh(HocSinh hocSinh) {
        this.hocSinh = hocSinh;
    }

    public TheMuon(String maMuon, int maSach, int maHocSinh, boolean status, String ngayMuon, String ngayTra, Sach sach, HocSinh hocSinh) {
        this.maMuon = maMuon;
        this.maSach = maSach;
        this.maHocSinh = maHocSinh;
        this.status = status;
        this.ngayMuon = ngayMuon;
        this.ngayTra = ngayTra;
        this.sach = sach;
        this.hocSinh = hocSinh;
    }
}
