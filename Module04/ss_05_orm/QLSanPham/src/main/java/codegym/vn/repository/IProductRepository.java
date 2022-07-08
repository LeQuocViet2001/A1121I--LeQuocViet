package codegym.vn.repository;

import codegym.vn.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;


@Transactional
public interface IProductRepository extends JpaRepository<Product, Integer> {
}
