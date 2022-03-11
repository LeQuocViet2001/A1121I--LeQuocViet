package ss3.BaiTap;

import java.util.Scanner;

public class ThemPt {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap n = ");
        int n = scanner.nextInt();

        int [] arr = new int[n];
        int arr2 [] = new int[n+1];

        for( int i = 0 ; i < n ; i ++){
            System.out.print("Nhap A["+i +"]= ");
            arr[i] = scanner.nextInt();
        }
        for ( int  i = 0 ; i < n ; i++){
            System.out.print( arr[i] + " ");
        }

        System.out.println("Nhap vi tri index chen x =");
        int x = scanner.nextInt();

        if( x<0 || x>n){
            System.out.println("Khong the chen vao vi tri x="+ x);
        }else{

            System.out.println("Nhap gia trican chen a= ");
            int a = scanner.nextInt();

            for( int i = 0 ; i < x ; i++){
                arr2[i] = arr[i];

            }

            for( int i = x+1; i<n+1; i++ ){
                arr2[i] = arr[i-1];
            }

            arr2[x] =a;


            for (int i = 0 ; i < n +1  ; i++){
                System.out.print(arr2[i] + " ");
            }


        }













    }
}
