package model.bean;

public class Product {
    private int id;
    private  String name;
    private double price;
    private  String desc ;
    private String origin;

    public Product(int id, String name, double price, String desc, String origin) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.desc = desc;
        this.origin = origin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}
