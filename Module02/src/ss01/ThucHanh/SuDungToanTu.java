package ss01.ThucHanh;


import java.util.Scanner;

public class SuDungToanTu {
    public static void main(String[] args) {
        float w;
        float h;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap rong");
        w = sc.nextFloat();

        System.out.println("Nhap dai");
        h = sc.nextFloat();

        float area = w * h;

        System.out.println("Dien tich la = " + area);



    }
}
