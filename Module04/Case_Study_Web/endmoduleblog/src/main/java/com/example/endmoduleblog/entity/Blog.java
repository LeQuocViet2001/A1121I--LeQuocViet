package com.example.endmoduleblog.entity;


import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
public class Blog {

    @Id
    @Pattern(regexp = "^KH\\-\\d{4}$", message = "{errorId}")

    private String idBlog;

    @Size( min = 1, max = 10, message = "{errorSize}")
    private String title;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateWrite;

    @Pattern(regexp = "^[a-zA-Z0-9\\s]+$", message = "khong chua ky tu dac biet")
    private String content;

    @Pattern(regexp = "^[a-zA-Z0-9\\s]+$", message = "viet khong dau")
    private String author;
    private boolean status;

    @Min(value = 1, message = "phai lon hon 0")
    @Max(value = 5, message = "nho hon 5")
    private int  star;

    @ManyToOne
    @JoinColumn(name = "idCategory", referencedColumnName = "idCategory")
    private Cataloge cataloge;
    public Blog() {
    }

    public String getIdBlog() {
        return idBlog;
    }

    public void setIdBlog(String idBlog) {
        this.idBlog = idBlog;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDateWrite() {
        return dateWrite;
    }

    public void setDateWrite(Date dateWrite) {
        this.dateWrite = dateWrite;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public Cataloge getCataloge() {
        return cataloge;
    }

    public void setCataloge(Cataloge cataloge) {
        this.cataloge = cataloge;
    }

    public Blog(String idBlog, String title, Date dateWrite, String content, String author, boolean status, int star, Cataloge cataloge) {
        this.idBlog = idBlog;
        this.title = title;
        this.dateWrite = dateWrite;
        this.content = content;
        this.author = author;
        this.status = status;
        this.star = star;
        this.cataloge = cataloge;
    }


}
