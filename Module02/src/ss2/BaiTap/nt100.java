package ss2.BaiTap;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class nt100 {

    public static void main(String[] args) {
        int c = 1;
        /*Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap n");
        n = scanner.nextInt();*/


        int n = 3;
        System.out.print(2 +" ");

        while (  n < 100 ) {

            boolean nt = true;
            for( int i = 2 ; i <= sqrt(n); i++){

                if (  n % i == 0) {
                         nt = false;
                         break;
                }
            }

            if (nt  ==true ) {
                System.out.print(n + " ");
                 }
            n++;
        }
    }


}
