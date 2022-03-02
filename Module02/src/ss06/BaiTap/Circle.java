package ss06.BaiTap;

import javax.crypto.spec.PSource;

public class Circle {
    private double r = 0;
    private String color = "black";



    public Circle() {
    }

    public Circle(double r, String color) {
        this.r = r;
        this.color = color;
    }

    public double  getArea(){
        return  this.r*this.r*3.14;
    }

    public double getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                ", color='" + color + '\'' +
                ", Dien Tich = " + this.getArea()  +

                '}';
    }
}
