package ss2.BaiTap;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class NtDauTien {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

         if ( n==2){
             System.out.println(2);
         }
         else if ( n > 2){
             int c = 0, i=2;

             while ( c<20 && i <n){

                 boolean nt = true;
                 for( int l = 2; l <= sqrt(i) ; l++ ){
                     if( i % l ==0){
                         nt =false;
                         break;
                     }
                 }
                 if( nt == true){
                     c++;
                     System.out.println(i + " ");
                 }

                 i++;

             }


         }
    }
}
