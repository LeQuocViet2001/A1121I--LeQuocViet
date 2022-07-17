package com.vn.repository;

import com.vn.entity.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;


@Repository
@Transactional
public interface CategoryRepositoryJpa extends JpaRepository<Category, Integer> {

//    @Query(  value = "select c from Category")
//    Page<Category> findAllPage(Pageable pageable);
}
