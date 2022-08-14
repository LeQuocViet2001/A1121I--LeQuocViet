package com.example.endmoduleblog;

import com.example.endmoduleblog.entity.Cataloge;
import com.example.endmoduleblog.repo.CatalogeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EndmoduleblogApplication implements CommandLineRunner {

    @Autowired
    CatalogeRepo catalogeRepo;

    public static void main(String[] args) {
        SpringApplication.run(EndmoduleblogApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {


        catalogeRepo.save( new Cataloge(1,"A"));
        catalogeRepo.save( new Cataloge(2,"AA"));
        catalogeRepo.save( new Cataloge(3,"AAA"));
        catalogeRepo.save( new Cataloge(4,"AAAA"));
    }
}
