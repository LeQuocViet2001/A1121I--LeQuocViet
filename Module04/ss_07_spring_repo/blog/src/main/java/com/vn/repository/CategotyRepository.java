package com.vn.repository;

import com.vn.entity.Blog;
import com.vn.entity.Category;

import java.util.List;

public interface CategotyRepository {


    void create(Category category);
    void update(Category category);
    void delete(int id);
    List<Category> getAllCategory();

}
