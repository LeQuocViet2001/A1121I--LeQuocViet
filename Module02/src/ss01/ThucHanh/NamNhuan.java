package ss01.ThucHanh;

import java.util.Scanner;

public class NamNhuan {

    public static void main(String[] args) {

        int t;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao nam ");
        t = scanner.nextInt();

        boolean a = false;
        if ( t % 4 ==0 && t%100 !=0){
            a = true;
        }
        else if ( t % 100 ==0 && t % 400 == 0   ){
            a = true;
        }

        if( a ){
            System.out.println( t + " La nam nhuan");

        }else System.out.println( t + " la nam khong nhuan");



    }
}
