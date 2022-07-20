package com.example.quanlysanpham.entity;


import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Product {

    @Id
    @Column(name = "product_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private boolean status;

    @Column(name = "expiry_date", columnDefinition = " date ")
//    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date expiryDate ;
    private double price;
    private String country;

    public Product() {
    }

    public Product(int id, String name, boolean status, Date expiryDate, double price, String country) {
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

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
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
}
