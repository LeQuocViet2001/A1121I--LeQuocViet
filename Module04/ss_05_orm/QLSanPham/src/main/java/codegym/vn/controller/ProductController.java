package codegym.vn.controller;


import codegym.vn.entity.Product;
import codegym.vn.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService service;


    @GetMapping("/list")
    public String showList(Model model){
        List<Product> products = service.getAll();
        model.addAttribute("products",products );

        return "list";
    }

    @GetMapping("/create")
    public  String showForm(Model model){
        model.addAttribute("product", new Product());
        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute(value = "product") Product product){
        service.create(product);
        return "redirect:/product/list";
    }

    @GetMapping("/view")
    public  String viewByid(@RequestParam("id") String id, Model model)
    {
        Product product =  service.findById( Integer.parseInt(id));
            model.addAttribute("product", product)   ;
            return "view";
    }

    @GetMapping("/delete")
    public  String deleteByid(@RequestParam("id") String id, Model model)
    {
        service.delete( Integer.parseInt(id) );
        return "redirect:/product/list";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute("product") Product product){
        service.update(product);
        return "redirect:/product/list";
    }


}
