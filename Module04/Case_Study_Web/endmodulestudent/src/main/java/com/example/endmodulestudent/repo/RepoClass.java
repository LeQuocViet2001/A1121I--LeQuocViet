package com.example.endmodulestudent.repo;


import com.example.endmodulestudent.entity.Class;
import com.example.endmodulestudent.entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoClass extends JpaRepository<Class , Integer>{



}
