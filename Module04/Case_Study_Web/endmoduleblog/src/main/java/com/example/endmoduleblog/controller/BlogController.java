package com.example.endmoduleblog.controller;


import com.example.endmoduleblog.entity.Blog;
import com.example.endmoduleblog.entity.Cataloge;
import com.example.endmoduleblog.service.BlogService;
import com.example.endmoduleblog.service.CatalogeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    BlogService serviceBlog;
    @Autowired
    CatalogeService serviceCataloge;

    @RequestMapping(value = "/list")
    public String getListPage(@RequestParam(defaultValue = "", required = false) String nameSearch,
                              @RequestParam(defaultValue = "", required = false) String typeSearch,
                              @RequestParam(defaultValue = "", required = false) String idSearch,
                              Model model, @RequestParam(value = "page") Optional<Integer> page){
        int currentPage = page.orElse(1);
        int pageSize =  5;

        Page<Blog> blogs = serviceBlog.findAll( PageRequest.of(currentPage - 1, pageSize));
        model.addAttribute("blogs",blogs );

        List<Cataloge> catalogeList = serviceCataloge.findAll();
        model.addAttribute("catalogeList", catalogeList);


        model.addAttribute("nameSearch", nameSearch);
        model.addAttribute("idSearch", idSearch);
        model.addAttribute("typeSearch", ( !typeSearch.equals("") ) ? Integer.parseInt(typeSearch) : typeSearch );

        int numbers = blogs.getNumber();
        int totalItems = blogs.getNumberOfElements();
        int totalPages = blogs.getTotalPages();
        model.addAttribute("totalItems", totalItems);
        model.addAttribute("totalPages", totalPages);
        model.addAttribute("currentPage", currentPage);
        model.addAttribute("numbers", numbers);
        return "blog/list";
    }

    @GetMapping("/create")
    public String createForm( Model model){

        model.addAttribute("blog", new Blog());
        List<Cataloge> catalogeList = serviceCataloge.findAll();
        model.addAttribute("catalogeList",catalogeList);
        return "blog/create";
    }

    @PostMapping("/create")
    public String create(@Valid @ModelAttribute Blog blog, BindingResult bindingResult , Model model){

        if(bindingResult.hasErrors()){
            model.addAttribute("blog", blog);
            List<Cataloge> catalogeList = serviceCataloge.findAll();
            model.addAttribute("catalogeList",catalogeList);
            return "blog/create";

        }
        serviceBlog.save(blog);
        return "redirect:/blog/list";

    }

    @PostMapping("/delete")
    public String delete( @RequestParam String idDelete){

        Blog blog = serviceBlog.findById(idDelete);
        serviceBlog.delete(blog);
        return "redirect:/blog/list";
    }

    @GetMapping("/update")
    public String updateForm( @RequestParam String idUpdate, Model model){
        Blog blog = serviceBlog.findById(idUpdate);
        model.addAttribute("blog", blog);
        List<Cataloge> catalogeList = serviceCataloge.findAll();
        model.addAttribute("catalogeList",catalogeList);
        return "blog/update";
    }

    @PostMapping("/update")
    public String update(@Valid @ModelAttribute Blog blog, BindingResult bindingResult , Model model){

        if(bindingResult.hasErrors()){
            model.addAttribute("blog", blog);
            List<Cataloge> catalogeList = serviceCataloge.findAll();
            model.addAttribute("catalogeList",catalogeList);
            return "blog/update";
        }
        serviceBlog.save(blog);
        return "redirect:/blog/list";

    }


    @GetMapping("/search")
    public String search( @RequestParam(defaultValue = "", required = false) String nameSearch,
                          @RequestParam(defaultValue = "", required = false) String typeSearch,
                          @RequestParam(defaultValue = "", required = false) String idSearch,
                          @RequestParam(value = "page") Optional<Integer> page, Model model){

        int currentPage = page.orElse(1);
        int pageSize =  2;
        Page<Blog> blogs = serviceBlog.search( idSearch, nameSearch, typeSearch  ,PageRequest.of(currentPage - 1, pageSize));
        model.addAttribute("blogs",blogs );

        List<Cataloge>  catalogeList = serviceCataloge.findAll();
        model.addAttribute("catalogeList", catalogeList);

        model.addAttribute("nameSearch", nameSearch);
        model.addAttribute("idSearch", idSearch);
        model.addAttribute("typeSearch", ( !typeSearch.equals("") ) ? Integer.parseInt(typeSearch) : typeSearch );

        int numbers = blogs.getNumber();
        int totalItems = blogs.getNumberOfElements();
        int totalPages = blogs.getTotalPages();
        model.addAttribute("totalItems", totalItems);
        model.addAttribute("totalPages", totalPages);
        model.addAttribute("currentPage", currentPage);
        model.addAttribute("numbers", numbers);
        return "blog/list";
    }






}
