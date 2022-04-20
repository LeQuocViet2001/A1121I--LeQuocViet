package CuoiModule2.Models;

import java.io.Serializable;

public abstract class BenhAn  implements Serializable {

    private int stt;
    private String maBenhAn;
    private String tenBenhNhan;
    private String ngayNhapVien;
    private String ngayRaVien;
    private String lyDo;

    public BenhAn(int stt, String maBenhAn, String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String lyDo) {
        this.stt = stt;
        this.maBenhAn = maBenhAn;
        this.tenBenhNhan = tenBenhNhan;
        this.ngayNhapVien = ngayNhapVien;
        this.ngayRaVien = ngayRaVien;
        this.lyDo = lyDo;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public String getMaBenhAn() {
        return maBenhAn;
    }

    public void setMaBenhAn(String maBenhAn) {
        this.maBenhAn = maBenhAn;
    }

    public String getTenBenhNhan() {
        return tenBenhNhan;
    }

    public void setTenBenhNhan(String tenBenhNhan) {
        this.tenBenhNhan = tenBenhNhan;
    }

    public String getNgayNhapVien() {
        return ngayNhapVien;
    }

    public void setNgayNhapVien(String ngayNhapVien) {
        this.ngayNhapVien = ngayNhapVien;
    }

    public String getNgayRaVien() {
        return ngayRaVien;
    }

    public void setNgayRaVien(String ngayRaVien) {
        this.ngayRaVien = ngayRaVien;
    }

    public String getLyDo() {
        return lyDo;
    }

    @Override
    public String toString() {
        return  "stt=" + stt +
                ", maBenhAn=" + maBenhAn +
                ", tenBenhNhan='" + tenBenhNhan + '\'' +
                ", ngayNhapVien='" + ngayNhapVien + '\'' +
                ", ngayRaVien='" + ngayRaVien + '\'' +
                ", lyDo='" + lyDo + '\'' ;
    }

    public void setLyDo(String lyDo) {
        this.lyDo = lyDo;
    }
}
