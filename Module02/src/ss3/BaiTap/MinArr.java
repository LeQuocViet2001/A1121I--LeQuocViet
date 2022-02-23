package ss3.BaiTap;

import java.util.Scanner;

public class MinArr {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.printf("Nhap size = ");
        int  n = scanner.nextInt();

        int [] a = new int[n];
        for (int i =0; i <n; i++){
            System.out.printf("A[%d]= ",i);
            a[i] = scanner.nextInt();
        }
        int min = a[0];
        for(int i = 1 ; i <n; i++){
            if (a[i] < min )
                min=a[i];
        }

        System.out.printf("Min la " + min);

    }
}
