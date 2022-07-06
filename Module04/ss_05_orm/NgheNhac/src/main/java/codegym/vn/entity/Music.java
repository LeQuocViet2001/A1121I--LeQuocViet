package codegym.vn.entity;


import javax.persistence.*;

@Entity
@Table(name = "music")
public class Music {
    @Id
    @Column(name = "id", columnDefinition = " varchar(50)")
    private String id;
    private String name;
    private String urlFile;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrlFile() {
        return urlFile;
    }

    public void setUrlFile(String urlFile) {
        this.urlFile = urlFile;
    }

    public Music() {
    }

    public Music(String id, String name, String urlFile) {
        this.id = id;
        this.name = name;
        this.urlFile = urlFile;
    }
}
