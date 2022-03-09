package ss07.BaiTap.Coloranle;

import ss06.ThucHanh.Shape;

public class Square extends Shape implements Colorable{

     private  double a = 0;

    public Square(double a) {
        this.a = a;
    }

    public Square(String color, boolean filled, double a) {
        super(color, filled);
        this.a = a;
    }

    public double getArea(){
        return a*a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
