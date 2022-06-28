package model;

public class Category {
    private int idMuc;
    private  String tenMuc;

    public Category(int idMuc, String tenMuc) {
        this.idMuc = idMuc;
        this.tenMuc = tenMuc;
    }

    public int getIdMuc() {
        return idMuc;
    }

    public String getTenMuc() {
        return tenMuc;
    }

    @Override
    public String toString() {
        return "Category{" +
                "idMuc=" + idMuc +
                ", tenMuc='" + tenMuc + '\'' +
                '}';
    }
}
