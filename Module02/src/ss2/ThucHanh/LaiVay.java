package ss2.ThucHanh;

import java.util.Scanner;

public class LaiVay {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap tien: ");
        money = input.nextDouble();
        System.out.println("Nhap thang: ");
        month = input.nextInt();

        System.out.println("Nhap lai xuat: ");
        interestRate = input.nextDouble();

        double totalInterest = 0;
        for(int i = 0; i < month; i++){
            totalInterest += money * (interestRate/100)/12 * month;
        }

        System.out.println("Tong lai: " + totalInterest);

    }
}
