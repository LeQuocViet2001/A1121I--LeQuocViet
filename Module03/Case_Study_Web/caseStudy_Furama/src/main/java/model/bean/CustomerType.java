package model.bean;

public class CustomerType  extends ObjectType2Filed {


    public CustomerType(int id, String name) {
        super(id, name);
    }



    public int getCustomerTypeId() {
        return super.getId();
    }


    public void setCustomerTypeId(int id) {
        super.setId(id);
    }



    public String getCustomerTypeName() {
        return super.getName();
    }


    public void setCustomerTypeName(String name) {
        super.setName(name);
    }

    //    private int customer_type_id;
//
//    public int getCustomer_type_id() {
//        return customer_type_id;
//    }
//
//    public void setCustomer_type_id(int customer_type_id) {
//        this.customer_type_id = customer_type_id;
//    }
//
//    public String getCustomer_type_name() {
//        return customer_type_name;
//    }
//
//    public void setCustomer_type_name(String customer_type_name) {
//        this.customer_type_name = customer_type_name;
//    }
//
//    private String customer_type_name;
//
//    public CustomerType(int customer_type_id, String customer_type_name) {
//        this.customer_type_id = customer_type_id;
//        this.customer_type_name = customer_type_name;
//    }
}
