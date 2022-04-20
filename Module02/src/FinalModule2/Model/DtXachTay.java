package FinalModule2.Model;

import java.io.Serializable;

public class DtXachTay extends DienThoai implements Serializable {

    private String quocGia;
    private String trangThai;

    public DtXachTay(int id, String tenDienThoai, Double giaBan, int soLuong, String nhaSanXuat, String quocGia, String trangThai) {
        super(id, tenDienThoai, giaBan, soLuong, nhaSanXuat);
        this.quocGia = quocGia;
        this.trangThai = trangThai;
    }

    public String getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "DtXachTay{  " +
                super.toString()+
                "quocGia='" + quocGia + '\'' +
                ", trangThai='" + trangThai + '\'' +
                '}';
    }
}
