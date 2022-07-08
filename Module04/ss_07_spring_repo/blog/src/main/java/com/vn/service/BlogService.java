package com.vn.service;

import com.vn.entity.Blog;
import com.vn.entity.Category;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service("blogService")
public interface BlogService {


    void create(Blog blog);
    void update(Blog blog);
    void delete(String id);
    List<Blog> findAll();
    Blog findById(String id);

    List<Blog> getListSearch(String search);
}
