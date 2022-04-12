package Furama.models;

public class House extends Facility {

    private String tieuChuanPhong;
    private int soTang;

    public House(int id, String tenDichVu, double dienTichDung, double chiPhiThue, int soLuongNguoiMax, String kieuThue, String tieuChuanPhong, int soTang) {
        super(id, tenDichVu, dienTichDung, chiPhiThue, soLuongNguoiMax, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return "House{" +
                "tieuChuanPhong='" + tieuChuanPhong + '\'' +
                ", soTang=" + soTang +
                ", Id=" + Id +
                ", tenDichVu='" + tenDichVu + '\'' +
                ", dienTichDung=" + dienTichDung +
                ", chiPhiThue=" + chiPhiThue +
                ", soLuongNguoiMax=" + soLuongNguoiMax +
                ", kieuThue='" + kieuThue + '\'' +
                '}';
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }
}
