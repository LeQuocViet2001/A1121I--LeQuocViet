package Furama.models;

public class Room extends Facility {

    private String dichVuDiKem;


    public Room(int id, String tenDichVu, double dienTichDung, double chiPhiThue, int soLuongNguoiMax, String kieuThue, String dichVuDiKem) {
        super(id, tenDichVu, dienTichDung, chiPhiThue, soLuongNguoiMax, kieuThue);
        this.dichVuDiKem = dichVuDiKem;
    }

    public String getDichVuDiKem() {
        return dichVuDiKem;
    }

    @Override
    public String toString() {
        return "Room{" +
                "dichVuDiKem='" + dichVuDiKem + '\'' +
                ", Id=" + Id +
                ", tenDichVu='" + tenDichVu + '\'' +
                ", dienTichDung=" + dienTichDung +
                ", chiPhiThue=" + chiPhiThue +
                ", soLuongNguoiMax=" + soLuongNguoiMax +
                ", kieuThue='" + kieuThue + '\'' +
                '}';
    }

    public void setDichVuDiKem(String dichVuDiKem) {
        this.dichVuDiKem = dichVuDiKem;
    }
}
