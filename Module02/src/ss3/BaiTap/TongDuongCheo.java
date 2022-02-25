package ss3.BaiTap;

import java.util.Scanner;

public class TongDuongCheo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so hang cot n =");
        int a = sc.nextInt();


        int arr [][] = new int[a][a];

        for(int i = 0 ; i< a; i++){
            for (int j =0; j<a; j++){

                System.out.printf("Arr[ %d ][%d ]= " ,i,j );
                arr[i][j]= sc.nextInt();
            }
        }

        int S = 0;
        for(int i = 0 ; i< arr.length; i++){
            for (int j =0; j< arr[i].length; j++){

                if( i == j )   S += arr[i][i];
                System.out.printf( arr[i][j] + " ");
            }
            System.out.printf("\n");
        }




    }
}
