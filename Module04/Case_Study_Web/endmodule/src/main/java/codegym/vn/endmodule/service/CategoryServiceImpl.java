package codegym.vn.endmodule.service;


import codegym.vn.endmodule.entity.Categoty;
import codegym.vn.endmodule.repo.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepo categoryRepo;
    @Override
    public Categoty findById(int id) {
        return null;
    }

    @Override
    public void save(Categoty categoty) {

    }

    @Override
    public Page<Categoty> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Categoty> findAll() {
        return categoryRepo.findAll();
    }

    @Override
    public void delete(Categoty categoty) {

    }
}
