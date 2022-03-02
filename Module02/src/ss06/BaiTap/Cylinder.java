package ss06.BaiTap;

public class Cylinder extends Circle {

    private double hight = 0;

    public Cylinder() {
        super();
    }

    public Cylinder(double hight) {
        super();
        this.hight = hight;
    }

    public Cylinder(double r, String color, double hight) {
        super(r, color);
        this.hight = hight;
    }

    public Cylinder( Circle c , double hight){

        super( c.getR(), c.getColor());
        this.hight = hight;


    }

    public double getV(){

        return  super.getArea()*this.hight;
    }



    @Override
    public String toString() {
        String s = "Cylinder{" +
                "hight=" + hight +
                "V =" + this.getV()  +
                " voi thuoc tinh cua hinh tron " +
                 super.toString() + '}';
        return s;
    }
}
