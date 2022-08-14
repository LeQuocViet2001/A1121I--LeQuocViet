package com.example.endmodulestudent.service;


import com.example.endmodulestudent.entity.Class;
import com.example.endmodulestudent.repo.RepoClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassServiceImpl  implements ServiceClass{


    @Autowired
    RepoClass classRepo;
    @Override
    public Class findById(String id) {
        return classRepo.findById(Integer.parseInt(id)).orElse(null);
    }

    @Override
    public void save(Class aClass) {
classRepo.save(aClass);
    }

    @Override
    public Page<Class> findAll(Pageable pageable) {
        return classRepo.findAll(pageable);
    }

    @Override
    public List<Class> findAll() {
        return classRepo.findAll();
    }

    @Override
    public void delete(Class aClass) {
classRepo.delete(aClass);
    }
}
