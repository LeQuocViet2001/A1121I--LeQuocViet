package Furama.models;

public class House extends Facility {

    private String tieuChuanPhong;
    private int soTang;

    public House(String tenDichVu, String dienTichDung, double chiPhiThue, int soLuongNguoiMax, String kieuThue, String tieuChuanPhong, int soTang) {
        super(tenDichVu, dienTichDung, chiPhiThue, soLuongNguoiMax, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.soTang = soTang;
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
