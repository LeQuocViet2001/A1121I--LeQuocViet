package ss07.BaiTap.ITFResizeable;

import ss06.ThucHanh.Shape;

public class Triangle extends Shape implements  Resizeable {

    private double a = 1f, b = 1 , c = 1;

    public Triangle() {
    }

    public Triangle(double size1, double size2, double size3) {
        this.a = size1;
        this.b = size2;
        this.c = size3;
    }


    public double getArea(){
        return  a+b+c;
    }

    public double getPerimeter(){

        double p = (a+b+c) /2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    public String toString() {
        return "Tam Giac: " + a+ ", " +   b + ", "+ c + " \n Chu vi C = "+ this.getPerimeter() + ", Dien Tich S = " + getArea();
    }

    public double getSize1() {
        return a;
    }

    public void setSize1(double size1) {
        this.a = size1;
    }

    public double getSize2() {
        return b;
    }

    public void setSize2(double size2) {
        this.b = size2;
    }

    public double getSize3() {
        return c;
    }

    public void setSize3(double size3) {
        this.c = size3;
    }

    @Override
    public void resize(double percent) {

        this.a += this.a*percent;
        this.b += this.b*percent;

        this.c += this.c*percent;

    }
}