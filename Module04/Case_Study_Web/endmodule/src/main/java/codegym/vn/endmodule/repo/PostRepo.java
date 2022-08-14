package codegym.vn.endmodule.repo;


import codegym.vn.endmodule.entity.PostNew;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepo  extends JpaRepository<PostNew, Integer> {

    @Query( value="select * from post_new  where  title like :titleSearch  and id_category  like  :typeSearch " , nativeQuery= true )
    Page<PostNew> search (@Param("titleSearch") String titleSearch, @Param("typeSearch") String typeSearch , Pageable pageable);

}
