package ss4.BaiTap;

public class TestFan {

    public static void main(String[] args) {


        Fan a,b;
        a = new Fan();
        a.setSpeed(3);
        a.setColor("yellow");
        a.setRadius(10);
        a.setOn(true);

        b= new Fan();

        b.setSpeed(1);

        System.out.println( a.toString());

        System.out.println( b.toString());

    }
}
