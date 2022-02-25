package ss4.BaiTap;

public class Fan {

    public static final int slow=1, medium=2, fast=3;

    private  int speed ;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan() {
        this.color = "blue";
        this.radius =5;
        this.on = false;
        this.speed = this.slow;
    }

    public String toString(){

        if( this.on){
            return this.speed + " " + this.color + " " + this.radius+ " fan is on";


        }else
            return this.speed + " " + this.color + " " + this.radius+ " fan is off";

    }
}


