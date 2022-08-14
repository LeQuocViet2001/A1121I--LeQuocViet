package com.example.endmoduleblog.service;

import com.example.endmoduleblog.entity.Cataloge;
import com.example.endmoduleblog.repo.CatalogeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogeServiceImple implements CatalogeService {

    @Autowired
    CatalogeRepo catalogeRepo;

    @Override
    public void delete(Cataloge cataloge) {

        catalogeRepo.delete(cataloge);
    }

    @Override
    public Cataloge findById(String id) {
        return catalogeRepo.findById( Integer.parseInt(id)).orElse(null);
    }

    @Override
    public void save(Cataloge cataloge) {
            catalogeRepo.save(cataloge);
    }

    @Override
    public Page<Cataloge> findAll(Pageable pageable) {
        return catalogeRepo.findAll(pageable);
    }

    @Override
    public List<Cataloge> findAll() {
        return catalogeRepo.findAll();
    }
}
