package com.vn.controller;


import com.vn.entity.Category;
import com.vn.service.BlogService;
import com.vn.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/categoty")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private BlogService blogService;

    @GetMapping("/list")
    public String getAll(Model model){
     List<Category> categories =  categoryService.getAllCategory();
    model.addAttribute("categories", categories );
    return "categoryList";
    }

    @PostMapping("/delete")
    public  String deleteCate(@RequestParam(value = "idDelete") String idDelete , Model model){

        categoryService.delete(idDelete);
        return "redirect:/categoty/list";
    }

    @GetMapping("/create")
    public String showFormCreate(Model model){
        model.addAttribute("category", new Category());
        return "createCategory";
    }

    @PostMapping("/create")
    public String create(@RequestAttribute(value = "category") Category category, Model model)
    {
        categoryService.create(category);
        return "redirect:/categoty/list";

    }



}
