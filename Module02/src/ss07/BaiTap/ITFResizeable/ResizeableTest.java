package ss07.BaiTap.ITFResizeable;

public class ResizeableTest {

    public static void main(String[] args) {


        Circle c = new Circle(3.4);
        System.out.println(c);
        System.out.println("Sau khi Resize");
        c.resize(0.5);
        System.out.println(c);
        System.out.println("\n");






       Triangle tg = new Triangle(3,4,5);
        System.out.println(tg);
        System.out.println("\n Sau khi Resize");
        tg.resize(0.5);
        System.out.println(tg);


    }
}
