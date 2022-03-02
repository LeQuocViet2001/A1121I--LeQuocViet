package ss06.BaiTap;

public class TestPoint2D3D {
    public static void main(String[] args) {



        Point2D p2 = new Point2D();
        System.out.println(p2);

        Point3D p3 = new Point3D();
        System.out.println(p3);

        p2.setXY(5,3);
        System.out.println(p2);

        p3 = new Point3D(p2, 6);
        System.out.println( p3);

        p3.setX(4);
        p3.setY(2);
        System.out.println( p3);

    }
}
