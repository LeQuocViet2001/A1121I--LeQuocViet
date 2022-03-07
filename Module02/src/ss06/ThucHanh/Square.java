package ss06.ThucHanh;

public class Square extends Shape {

     private  double a = 0;


    public Square(double a) {
        this.a = a;
    }

    public Square(String color, boolean filled, double a) {
        super(color, filled);
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
}
