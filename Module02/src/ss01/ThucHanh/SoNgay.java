package ss01.ThucHanh;

import java.util.Scanner;

public class SoNgay {
    public static void main(String[] args) {

        Scanner scanner = new  Scanner(System.in);
        int t = scanner.nextInt();

        switch (t){
            case 2:
                System.out.println("Co 28 or 29 ngay");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Thang" + t + " co 31 ngay");
                break;
            case 4:
            case 6:
            case 11:
            case 9:
                System.out.println("thang " + t + "  co 30 ngay");
                break;



        }

    }
}


