package com.example.endmodulestudent.controller;

import com.example.endmodulestudent.entity.Class;
import com.example.endmodulestudent.service.ServiceClass;
import com.example.endmodulestudent.service.ServiceStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


@Controller
public class ClassController {
    @Autowired
    ServiceClass classService;
    @Autowired
    ServiceStudent studentService;

    @GetMapping("class/create")
    public String createClass( Model model){

        model.addAttribute( "classHoc", new Class());

        List<Class> classList = classService.findAll();
        model.addAttribute("classList", classList);
        return "class/create";
    }

    @PostMapping("class/create")
    public String create(@ModelAttribute Class classHoc, Model model){
        classService.save(classHoc);
        return "redirect:/student/list";

    }
}
