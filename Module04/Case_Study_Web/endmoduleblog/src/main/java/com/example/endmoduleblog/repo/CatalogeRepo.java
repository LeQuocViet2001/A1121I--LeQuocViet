package com.example.endmoduleblog.repo;


import com.example.endmoduleblog.entity.Cataloge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatalogeRepo extends JpaRepository<Cataloge, Integer> {



}
