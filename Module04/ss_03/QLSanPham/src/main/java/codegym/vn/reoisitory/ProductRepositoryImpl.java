package codegym.vn.reoisitory;


import codegym.vn.entity.Product;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class ProductRepositoryImpl implements  ProductRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    @Modifying
    public void create(Product product) {
        entityManager.persist(product);
    }

    @Override
    @Modifying
    public void update(Product product) {
        entityManager.merge(product);
    }

    @Override
    @Modifying
    public void delete(int id ) {
        Product product = findById(id);
        entityManager.remove(product);

    }

    @Override

    public Product findById(int id) {
        return entityManager.find( Product.class, id);

    }

    @Override
    public List<Product> getAll() {
        List<Product> products = entityManager
                .createQuery("select p from  Product p ")
                .getResultList();

        return  products;
    }
}
