package com.example.endmodulestudent.controller;


import com.example.endmodulestudent.entity.Class;
import com.example.endmodulestudent.entity.Student;
import com.example.endmodulestudent.service.ServiceClass;
import com.example.endmodulestudent.service.ServiceStudent;
import com.example.endmodulestudent.valid.DateValid;
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
@RequestMapping("/student")
public class StudentController {

    @Autowired
    ServiceClass classService;

    @Autowired
    ServiceStudent studentService;

    @GetMapping("/list")
    public String getListPage(@RequestParam(defaultValue = "", required = false) String nameSearch,
                              @RequestParam(defaultValue = "", required = false) String typeSearch,
                              @RequestParam(defaultValue = "", required = false) String emailSearch,

                              Model model, @RequestParam(value = "page") Optional<Integer> page){
        int currentPage = page.orElse(1);
        int pageSize =  1;

        Page<Student> students = studentService.findAll( PageRequest.of(currentPage - 1, pageSize));
        model.addAttribute("students",students );

        List<Class> classList = classService.findAll();
        model.addAttribute("classList", classList);


        model.addAttribute("nameSearch", nameSearch);
        model.addAttribute("emailSearch", emailSearch);
        model.addAttribute("typeSearch", ( !typeSearch.equals("") ) ? Integer.parseInt(typeSearch) : typeSearch );

        int numbers = students.getNumber();
        int totalItems = students.getNumberOfElements();
        int totalPages = students.getTotalPages();
        model.addAttribute("totalItems", totalItems);
        model.addAttribute("totalPages", totalPages);
        model.addAttribute("currentPage", currentPage);
        model.addAttribute("numbers", numbers);
        return "student/list";
    }

    @PostMapping("/delete")
    public String delete(@RequestParam String idDelete, Model model) {

        Student student = studentService.findById(idDelete);
        studentService.delete(student);
        return "redirect:/student/list";
    }

    @GetMapping("/create")
    public  String createForm( Model model){

        List<Class> classList = classService.findAll();
        model.addAttribute("classList", classList);
        model.addAttribute("student", new Student());
        return "student/create";

    }

    @PostMapping("/create")
    public String create(@Valid @ModelAttribute Student student, BindingResult bindingResult , Model model){


        DateValid validation = new DateValid();
        validation.validate(student, bindingResult);
        if( bindingResult.hasErrors()){
            List<Class> classList = classService.findAll();
            model.addAttribute("classList", classList);
            model.addAttribute("student", student);
            return "student/create";
        }

        studentService.save(student);
        return "redirect:/student/list";
    }

    @GetMapping("update")
    public String update(@RequestParam String idUpdate, Model model){
        List<Class> classList = classService.findAll();
        model.addAttribute("classList", classList);
        model.addAttribute("student", studentService.findById(idUpdate));
        return "student/update";
    }


    @PostMapping("update")
    public String update(@Valid @ModelAttribute Student student, BindingResult bindingResult , Model model){

        if( bindingResult.hasErrors()){
            List<Class> classList = classService.findAll();
            model.addAttribute("classList", classList);
            model.addAttribute("student", student);
            return "student/update";
        }

        studentService.save(student);
        return "redirect:/student/list";
    }



    @GetMapping("/search")
    public String search(   @RequestParam(defaultValue = "", required = false) String nameSearch,
                              @RequestParam(defaultValue = "", required = false) String typeSearch,
                              @RequestParam(defaultValue = "", required = false) String emailSearch,

                              Model model, @RequestParam(value = "page") Optional<Integer> page){
        int currentPage = page.orElse(1);
        int pageSize =  1;

//        Page<Student> students = studentService.findAll( PageRequest.of(currentPage - 1, pageSize));
        Page<Student> students = studentService.search(  nameSearch, emailSearch,typeSearch  ,PageRequest.of(currentPage - 1, pageSize));

        model.addAttribute("students",students );

        List<Class> classList = classService.findAll();
        model.addAttribute("classList", classList);


        model.addAttribute("nameSearch", nameSearch);
        model.addAttribute("emailSearch", emailSearch);
        model.addAttribute("typeSearch", ( !typeSearch.equals("") ) ? Integer.parseInt(typeSearch) : typeSearch );

        int numbers = students.getNumber();
        int totalItems = students.getNumberOfElements();
        int totalPages = students.getTotalPages();
        model.addAttribute("totalItems", totalItems);
        model.addAttribute("totalPages", totalPages);
        model.addAttribute("currentPage", currentPage);
        model.addAttribute("numbers", numbers);
        return "student/list";
    }
}
