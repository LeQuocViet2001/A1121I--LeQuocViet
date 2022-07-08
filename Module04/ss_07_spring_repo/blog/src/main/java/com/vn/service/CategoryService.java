package com.vn.service;

import com.vn.entity.Category;

import java.util.List;

public interface CategoryService {
    void create(Category category);
    void update(Category category);
    void delete(String id);
    List<Category> getAllCategory();


}
