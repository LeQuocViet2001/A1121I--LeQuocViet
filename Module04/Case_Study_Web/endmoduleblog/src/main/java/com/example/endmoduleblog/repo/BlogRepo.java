package com.example.endmoduleblog.repo;


import com.example.endmoduleblog.entity.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepo  extends JpaRepository<Blog, String> {

    @Query( value="select * from blog   where  id_blog like :idSearch  and title like :nameSearch and id_category like  :typeSearch " , nativeQuery= true )

    Page<Blog> search (@Param("idSearch") String  idSearch, @Param("nameSearch") String nameSearch,  @Param("typeSearch") String typeSearch , Pageable pageable);

}
