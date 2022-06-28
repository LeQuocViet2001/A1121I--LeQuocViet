package com.vn.controller;


import com.vn.entity.Email;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmailController {

    @GetMapping("/email")
    public String convert(Model model){
        String[] language ={"English","Vietnamese","Japanese","Chinese"};
        String[] page = {"5","10","15","25","50","100"};
        model.addAttribute("email",new Email());
        model.addAttribute("page",page);
        model.addAttribute("language1",language);
        return "email";
    }


    @PostMapping("/email")
    public String sdf(@ModelAttribute Email email, Model model){
        String[] language ={"English","Vietnamese","Japanese","Chinese"};
        String[] page = {"5","10","15","25","50","100"};
        model.addAttribute("page",page);
        model.addAttribute("language1",language);
        model.addAttribute("email",email);
        return "email";
    }

}
