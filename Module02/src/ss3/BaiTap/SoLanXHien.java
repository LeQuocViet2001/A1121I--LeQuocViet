package ss3.BaiTap;

import java.util.Scanner;

public class SoLanXHien {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi");
        String s = scanner.nextLine();

        int c =0;
        System.out.println("Nhap ky tu can tim");
        char x =  scanner.next().charAt(0);


        for( int i = 0 ; i< s.length(); i++){

            if( s.charAt(i) == x) c++;


        }
        System.out.println("So lan lap cua "+ x + " =" + c);

    }
}
