package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CoinConverCotroller {
     @GetMapping("/convert")
    public String  showForm(){
         return "convert";
     }

     @PostMapping("/convert")
    public  String convert(@RequestParam(value = "convert") int convert , Model model){
         model.addAttribute("result",convert*23000);
         return "convert";
     }
}
