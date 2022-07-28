package com.example.quanlysanpham.restcontroller;

import com.example.quanlysanpham.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/shopping/cart")
public class RestCartController {

    @Autowired
    ProductService service;

//    @GetMapping("")
//    public
}
