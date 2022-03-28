package Furama.models;

public class Room extends Facility {

    private String dichVuDiKem;

    public Room(String tenDichVu, String dienTichDung, double chiPhiThue, int soLuongNguoiMax, String kieuThue, String dichVuDiKem) {
        super(tenDichVu, dienTichDung, chiPhiThue, soLuongNguoiMax, kieuThue);
        this.dichVuDiKem = dichVuDiKem;
    }

    public String getDichVuDiKem() {
        return dichVuDiKem;
    }

    public void setDichVuDiKem(String dichVuDiKem) {
        this.dichVuDiKem = dichVuDiKem;
    }
}
