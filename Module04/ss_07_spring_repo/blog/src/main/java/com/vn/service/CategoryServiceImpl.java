package com.vn.service;

import com.vn.entity.Category;
import com.vn.repository.CategoryRepositoryJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


//@Service("categoryService")
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepositoryJpa categotyRepository;
//    @Autowired
//    public  CategoryServiceImpl ( CategoryRepositoryJpa categotyRepository){
//        this.categotyRepository = categotyRepository;
//    }

    @Override
    public void create(Category category) {
            categotyRepository.save(category);
    }

    @Override
    public void update(Category category) {
        categotyRepository.save(category);
    }

    @Override
    public void delete(String id) {
    categotyRepository.delete( categotyRepository.findById( Integer.parseInt(id)).orElse(null));
    }

    @Override
    public List<Category> getAllCategory() {
        return categotyRepository.findAll();
    }

}
