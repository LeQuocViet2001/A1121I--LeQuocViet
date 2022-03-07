package ss06.BaiTap;

import ss06.ThucHanh.Shape;

import java.util.Scanner;

public  class TestTamGiac {


    public static void main(String[] args) {


        Scanner sc = new Scanner( System.in);

        double a= 0,b=0,c=0;
         boolean t = false;

        do{
            System.out.println("Nhap 3 canh tm giac a,b,c");
            a =sc.nextDouble();
            b=sc.nextDouble();
            c= sc.nextDouble();

            if( a<=0 ||b<=0 || c<= 0) t =false;
            else {
                if( a+b >=c && b+c>=a && a+c>=b)
                    t= true;
                else{
                    System.out.println("\n Nhap lai");
                }

            }

        }while (t==false);

        Triangle tg = new Triangle(a,b,c);
        System.out.println(tg);

    }
}
