package codegym.vn.casestudy_spring.entity.ContractDao;


import javax.persistence.*;

@Entity
public class ContracDetail {


    public ContracDetail(Contract contract, AttachService attachService, int quantity) {
        this.contract = contract;
        this.attachService = attachService;
        this.quantity = quantity;
    }

    public ContracDetail() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "idContract", referencedColumnName = "idContract")
    private Contract contract;

    @ManyToOne
    @JoinColumn(name = "idAttachService", referencedColumnName = "idAttachService")
    private AttachService attachService;


    private int quantity;

    public Contract getContract() {
        return contract;
    }

    public ContracDetail(int id, Contract contract, AttachService attachService, int quantity) {
        this.id = id;
        this.contract = contract;
        this.attachService = attachService;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public AttachService getAttachService() {
        return attachService;
    }

    public void setAttachService(AttachService attachService) {
        this.attachService = attachService;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
