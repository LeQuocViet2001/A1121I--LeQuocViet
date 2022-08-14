package com.example.endmodulestudent.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IService<E> {

    E findById(String id);
    void save(E e);
    Page<E> findAll(Pageable pageable);
    List<E> findAll();
    void delete( E e );
}
