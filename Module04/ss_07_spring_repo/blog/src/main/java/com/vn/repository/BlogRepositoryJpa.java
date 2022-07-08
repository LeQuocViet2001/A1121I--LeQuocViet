package com.vn.repository;

import com.vn.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;


@Transactional
public interface BlogRepositoryJpa  extends JpaRepository<Blog,Integer> {

    @Query(  value = "select * from blogs"

            , nativeQuery = true)
    List<Blog> getListSearch(String search);
}
