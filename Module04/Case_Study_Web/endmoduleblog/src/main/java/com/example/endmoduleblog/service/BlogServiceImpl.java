package com.example.endmoduleblog.service;


import com.example.endmoduleblog.entity.Blog;
import com.example.endmoduleblog.repo.BlogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl  implements BlogService{

    @Autowired
    BlogRepo blogRepo;



    @Override
    public Blog findById(String id) {
        return blogRepo.findById(id).orElse(null);
    }

    @Override
    public void save(Blog blog) {
blogRepo.save(blog);
    }

    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return blogRepo.findAll(pageable);
    }

    @Override
    public List<Blog> findAll() {
        return blogRepo.findAll();
    }

    @Override
    public void delete(Blog blog) {
        blogRepo.delete(blog);
    }

    @Override
    public Page<Blog> search(String idSearch, String nameSearch, String typeSearch, Pageable pageable) {
        idSearch = "%" + idSearch  +"%";
        nameSearch = "%" + nameSearch  +"%";
        typeSearch = "%" + typeSearch  +"%";

        return blogRepo.search(idSearch, nameSearch, typeSearch, pageable);
    }
}
