package codegym.vn.endmodule.entity;


import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
public class PostNew {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idNews;

    @Size( max = 50, message = "{titleError}")
    @NotBlank(message = "{notempty}")
    private String title;


    @Size( max = 500, message = "{contentError}")
    @Column( columnDefinition = "text")
    @NotBlank(message = "{notempty}")
    private String content;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column( columnDefinition = "date")
    private Date  dateWrite;


    @NotBlank(message = "{notempty}")
    private String author;


    @ManyToOne
    @JoinColumn(name = "idCategory", referencedColumnName = "idCategory")
    private Categoty category;

    public int getIdNews() {
        return idNews;
    }

    public void setIdNews(int idNews) {
        this.idNews = idNews;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDateWrite() {
        return dateWrite;
    }

    public void setDateWrite(Date dateWrite) {
        this.dateWrite = dateWrite;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Categoty getCategory() {
        return category;
    }

    public void setCategory(Categoty category) {
        this.category = category;
    }

    public PostNew() {
    }

    public PostNew(int idNews, @NotBlank(message = "{notempty}") @Size(max = 50, message = "{titleError}") String title, @NotBlank(message = "{notempty}") @Size(max = 500, message = "{contentError}") String content, Date dateWrite, @NotBlank(message = "{notempty}") String author, Categoty category) {
        this.idNews = idNews;
        this.title = title;
        this.content = content;
        this.dateWrite = dateWrite;
        this.author = author;
        this.category = category;
    }

    public PostNew(@NotBlank(message = "{notempty}") @Size(max = 50, message = "{titleError}") String title, @NotBlank(message = "{notempty}") @Size(max = 500, message = "{contentError}") String content, Date dateWrite, @NotBlank(message = "{notempty}") String author, Categoty category) {
        this.title = title;
        this.content = content;
        this.dateWrite = dateWrite;
        this.author = author;
        this.category = category;
    }
}
