package ss2.ThucHanh;

import java.util.Scanner;

public class MenuThietke {
    public static void main(String[] args) {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        while(choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Tam giac");
            System.out.println("2. Hinh vuong");
            System.out.println("3. Chu Nhat");
            System.out.println("0. Thoat");
            System.out.println("Lua chon cua ban ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Tam giac");
                    System.out.println("******");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case 2:
                    System.out.println("Hinh vuong");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 3:
                    System.out.println("Hinh vuong");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("khong co lua chon!");
            }
        }}
}
