package ss06.ThucHanh;

public class ShapeTest {
    public static void main(String[] args) {

        Circle c = new Circle();
        System.out.println( c );

        c = new Circle(3.5);
        System.out.println(c);

        c = new Circle(3.5 , "id", false);
        System.out.println(c);


        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle);

    }
}
