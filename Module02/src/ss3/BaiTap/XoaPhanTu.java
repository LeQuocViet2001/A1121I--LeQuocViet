package ss3.BaiTap;

import java.util.Scanner;

public class XoaPhanTu {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap n = ");
        int n = scanner.nextInt();

        int [] arr = new int[n];


        for( int i = 0 ; i < n ; i ++){
            System.out.print("Nhap A["+i +"]= ");
            arr[i] = scanner.nextInt();
        }

        for ( int  i = 0 ; i < n ; i++){
            System.out.print( arr[i] + " ");
        }


        System.out.println("Nhap phan tu can xoa x =");
        int x = scanner.nextInt();

       for( int i =x ; i < n-1; i++ ){
           arr[i] = arr[i+1];
       }
       arr[n-1]= 0;

       for (int i = 0 ; i < n -1 ; i++){
           System.out.print(arr[i] + " ");
       }





    }
}
