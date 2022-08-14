package com.example.endmoduleblog.entity;


import javax.persistence.*;
import java.util.List;

@Entity
public class Cataloge {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int idCategory;
    private String nameCategory;

    @OneToMany(cascade = CascadeType.ALL,
            mappedBy ="cataloge")

    private List<Blog> blogList;

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public List<Blog> getBlogList() {
        return blogList;
    }

    public void setBlogList(List<Blog> blogList) {
        this.blogList = blogList;
    }

    public Cataloge() {
    }

    public Cataloge(int idCategory, String nameCategory, List<Blog> blogList) {
        this.idCategory = idCategory;
        this.nameCategory = nameCategory;
        this.blogList = blogList;
    }

    public Cataloge(int idCategory, String nameCategory) {
        this.idCategory = idCategory;
        this.nameCategory = nameCategory;
    }
}
