package codegym.vn.controller;

import codegym.vn.entity.Music;
import codegym.vn.service.MusicService;
import javafx.scene.shape.Path;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.List;

@Controller
@PropertySource("classpath:upload_file.properties")

public class MusicController {

    @Autowired
    private MusicService service;
    @Value("${file-upload}")
    private String fileUpload;


    @GetMapping("home")
    public  String show(Model model){

        List<Music> musicList = service.findAll();
        model.addAttribute("musicList", musicList );
        return "home";
    }

    @GetMapping("create")
    public String formCreate(Model model){
        model.addAttribute("music", new Music() );
        return "create";
    }

    @PostMapping("create")
    private String add(@ModelAttribute( value = "music") Music music,@RequestParam("files") MultipartFile[] files, Model model){

//        MultipartFile multipartFile = files[0];
        String fileName = files[0].getOriginalFilename();
        try {
            FileCopyUtils.copy( files[0].getBytes(), new File( fileUpload + fileName.trim()));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        music.setUrlFile(fileName);
        service.create(music);
        return "redirect:/home";
    }

    @GetMapping("delete")
    public String deleteMusic(@RequestParam("id") String id){
        service.delete(id);
        return "redirect:/home";

    }


}
