package com.example.demo.repository;

import com.example.demo.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface BlogRepositoryJpa extends JpaRepository<Blog, Integer> {

//    @Query(value = "select b from blogs b where b.name like ? "
//            , nativeQuery = true )
    @Query
    List<Blog> findAllByTitleContaining(String search);
}
