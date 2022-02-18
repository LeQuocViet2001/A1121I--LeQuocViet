package ss01.ThucHanh;

import java.util.Scanner;

public class PtBac1 {

    public static void main(String[] args) {

        System.out.println("Pt bac 1");

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap a b c");
        double a = sc.nextDouble();
        double b =sc.nextDouble();
        double c = sc.nextDouble();

       // double rs = (c-b)/a;
        if( a!= 0 ){
            System.out.printf(" x = %f " , (c-b)/a );
        }
        else{
            if( b == c ){
                System.out.printf("Vo so ngiem");
            }
            else {
                System.out.printf("Khong co nghiem");
            }
        }
    }
}
