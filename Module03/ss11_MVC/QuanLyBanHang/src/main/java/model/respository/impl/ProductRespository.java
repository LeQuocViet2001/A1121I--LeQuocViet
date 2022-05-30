package model.respository.impl;

import model.bean.Product;
import model.respository.IProductRespository;

import java.util.ArrayList;
import java.util.List;

public class ProductRespository implements IProductRespository {
    public static List<Product> productList = new ArrayList<>();
    static {
        productList.add(new Product(1, "tuấn", 2423, "ưerwer", "2342"));
        productList.add(new Product(2, "tuấn", 2423, "ưerwer", "2342"));
        productList.add(new Product(3, "tuấn", 2423, "ưerwer", "2342"));
        productList.add(new Product(4, "tuấn", 2423, "ưerwer", "2342"));
        productList.add(new Product(5, "tuấn", 2423, "ưerwer", "2342"));
        productList.add(new Product(6, "tuấn", 2423, "ưerwer", "2342"));
        productList.add(new Product(7, "tuấn", 2423, "ưerwer", "2342"));
        productList.add(new Product(9, "tuấn", 2423, "ưerwer", "2342"));
        productList.add(new Product(8, "tuấn", 2423, "ưerwer", "2342"));
        productList.add(new Product(10, "tuấn", 2423, "ưerwer", "2342"));

    }


    @Override
    public void addProduct(int id, String ten, double price, String mota, String origin){

        productList.add( new Product(id,ten,price,mota,origin));
    }

    @Override
    public void delete(int id) {

       for ( int i = 0 ; i < productList.size() ; i++){
           if( productList.get(i).getId() == id )
               productList.remove(i);
       }

    }

    @Override
    public List<Product> getAllProduct() {


        return productList;
    }

    @Override
    public Product getProduct(int id) {
        for ( int i = 0 ; i < productList.size() ; i++){
            if( productList.get(i).getId() == id ) {
                return productList.get(i);
            }
        }
        return null;
    }

    @Override
    public void editProduce(int id, String ten, double price, String mota, String origin) {

        Product a;
        for ( int i = 0 ; i < productList.size() ; i++){
            if( productList.get(i).getId() == id ) {
                a = productList.get(i);

                a.setName(ten);
                a.setOrigin(origin);
                a.setDesc(mota);
                a.setPrice(price);
            }

        }




    }


}
