package ss5.BaiTap;

public class Circle {

    private double radius =1f;
    private  String color = "red";

    public  Circle(){

    }

    public Circle( double r){
        this.radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){

        return  this.radius*this.radius*3.14;
    }


}
