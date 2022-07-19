package com.vn.controller;


import com.vn.entity.Category;
import com.vn.service.BlogService;
import com.vn.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
@RequestMapping("/category")
public class CategoryController {

    @Autowired
//    @Qualifier("categoryService")
    private CategoryService categoryService;




///////////////Controler tạo phân trang
    @GetMapping("/list")
    public String getAll( Model model,  @RequestParam(value = "page") Optional<Integer>  page ) {
        int currentPage = page.orElse(1);

        int pageSize =  5;
        Page<Category> categories = categoryService.findAllPage( PageRequest.of(currentPage - 1, pageSize));
        int totalItems = categories.getNumberOfElements();
        int totalPages = categories.getTotalPages();
        model.addAttribute("categories", categories);
        model.addAttribute("totalItems", totalItems);
        model.addAttribute("totalPages", totalPages);
        model.addAttribute("currentPage", currentPage);

        return "categoryList";
    }

    @PostMapping("/delete")
    public String deleteCate(@RequestParam(value = "idDelete") String idDelete, Model model) {

        categoryService.delete(idDelete);
        return "redirect:/category/list";
    }

    @GetMapping("/create")
    public String showFormCreate(Model model) {
        model.addAttribute("category", new Category());
        return "createCategory";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute(value = "category") Category category, Model model) {
        categoryService.create(category);
        return "redirect:/category/list";

    }


}
