package codegym.vn.service;


import codegym.vn.entity.Product;
import codegym.vn.reoisitory.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements  ProductService {


    private ProductRepository productRepository;
    @Autowired
    public ProductServiceImpl( ProductRepository productRepository ) {
        this.productRepository = productRepository;
    }

    @Override
    public void create(Product product) {
        productRepository.create(product);

    }

    @Override
    public void update(Product product) {
        productRepository.update(product);

    }

    @Override
    public     void  delete( int id )
    {
        productRepository.delete(id);

    }

    @Override
    public Product findById(int id) {
        return productRepository.findById(id);
    }

    @Override
    public List<Product> getAll() {
        return productRepository.getAll();
    }
}
