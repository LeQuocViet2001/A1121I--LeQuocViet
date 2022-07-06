package codegym.vn.reoisitory;

import codegym.vn.entity.Product;
import org.springframework.data.jpa.repository.Modifying;

import javax.transaction.Transactional;
import java.util.List;


public interface ProductRepository {


    void  create(Product product);
    void  update(Product product);
    void  delete( int id );
    Product findById(int id);
    List<Product> getAll();
}
