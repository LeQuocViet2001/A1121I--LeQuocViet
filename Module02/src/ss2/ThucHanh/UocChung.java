package ss2.ThucHanh;

import java.util.Scanner;

public class UocChung {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = input.nextInt();
        System.out.println("Enter b: ");
        b = input.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b == 0) {
            System.out.println(" Khong co uoc chung");
        }
        else{
            while (a != b) {
                if (a > b)
                    a = a - b;
                else
                    b = b - a;
            }

            System.out.println("Uoc chung la: " + a);
        }





    }
}

