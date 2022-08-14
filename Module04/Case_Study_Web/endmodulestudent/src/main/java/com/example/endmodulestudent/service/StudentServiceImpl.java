package com.example.endmodulestudent.service;


import com.example.endmodulestudent.entity.Student;
import com.example.endmodulestudent.repo.RepoStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements ServiceStudent{

    @Autowired
    RepoStudent studentRepo;


    @Override
    public Student findById(String id) {
        return studentRepo.findById(id).orElse(null);
    }

    @Override
    public void save(Student student) {
studentRepo.save(student);
    }

    @Override
    public Page<Student> findAll(Pageable pageable) {
        return studentRepo.findAll(pageable);
    }

    @Override
    public List<Student> findAll() {
        return studentRepo.findAll();
    }

    @Override
    public void delete(Student student) {
studentRepo.delete(student);
    }

    @Override
    public Page<Student> search(String nameSearch, String emailSearch, String typeSearch, Pageable pageable) {
        emailSearch = "%" + emailSearch  +"%";
        nameSearch = "%" + nameSearch  +"%";
        typeSearch = "%" + typeSearch  +"%";

        return studentRepo.search(nameSearch, emailSearch, typeSearch, pageable);
    }
}
