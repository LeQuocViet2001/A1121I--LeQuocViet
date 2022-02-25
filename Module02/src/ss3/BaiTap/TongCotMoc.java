package ss3.BaiTap;

import java.util.Scanner;

public class TongCotMoc {

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

        System.out.println("Nhap index cot ban muon tinh tong");
        int v = sc.nextInt();
        if( v< 0  || v >=b){
            System.out.println("Cot nay khong ton tai");
        }
        else {
            int S = 0 ;
            for(int i = 0 ; i< arr.length; i++){
                 S += arr[i][v];

                }
            System.out.println("Tong gia tri o cot index " + v+ "= " + S);
        }
    }
}
