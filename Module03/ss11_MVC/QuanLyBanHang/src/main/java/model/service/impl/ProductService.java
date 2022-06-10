package model.service.impl;

import model.bean.Product;
import model.respository.impl.ProductRespository;
import model.service.IProductService;

import java.util.List;

public class ProductService  implements IProductService {

    ProductRespository respository = new ProductRespository();




    @Override
    public void delete( int id) {
        respository.delete(id);
    }

    @Override
    public List<Product> getAllProduct() {
        return respository.getAllProduct();
    }

    @Override
    public Product getProduct(int id) {

        return respository.getProduct(id);
    }

    public void editProduct(int id, String ten, double price, String mota, String origin) {

        ////////////
        respository.editProduce(id, ten, price,mota,  origin  );

    }

    @Override
    public void addProduct(int id, String ten, double price, String mota, String origin) {
            respository.addProduct( id, ten, price,mota,  origin);
    }

}
