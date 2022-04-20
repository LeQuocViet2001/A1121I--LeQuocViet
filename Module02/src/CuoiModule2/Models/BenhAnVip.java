package CuoiModule2.Models;

import java.io.Serializable;

public class BenhAnVip  extends BenhAn  implements Serializable {
    private int loaiVip;
    private String thoiHan;

    public BenhAnVip(int stt, String maBenhAn, String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String lyDo, int loaiVip, String thoiHan) {
        super(stt, maBenhAn, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDo);
        this.loaiVip = loaiVip;
        this.thoiHan = thoiHan;
    }

    public int getLoaiVip() {
        return loaiVip;
    }

    public void setLoaiVip(int loaiVip) {
        this.loaiVip = loaiVip;
    }

    public String getThoiHan() {
        return thoiHan;
    }

    public void setThoiHan(String thoiHan) {
        this.thoiHan = thoiHan;
    }

    @Override
    public String toString() {
        return "BenhAnVip{" +
                super.toString()+
                "loaiVip='" + loaiVip + '\'' +
                ", thoiHan='" + thoiHan + '\'' +
                '}';
    }
}
