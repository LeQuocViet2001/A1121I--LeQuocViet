package codegym.vn.endmodule.service;

import codegym.vn.endmodule.entity.PostNew;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;

public interface PostService extends IService<PostNew> {

    Page<PostNew> search ( String titleSearch, String typeSearch , Pageable pageable);

}
