package ss2.BaiTap;

import java.util.Scanner;

    public class LoaiHinh {
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

                        System.out.println("Nhap chieu dai  canh goc vuong");
                        int a = scanner.nextInt();

                        for(int i=1; i<=a; i++)
                        {   for(int j=1; j<=i; j++)
                                System.out.print("* ");

                               System.out.print("\n");
                        }
                        break;

                    case 2:
                        System.out.println("Hinh vuong");
                        System.out.println("Nhap chieu dai rong");
                        int b = scanner.nextInt();

                        for ( int  i = 0 ; i < b ; i++)
                            for ( int j = 0 ; j< b ; i++)
                            { System.out.print("* ");

                            }
                        System.out.print("\n");


                        break;
                    case 3:
                        System.out.println("Hinh chu nhat");
                        System.out.println("Nhap chieu dai ");
                        int d = scanner.nextInt();
                        System.out.println("Nhap chieu rong ");
                        int r = scanner.nextInt();

                        for ( int  i = 0 ; i < d ; i++)
                            for ( int j = 0 ; j< r ; i++)
                            { System.out.print("* ");

                            }
                        System.out.print("\n");
                        break;
                    case 0:
                        System.exit(0);
                    default:
                        System.out.println("khong co lua chon!");
                }
            }}
    }


