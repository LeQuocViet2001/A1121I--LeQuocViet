package codegym.vn.casestudy_spring.entity.ContractDao;


import javax.persistence.*;
import java.util.List;

@Entity
public class AttachService {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAttachService;
    private String name;
    private double cost;
    private int unit;
    private String status;

    public AttachService(int idAttachService, String name, double cost, int unit, String status) {
        this.idAttachService = idAttachService;
        this.name = name;
        this.cost = cost;
        this.unit = unit;
        this.status = status;
    }

    public int getIdAttachService() {
        return idAttachService;
    }

    public void setIdAttachService(int idAttachService) {
        this.idAttachService = idAttachService;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<ContracDetail> getContracDetailListattachments() {
        return contracDetailListattachments;
    }

    public void setContracDetailListattachments(List<ContracDetail> contracDetailListattachments) {
        this.contracDetailListattachments = contracDetailListattachments;
    }

    public AttachService() {
    }

    public AttachService(int idAttachService, String name, double cost, int unit, String status, List<ContracDetail> contracDetailListattachments) {
        this.idAttachService = idAttachService;
        this.name = name;
        this.cost = cost;
        this.unit = unit;
        this.status = status;
        this.contracDetailListattachments = contracDetailListattachments;
    }

    @OneToMany(cascade = CascadeType.ALL,
    mappedBy = "contract")
    private List<ContracDetail> contracDetailListattachments;



}
