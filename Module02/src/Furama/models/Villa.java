package Furama.models;

public class Villa extends Facility {

    private String tieuChuanPhong ;
    private double dienTichHoBoi ;
    private int soTang ;

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public double getDienTichHoBoi() {
        return dienTichHoBoi;
    }

    public void setDienTichHoBoi(double dienTichHoBoi) {
        this.dienTichHoBoi = dienTichHoBoi;
    }

    public int getSoTang() {
        return soTang;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "tieuChuanPhong='" + tieuChuanPhong + '\'' +
                ", dienTichHoBoi=" + dienTichHoBoi +
                ", soTang=" + soTang +
                ", Id=" + Id +
                ", tenDichVu='" + tenDichVu + '\'' +
                ", dienTichDung=" + dienTichDung +
                ", chiPhiThue=" + chiPhiThue +
                ", soLuongNguoiMax=" + soLuongNguoiMax +
                ", kieuThue='" + kieuThue + '\'' +
                '}';
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    public Villa(int id, String tenDichVu, double dienTichDung, double chiPhiThue, int soLuongNguoiMax, String kieuThue, String tieuChuanPhong, double dienTichHoBoi, int soTang) {
        super(id, tenDichVu, dienTichDung, chiPhiThue, soLuongNguoiMax, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.dienTichHoBoi = dienTichHoBoi;
        this.soTang = soTang;
    }
}
