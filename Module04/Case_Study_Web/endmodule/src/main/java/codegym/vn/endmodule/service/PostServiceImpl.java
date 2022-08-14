package codegym.vn.endmodule.service;


import codegym.vn.endmodule.entity.PostNew;
import codegym.vn.endmodule.repo.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    PostRepo postRepo;

    @Override
    public PostNew findById(int id) {
        return postRepo.findById(id).orElse(null);
    }

    @Override
    public void save(PostNew postNew) {
postRepo.save(postNew);
    }

    @Override
    public Page<PostNew> findAll(Pageable pageable) {
        return postRepo.findAll(pageable);
    }

    @Override
    public List<PostNew> findAll() {
        return postRepo.findAll();
    }

    @Override
    public void delete(PostNew postNew) {
postRepo.delete(postNew);
    }

    @Override
    public Page<PostNew> search(String titleSearch, String typeSearch, Pageable pageable) {

        titleSearch = "%" + titleSearch  +"%";
        typeSearch = "%" + typeSearch  +"%";

        return postRepo.search(titleSearch, typeSearch, pageable);
    }
}
