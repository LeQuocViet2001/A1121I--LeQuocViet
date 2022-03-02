package ss06.BaiTap;

public class TestMovePoint {
    public static void main(String[] args) {

        Point2D p = new Point2D();

        MovablePoint mp = new MovablePoint();
        System.out.println(mp);

        mp.seSpeed(3,6);
        System.out.println(mp);
        mp.move();
        System.out.println(mp);


        mp.seSpeed(10,-5);
        System.out.println(mp);
        mp.move();
        System.out.println(mp);


        mp.seSpeed(9,4);
        System.out.println(mp);
        mp.move();
        System.out.println(mp);


    }
}
