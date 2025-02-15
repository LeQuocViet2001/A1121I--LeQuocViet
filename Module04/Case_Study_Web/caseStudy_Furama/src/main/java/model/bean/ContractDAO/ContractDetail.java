package model.bean.ContractDAO;

public class ContractDetail {
    private int contract_detail_id;
    private int contract_id;
    private int attach_service_id;
    private int quantity;

    public int getContract_detail_id() {
        return contract_detail_id;
    }

    public int getContract_id() {
        return contract_id;
    }

    public int getAttach_service_id() {
        return attach_service_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public ContractDetail(int contract_detail_id, int contract_id, int attach_service_id, int quantity) {
        this.contract_detail_id = contract_detail_id;
        this.contract_id = contract_id;
        this.attach_service_id = attach_service_id;
        this.quantity = quantity;
    }
}
