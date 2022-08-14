package com.example.endmodulestudent.service;

import com.example.endmodulestudent.entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;

public interface ServiceStudent extends  IService<Student> {


    Page<Student> search ( String nameSearch,  String  emailSearch, String typeSearch , Pageable pageable);

}
