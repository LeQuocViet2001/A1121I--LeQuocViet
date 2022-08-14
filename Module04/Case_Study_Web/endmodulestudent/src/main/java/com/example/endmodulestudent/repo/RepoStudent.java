package com.example.endmodulestudent.repo;

import com.example.endmodulestudent.entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface RepoStudent extends JpaRepository<Student, String> {

    @Query( value="select * from student   where  name like :nameSearch  and email like :emailSearch and id_class  like  :typeSearch " , nativeQuery= true )
    Page<Student> search (@Param("nameSearch") String nameSearch, @Param("emailSearch") String  emailSearch, @Param("typeSearch") String typeSearch , Pageable pageable);

}
