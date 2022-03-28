package Furama.models;

public abstract class Facility {



     public String tenDichVu;
     public String dienTichDung;
     public double chiPhiThue;
     public int soLuongNguoiMax;
     public String kieuThue;

    public Facility(String tenDichVu, String dienTichDung, double chiPhiThue, int soLuongNguoiMax, String kieuThue) {
        this.tenDichVu = tenDichVu;
        this.dienTichDung = dienTichDung;
        this.chiPhiThue = chiPhiThue;
        this.soLuongNguoiMax = soLuongNguoiMax;
        this.kieuThue = kieuThue;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public String getDienTichDung() {
        return dienTichDung;
    }

    public void setDienTichDung(String dienTichDung) {
        this.dienTichDung = dienTichDung;
    }

    public double getChiPhiThue() {
        return chiPhiThue;
    }

    public void setChiPhiThue(double chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
    }

    public int getSoLuongNguoiMax() {
        return soLuongNguoiMax;
    }

    public void setSoLuongNguoiMax(int soLuongNguoiMax) {
        this.soLuongNguoiMax = soLuongNguoiMax;
    }

    public String getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(String kieuThue) {
        this.kieuThue = kieuThue;
    }
}
