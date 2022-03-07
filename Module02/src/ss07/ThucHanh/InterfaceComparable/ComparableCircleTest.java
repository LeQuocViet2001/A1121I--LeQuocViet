package ss07.ThucHanh.InterfaceComparable;

import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle [] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(1.0);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(3.5, "indigo");


        System.out.println("Truoc khi Xap xep:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }


        Arrays.sort(circles);

        System.out.println("Sau khi sap xep");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }



    }
}
