package com.vn.controller;

import com.vn.entity.Medical;
import com.vn.entity.Symptom;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class medicalController {

    @GetMapping("/medical")
    public String showForm(Model model){
        String [] allTypes = {"  Tau bay", "  Tau thuyen", "  O to", "  Khac(Ghi ro)"};
        model.addAttribute("medical" ,new Medical());
        model.addAttribute("allTypes" , allTypes );
        return  "medical";

    }
    @PostMapping("/medical")
    public String sdsfsfs(@ModelAttribute(value = "medical") Medical medical, Model model){


        model.addAttribute("medical", medical);
        String [] allTypes = {"  Tau bay", "  Tau thuyen", "  O to", "  Khac(Ghi ro)"};
        model.addAttribute("allTypes" , allTypes );

        return "medical";
    }

//    <input type="checkbox" name="active" th:checked="${user.active}" />
}
