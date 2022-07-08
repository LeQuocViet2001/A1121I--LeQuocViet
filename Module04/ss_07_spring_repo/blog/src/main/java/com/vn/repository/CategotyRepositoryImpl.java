package com.vn.repository;

import com.vn.entity.Category;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;


@Repository
@Transactional
public class CategotyRepositoryImpl  implements  CategotyRepository{

    @PersistenceContext
    EntityManager entityManager;


    @Override
    @Modifying
    public void create(Category category) {
        entityManager.persist(category);
    }

    @Override
    @Modifying

    public void update(Category category) {
            entityManager.merge(category);
    }

    @Override
    @Modifying
    public void delete(int id) {
            Category category = entityManager.find(Category.class, id);
            entityManager.remove(category);
    }

    @Override
    public List<Category> getAllCategory() {
        List<Category> blogs = entityManager
                .createQuery("select p from  Category p ")
                .getResultList();

        return  blogs;
    }
}
