package CuoiModule2.Models;

import java.io.Serializable;

public class BenhAnThuong extends BenhAn implements Serializable {

    private double phiNamVien ;

    public BenhAnThuong(int stt, String maBenhAn, String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String lyDo, double phiNamVien) {
        super(stt, maBenhAn, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDo);
        this.phiNamVien = phiNamVien;
    }


    public double getPhiNamVien() {
        return phiNamVien;
    }

    public void setPhiNamVien(double phiNamVien) {
        this.phiNamVien = phiNamVien;
    }

    @Override
    public String toString() {
        return "BenhAnThuong{" +
                super.toString()+
                "phiNamVien=" + phiNamVien +
                '}';
    }
}
