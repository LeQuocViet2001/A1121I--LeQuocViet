package CuoiModule2.Controlers;

import CuoiModule2.Imps.BenhAnServiceImps;
import CuoiModule2.utils.Regex;
import Furama.service.Impl.BookingServiceImpl;

import java.util.Scanner;

public class BenhAnControler {


    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("-CHUONG TRINH QUAN LI BEN AN");
        boolean check = true;
        while (check){
            System.out.println("Chon chuc nang theo so thu tu de tiep tuc");
            System.out.println("1. Them moi");
            System.out.println("2. Xoa");
            System.out.println("3. Xem danh sach benh an");
            System.out.println("4. Thoat");
            System.out.println("Chon chuc nang");
            int i =   Integer.parseInt(    Regex.regexStr("[1-4]", "Xin hay nhap tu 1-4"));

            switch (i){
                case 1:
                {
                    System.out.println("1. Them moi");
                    themMoiBenhAn();
                    break;
                }
                case  2:{
                    System.out.println("2: Xoa");
                    xoaFileCsv();
                    break;
                }
                case 3:{
                    System.out.println("3: Danh sach benh an");
                    hienThiDsBenhAn();
                    break;
                }
                case 4:
                {
                    check =false;
                    break;
                }
            }
        }

    }


     public static void  themMoiBenhAn(){
         BenhAnServiceImps benhAnServiceImps = new BenhAnServiceImps();
         benhAnServiceImps.themBenhAn();

     }

     public  static void  hienThiDsBenhAn(){
         BenhAnServiceImps benhAnServiceImps = new BenhAnServiceImps();
         benhAnServiceImps.hienThi();

     }
     public static void xoaFileCsv(){
          BenhAnServiceImps benhAnServiceImps = new BenhAnServiceImps();
          benhAnServiceImps.xoa();
     }

}
