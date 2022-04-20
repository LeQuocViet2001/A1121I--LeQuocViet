package CuoiModule2.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Regex {


    Scanner scanner = new Scanner(System.in);
    public static String regexStr(String regex, String err)
    {   Scanner sc = new Scanner(System.in);
        boolean check = true;
        String temp;

        do {
            temp = sc.nextLine();
            if (temp.matches(regex)){
                check = false;
            }
            else
            {
                System.out.println(err);
                System.out.println("Xin nhap lai");
            }
        }while (check);
        return temp;
    }

    public static String regexRavien(String chuoiNgayVao){
        Scanner scanner= new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String chuoiNgayRa = "";

        boolean check = true;
        while (check){

            System.out.println("Nhap ngay ra vien");
            chuoiNgayRa= Regex.regexStr("^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[1,3-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$","Khong phai dinh dang ngay");

            LocalDate ngayVao = LocalDate.parse(chuoiNgayVao,formatter);
            LocalDate  ngayRa = LocalDate.parse(chuoiNgayRa,formatter);
            if(  ngayRa.isAfter(ngayVao) )
            {
               break;
            }
            else {
                System.out.println("Ngay ra vien o truoc ngay vao, Xin  nhap lai");
            }
        }
        return chuoiNgayRa;
    }



}
