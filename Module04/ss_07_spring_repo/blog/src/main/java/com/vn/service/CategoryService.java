package com.vn.service;

import com.vn.entity.Category;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service("categoryService")
public interface CategoryService {
    void create(Category category);
    void update(Category category);
    void delete(String id);
    List<Category> getAllCategory();


}
