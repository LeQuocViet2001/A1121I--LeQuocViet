package ss01.BaiTap;

import java.util.Scanner;

public class SoToChu {
    public static void main(String[] args) {

        int n;
        do {
            System.out.println("Nhap 1 so n = ");
            Scanner scanner = new Scanner(System.in);
            n = scanner.nextInt();
            String rs = "";

            if(n == -1) System.out.println("Ket thuc");
            else if( n< 0 || n > 999  ) {
                System.out.println("Nhap lai");
                continue;}
            else if ( n < 100) rs = readtens(n);   // -1 de thoat
            else if ( n < 999){

                int tram, chuc, dv;
                tram = n/100;
                chuc = n%100;
                rs = read0nes(tram) + " hundred " + readtens(chuc);
            }
            System.out.println(rs);

        }while ( n != -1 );




    }

    public static String read0nes( int a){
        String rs = "" ;
        switch (a){
            case 0: rs = "zero"; break;
            case 1: rs = "one" ;break;
            case 2: rs = "two"; break;
            case 3: rs = "three" ; break;
            case 4: rs= "four"; break;
            case 5: rs= "five"; break;
            case 6: rs ="six"; break;
            case 7 : rs ="seven"; break;
            case 8 : rs ="eight"; break;
            case 9 : rs = "nine"; break;
        }
        return  rs;

    }

    public  static String  readtens( int n ) {

        String rs = "";
        if (n >= 0 && n < 10) rs = read0nes(n);
        else if(  n< 20 )
        {
            switch (n) {
                case 10: rs = "ten"; break;
                case 11: rs ="eleven"; break;
                case 12: rs ="Twelve"; break;
                case 13: rs = "thirteen"; break;
                case 15: rs = "fifteen"; break;
                default: {
                    int dv, hc;
                    dv = n % 10;
                    rs = read0nes(dv) + "teen";
                    break;
                }
            }

        }
        else if ( n <100 )
        {
            int ones, tens;
            ones = n%10;
            tens = (n - ones)/10;

            switch (tens){
                case 2: rs = "twenty"; break;
                case 3: rs = "thirty"; break;
                case 5: rs = "fifty"; break;
                default:
                    rs = rs= read0nes(tens) + "ty"; break;
            }
            if ( ones != 0) {
                rs += " " +read0nes(ones);
            }

        }
        return rs;

    }


 /*        if( n>=100 && n<=999){

    }else if( n< 100 ){

    }*/

    }





