package ss3.BaiTap;

import java.util.Scanner;

public class Max2Chieu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so hang");
        int a = sc.nextInt();

        System.out.println("Nhap so cot");
        int b = sc.nextInt();

        int arr [][] = new int[a][b];

        for(int i = 0 ; i< a; i++){
            for (int j =0; j<b; j++){

                System.out.printf("Arr[ %d ][%d ]= " ,i,j );
                arr[i][j]= sc.nextInt();
            }
        }


        for(int i = 0 ; i< arr.length; i++){
            for (int j =0; j< arr[i].length; j++){
                System.out.printf( arr[i][j] + " ");
            }
            System.out.printf("\n");
        }


        int max= arr[0][0];

        for(int i = 0 ; i < a; i++){
            for (int j =0; j<b; j++){
                if( arr[i][j] > max ){
                    max = arr[i][j];
                }
            }
        }

        System.out.printf("Max trong mang la " + max);


    }

}
