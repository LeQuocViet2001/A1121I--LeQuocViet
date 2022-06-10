package model.bean.ContractDAO;

public class Contract {
    private int contract_id;
    private String contract_start_date;
    private String contract_end_date;
    private double contract_deposit;
    private double contract_total_money;
    private int employee_id;
    private int customer_id;
    private int service_id;

    public int getContract_id() {
        return contract_id;
    }

    public String getContract_start_date() {
        return contract_start_date;
    }

    public String getContract_end_date() {
        return contract_end_date;
    }

    public double getContract_deposit() {
        return contract_deposit;
    }

    public double getContract_total_money() {
        return contract_total_money;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public int getService_id() {
        return service_id;
    }

    public Contract(int contract_id, String contract_start_date, String contract_end_date, double contract_deposit, double contract_total_money, int employee_id, int customer_id, int service_id) {
        this.contract_id = contract_id;
        this.contract_start_date = contract_start_date;
        this.contract_end_date = contract_end_date;
        this.contract_deposit = contract_deposit;
        this.contract_total_money = contract_total_money;
        this.employee_id = employee_id;
        this.customer_id = customer_id;
        this.service_id = service_id;
    }
}
