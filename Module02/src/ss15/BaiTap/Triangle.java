package ss15.BaiTap;

public class Triangle   {

    private double a;
    private double b;
    private double c;
    public Triangle() {

    }

    public Triangle(double a, double b, double c) throws IllegalTriangleException {

        if( a <=0 || b <=0 || c<=0 )
            throw  new  IllegalTriangleException("Co Canh < 0");
        else
        if(   (a > b+c) || (b > c+ a) || (c > a+b))
           throw  new  IllegalTriangleException("Khong phai 3 canh tam giac");
        else {
            this.a = a;
            this.b = b;
            this.c = c;

        }
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}
