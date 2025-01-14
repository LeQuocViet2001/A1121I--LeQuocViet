package model.bean.ContractDAO;

public class AttachService {

    private int attach_service_id;
    private String attach_service_name;
    private String attach_service_status;
    private double attach_service_cost;
    private int attach_service_unit;


    public int getAttach_service_id() {
        return attach_service_id;
    }

    public String getAttach_service_name() {
        return attach_service_name;
    }

    public String getAttach_service_status() {
        return attach_service_status;
    }

    public double getAttach_service_cost() {
        return attach_service_cost;
    }

    public int getAttach_service_unit() {
        return attach_service_unit;
    }

    public AttachService(int attach_service_id, String attach_service_name, String attach_service_status, double attach_service_cost, int attach_service_unit) {
        this.attach_service_id = attach_service_id;
        this.attach_service_name = attach_service_name;
        this.attach_service_status = attach_service_status;
        this.attach_service_cost = attach_service_cost;
        this.attach_service_unit = attach_service_unit;
    }
}
