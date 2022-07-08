package codegym.vn.service;


import codegym.vn.entity.Product;
import codegym.vn.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements  ProductService {

    @Autowired
    private IProductRepository productRepository;

    @Override
    public void create(Product product) {
        productRepository.save(product);

    }

    @Override
    public void update(Product product) {
        productRepository.save(product);

    }

    @Override
    public     void  delete( int id )
    {
        productRepository.delete(findById(id));

    }

    @Override
    public Product findById(int id) {
        return productRepository.findById( id).orElse(null);
    }

    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }
}
