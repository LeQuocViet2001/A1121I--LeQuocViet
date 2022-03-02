package ss06.BaiTap;

public class TestCircleCylinder {

    public static void main(String[] args) {


        Circle c = new Circle();
        System.out.println(c);


        Cylinder l = new Cylinder();
        System.out.println(l);

        c = new Circle(6, "blue");
        System.out.println(c);

        l = new Cylinder( c, 7);
        System.out.println(l);



    }

}
