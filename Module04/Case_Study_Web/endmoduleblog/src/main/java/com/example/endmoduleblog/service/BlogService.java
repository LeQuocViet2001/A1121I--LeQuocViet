package com.example.endmoduleblog.service;

import com.example.endmoduleblog.entity.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BlogService  extends  IService<Blog> {

    Page<Blog> search ( String  idSearch, String nameSearch,String typeSearch ,Pageable pageable);
}
