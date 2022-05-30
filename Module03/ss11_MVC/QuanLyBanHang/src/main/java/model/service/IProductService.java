package model.service;

import model.bean.Product;

import java.util.List;

public interface IProductService {

    void delete( int id);
    List<Product> getAllProduct();
    Product getProduct(int id);
    public void editProduct(int id, String ten, double price, String mota, String origin);


    void addProduct(int id, String ten, double price, String mota, String origin);
}
