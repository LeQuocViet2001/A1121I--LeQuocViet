package codegym.vn.entity;


import javax.persistence.*;

@Entity
@Table(name = "san_pham")
public class Product {
    @Id
    @Column(name = "product_id", columnDefinition = " int auto_increment")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private  String name;
    private boolean status;
    @Column(name = "expiry_date", columnDefinition = " date ")
    private String expiryDate ;
    private double price;
    private String country;

    public Product() {
    }


    public Product(int id, String name, boolean status, String expiryDate, double price, String country) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.expiryDate = expiryDate;
        this.price = price;
        this.country = country;
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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Product(String name, boolean status, String expiryDate, double price, String country) {
        this.name = name;
        this.status = status;
        this.expiryDate = expiryDate;
        this.price = price;
        this.country = country;
    }
}
