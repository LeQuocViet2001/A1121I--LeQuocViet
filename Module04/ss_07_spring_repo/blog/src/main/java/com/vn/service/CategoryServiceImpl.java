package com.vn.service;

import com.vn.entity.Category;
import com.vn.repository.CategotyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CategoryServiceImpl implements CategoryService {

    private CategotyRepository categotyRepository;
    @Autowired
    public  CategoryServiceImpl ( CategotyRepository categotyRepository){
        this.categotyRepository = categotyRepository;
    }

    @Override
    public void create(Category category) {
            categotyRepository.create(category);
    }

    @Override
    public void update(Category category) {
        categotyRepository.update(category);
    }

    @Override
    public void delete(String id) {
    categotyRepository.delete(Integer.parseInt(id));
    }

    @Override
    public List<Category> getAllCategory() {
        return categotyRepository.getAllCategory();
    }
}
