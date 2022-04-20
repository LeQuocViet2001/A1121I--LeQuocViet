package FinalModule2.Controler;

import CuoiModule2.Imps.BenhAnServiceImps;
import CuoiModule2.utils.Regex;
import FinalModule2.Service.Impl.DienThoaiServiceImpl;
import FinalModule2.Service.utils.NotFoundProductException;

import java.sql.SQLOutput;
import java.util.Scanner;

public class QuanLyDienThoai {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("-CHUONG TRINH QUAN LY DIEN THOAI");
        boolean check = true;
        while (check){
            System.out.println("Chon chuc nang theo so thu tu de tiep tuc");
            System.out.println("1. Them moi");
            System.out.println("2. Xoa");
            System.out.println("3. Xem danh sach dien thoai");
            System.out.println("4. Tim kiem");
            System.out.println("5. Thoat");
            System.out.println("Chon chuc nang");
            int i =   Integer.parseInt(    Regex.regexStr("[1-5]", "Xin hay nhap tu 1-5"));

            switch (i){
                case 1:
                {
                    System.out.println("1. Them moi");
                    themMoiDienThoai();
                    break;
                }
                case  2:{
                    System.out.println("2: Xoa");
                    xoaDienThoai();
                    break;
                }
                case 3:{
                    System.out.println("3: Danh sach dien thoai");
                    hienThiDanhSach();
                    break;
                }
                case 4:
                {
                    System.out.println("Tim kiem du lieu");
                    timKiemDienThoai();
                    break;

                }
                case 5:
                {
                    check =false;
                    break;
                }
            }
        }

    }

    public static void themMoiDienThoai(){
        DienThoaiServiceImpl dienThoaiService = new DienThoaiServiceImpl();
        dienThoaiService.themMoi();

    }

    public static  void xoaDienThoai()  {
        DienThoaiServiceImpl dienThoaiService = new DienThoaiServiceImpl();

           dienThoaiService.xoa();

    }

    public static  void hienThiDanhSach()  {
        DienThoaiServiceImpl dienThoaiService = new DienThoaiServiceImpl();

             dienThoaiService.hienThi();

    }


    public static void timKiemDienThoai(){
        DienThoaiServiceImpl dienThoaiService = new DienThoaiServiceImpl();
        dienThoaiService.timKiem();
    }



}
