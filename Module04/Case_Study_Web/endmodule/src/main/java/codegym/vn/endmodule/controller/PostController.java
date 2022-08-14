package codegym.vn.endmodule.controller;


import codegym.vn.endmodule.entity.Categoty;
import codegym.vn.endmodule.entity.PostNew;
import codegym.vn.endmodule.service.CategoryService;
import codegym.vn.endmodule.service.PostService;
import codegym.vn.endmodule.valid.DateValid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/post")
public class PostController {

    @Autowired
    PostService postService;
    @Autowired
    CategoryService categoryService;



    @GetMapping("/list")
    public String getListPage(@RequestParam(defaultValue = "", required = false) String titleSearch,
                              @RequestParam(defaultValue = "", required = false) String typeSearch,
                              Model model, @RequestParam(value = "page") Optional<Integer> page){
        int currentPage = page.orElse(1);
        int pageSize =  5;

        Page<PostNew> postNews = postService.findAll( PageRequest.of(currentPage - 1, pageSize));
        model.addAttribute("postNews",postNews );

        List<Categoty> categotyList =  categoryService.findAll();
        model.addAttribute("categotyList", categotyList);

        model.addAttribute("titleSearch", titleSearch);
        model.addAttribute("typeSearch", ( !typeSearch.equals("") ) ? Integer.parseInt(typeSearch) : typeSearch );

        int numbers = postNews.getNumber();
        int totalItems = postNews.getNumberOfElements();
        int totalPages = postNews.getTotalPages();
        model.addAttribute("totalItems", totalItems);
        model.addAttribute("totalPages", totalPages);
        model.addAttribute("currentPage", currentPage);
        model.addAttribute("numbers", numbers);
        return "post/list";
    }


    @PostMapping("/delete")
    public String delete( @RequestParam String idDelete, Model model){

        PostNew postNew = postService.findById( Integer.parseInt(idDelete));
        postService.delete(postNew);
        return "redirect:/post/list";
    }

    @GetMapping("/create")
    public String createForm( Model model){

        List<Categoty> categotyList =  categoryService.findAll();
        model.addAttribute("categotyList", categotyList);
        model.addAttribute("news", new PostNew());

        return "post/create";
    }

    @PostMapping("/create")
    public String createForm(@Validated @ModelAttribute( value = "news" ) PostNew news, BindingResult bindingResult , Model model){

        DateValid validation = new DateValid();
        validation.validate(news, bindingResult);
        if( bindingResult.hasErrors()) {
            List<Categoty> categotyList =  categoryService.findAll();
            model.addAttribute("categotyList", categotyList);
            model.addAttribute("news", news);
            return "post/create";
        }
        postService.save( news);
        return "redirect:/post/list";
    }

    @GetMapping("/update")
    public String updateForm( @RequestParam String idUpdate, Model model){

        PostNew news = postService.findById( Integer.parseInt( idUpdate ) );
        List<Categoty> categotyList =  categoryService.findAll();
        model.addAttribute("categotyList", categotyList);
        model.addAttribute("news", news);
        return "post/update";

    }

    @PostMapping("/update")
    public String updateNew( @Validated @ModelAttribute( value = "news" ) PostNew news, BindingResult bindingResult , Model model){

//        DateValid validation = new DateValid();
//        validation.validate(news, bindingResult);
        if( bindingResult.hasErrors()) {
            List<Categoty> categotyList =  categoryService.findAll();
            model.addAttribute("categotyList", categotyList);
            model.addAttribute("news", news);
            return "post/update";

        }
        postService.save( news);
        return "redirect:/post/list";
    }



    @GetMapping("/search")
    public String search(@RequestParam(defaultValue = "", required = false) String titleSearch,
                         @RequestParam(defaultValue = "", required = false) String typeSearch,
                              Model model, @RequestParam(value = "page") Optional<Integer> page){
        int currentPage = page.orElse(1);
        int pageSize =  5;

//        Page<PostNew> pageSizeostNews = postService.findAll( PageRequest.of(currentPage - 1, pageSize));
        Page<PostNew> postNews = postService.search( titleSearch, typeSearch,  PageRequest.of(currentPage - 1, pageSize));
        model.addAttribute("postNews",postNews );

        List<Categoty> categotyList =  categoryService.findAll();
        model.addAttribute("categotyList", categotyList);


        model.addAttribute("titleSearch", titleSearch);
        model.addAttribute("typeSearch", ( !typeSearch.equals("") ) ? Integer.parseInt(typeSearch) : typeSearch );

        int numbers = postNews.getNumber();
        int totalItems = postNews.getNumberOfElements();
        int totalPages = postNews.getTotalPages();
        model.addAttribute("totalItems", totalItems);
        model.addAttribute("totalPages", totalPages);
        model.addAttribute("currentPage", currentPage);
        model.addAttribute("numbers", numbers);
        return "post/list";
    }


}
