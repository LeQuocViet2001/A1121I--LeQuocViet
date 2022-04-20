package FinalModule2.Model;

import java.io.Serializable;

public class DtChinhHang extends DienThoai implements Serializable {
    private int baoHanh;
    private String phamViBaoHanh;

    public DtChinhHang(int id, String tenDienThoai, Double giaBan, int soLuong, String nhaSanXuat, int baoHanh, String phamViBaoHanh) {
        super(id, tenDienThoai, giaBan, soLuong, nhaSanXuat);
        this.baoHanh = baoHanh;
        this.phamViBaoHanh = phamViBaoHanh;
    }

    public int getBaoHanh() {
        return baoHanh;
    }

    public void setBaoHanh(int baoHanh) {
        this.baoHanh = baoHanh;
    }

    public String getPhamViBaoHanh() {
        return phamViBaoHanh;
    }

    public void setPhamViBaoHanh(String phamViBaoHanh) {
        this.phamViBaoHanh = phamViBaoHanh;
    }

    @Override
    public String toString() {
        return "DtChinhHang{" +
                super.toString()+
                "baoHanh=" + baoHanh +
                ", phamViBaoHanh='" + phamViBaoHanh + '\'' +
                '}';
    }
}
