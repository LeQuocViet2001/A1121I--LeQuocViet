package model.respository;

import model.bean.Product;

import java.util.List;

public interface IProductRespository {
    void addProduct(int id, String ten, double price, String mota, String origin);
    void delete( int id);
    List<Product> getAllProduct();
    Product getProduct(int id);

    void editProduce(int id, String ten, double price, String mota, String origin);
}
