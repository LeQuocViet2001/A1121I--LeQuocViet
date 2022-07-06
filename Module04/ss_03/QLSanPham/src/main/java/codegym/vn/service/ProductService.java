package codegym.vn.service;

import codegym.vn.entity.Product;

import java.util.List;

public interface ProductService {

    void  create(Product product);
    void  update(Product product);
    void  delete( int id );
    Product findById(int id);
    List<Product> getAll();
}
