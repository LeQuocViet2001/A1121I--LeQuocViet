package model.bean;

public class Employee {

    private int employee_id;
    private String employee_name;
    private String employee_birthday;
    private String employee_id_card;
    private double employee_salary;
    private String employee_phone;
    private String employee_email;
    private String employee_address;
    private int position_id;
    private int education_degree_id;
    private int division_id;
    private String username;

    public Employee(int employee_id, String employee_name, String employee_birthday, String employee_id_card, double employee_salary, String employee_phone, String employee_email, String employee_address, int position_id, int education_degree_id, int division_id, String username) {
        this.employee_id = employee_id;
        this.employee_name = employee_name;
        this.employee_birthday = employee_birthday;
        this.employee_id_card = employee_id_card;
        this.employee_salary = employee_salary;
        this.employee_phone = employee_phone;
        this.employee_email = employee_email;
        this.employee_address = employee_address;
        this.position_id = position_id;
        this.education_degree_id = education_degree_id;
        this.division_id = division_id;
        this.username = username;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public String getEmployee_birthday() {
        return employee_birthday;
    }

    public String getEmployee_id_card() {
        return employee_id_card;
    }

    public double getEmployee_salary() {
        return employee_salary;
    }

    public String getEmployee_phone() {
        return employee_phone;
    }

    public String getEmployee_email() {
        return employee_email;
    }

    public String getEmployee_address() {
        return employee_address;
    }

    public int getPosition_id() {
        return position_id;
    }

    public int getEducation_degree_id() {
        return education_degree_id;
    }

    public int getDivision_id() {
        return division_id;
    }

    public String getUsername() {
        return username;
    }
}
