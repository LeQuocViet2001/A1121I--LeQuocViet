package ss5.ThucHanh;

public class Student {

    private int rollono;
    private String name;
    private static String college ="BBDIT";

    Student (int r , String n){
        rollono = r;
        name = n ;
    }
    static void change() {
        college = "CODEGYM";
    }

    //method to display values
    void display() {
        System.out.println(rollono + " " + name + " " + college);
    }


        }
