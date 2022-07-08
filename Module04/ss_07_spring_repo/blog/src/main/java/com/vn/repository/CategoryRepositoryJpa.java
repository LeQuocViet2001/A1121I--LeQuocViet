package com.vn.repository;

import com.vn.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
public interface CategoryRepositoryJpa extends JpaRepository<Category, Integer> {

}
