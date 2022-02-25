package ss4.BaiTap;

import java.util.Scanner;

public class TestQuadratic {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a,b,c;

        a=scanner.nextDouble();
        b = scanner.nextDouble();
        c= scanner.nextDouble();

        QuadraticEquation q = new QuadraticEquation(a,b,c);
         if( q.getDiscriminant() < 0){
             System.out.println("Khong co ngihem");
         }
         else if ( q.getDiscriminant() ==0 ){
             System.out.println("Cos 1 nghiem x = " + q.getRoot1());

         }else {
             System.out.printf("Co 2 nghiem x1 = %f x2 = %f", q.getRoot1(), q.getRoot2());
         }

    }
}
