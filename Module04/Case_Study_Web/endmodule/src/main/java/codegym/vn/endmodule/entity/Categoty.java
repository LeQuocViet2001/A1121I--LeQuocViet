package codegym.vn.endmodule.entity;


import javax.persistence.*;
import java.util.List;

@Entity
public class Categoty {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCategory;

    private String nameCategory;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private List<PostNew> postNews;

    public Categoty() {
    }


    public Categoty(int idCategory, String nameCategory, List<PostNew> postNews) {
        this.idCategory = idCategory;
        this.nameCategory = nameCategory;
        this.postNews = postNews;
    }

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

    public List<PostNew> getPostNews() {
        return postNews;
    }

    public void setPostNews(List<PostNew> postNews) {
        this.postNews = postNews;
    }
}
