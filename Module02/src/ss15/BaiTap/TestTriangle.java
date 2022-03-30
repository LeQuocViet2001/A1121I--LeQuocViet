package ss15.BaiTap;

import java.util.Scanner;

public class TestTriangle {

    public static void main(String[] args)  {


        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        double a,b,c;
        Triangle tf ;

        while ( check ){

            System.out.println("Nhap 3 canh tam giac");
            a = scanner.nextDouble();
            b = scanner.nextDouble();
            c=  scanner.nextDouble();

            try {
                tf =  new Triangle(a,b,c);
                check = false;
                System.out.println("La 3 canh 1 tam giac");
            }
            catch (IllegalTriangleException e) {
                e.printStackTrace();
            }


        }




    }


    //Triangle t
}
