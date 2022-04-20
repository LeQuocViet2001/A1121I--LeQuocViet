package CuoiModule2.Imps;

import CuoiModule2.Models.BenhAn;
import CuoiModule2.Models.BenhAnThuong;
import CuoiModule2.Models.BenhAnVip;
import CuoiModule2.utils.NotFoundMedicalRecordException;
import CuoiModule2.utils.RaWBenhAn;
import CuoiModule2.utils.Regex;

import javax.lang.model.element.Element;
import javax.swing.*;
import java.lang.annotation.ElementType;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BenhAnServiceImps extends BenhAnService {

    public static List<BenhAn> benhAnList = getListBenhAn();
    public static Scanner scanner = new Scanner(System.in);

    @Override
    public void themBenhAn() {

        boolean check = true;
        while ( check){
            System.out.println("Ban muon them benh an thuong hay Vip");
            System.out.println("Chon 1 de them benh an thuong");
            System.out.println("Chon 2 de them benh an Vip");

            int i = Integer.parseInt(Regex.regexStr(  "1|2"  , "Khong phai 1 or 2"));

            if( i ==1 ){
                themBenhAnThuong();
                check=false;
                break;
            }
            else if (i ==2){
                themBenhAnVip();
                check=false;
                break;

            }
        }
    }

    @Override
    public void xoa() {
        boolean check = true;
        System.out.println("");
        System.out.println("Danh sach benh an");
        hienThi();

        while ((check)){

            System.out.println("Nhap Id benh an ma ban muon xoa");
            int id  = Integer.parseInt( Regex.regexStr("^[0-9]+$","Khong phai dinh dang Int"));

            for ( BenhAn benhAn : benhAnList){
                if( benhAn.getStt() == id){
                    System.out.println("  Ban co that su muon xoa benh an : " );
                    System.out.println(benhAn.toString());
                    String YN = Regex.regexStr("^[YyNn]$","Hay nhap Y y N n");
                    benhAnList.remove(benhAn);
                    RaWBenhAn.writeListBenhAn(benhAnList);
                    System.out.println("Xoa thanh cong");
                    check =false;
                    break;
                }

            }

        }

    }

    public static List<BenhAn> getListBenhAn(){
        List<BenhAn> listTemp= new ArrayList<>();
        try {
            for ( Object benhan  : (List<Object>) RaWBenhAn.readListBenhAn()){

                if( benhan instanceof BenhAnThuong)
                    listTemp.add ((BenhAnThuong) benhan);
                else      listTemp.add ( ((BenhAnVip) benhan));

            }
        } catch (NotFoundMedicalRecordException  e)    {
            System.out.println(e.getMessage());
        }
        return listTemp;
    }

    @Override
    public  void hienThi() {

        if( benhAnList.isEmpty())
            System.out.println("Danh sach rong");
        else
        for( BenhAn benhAn : benhAnList){
            System.out.println(benhAn);
        }
/*        try {
            for ( Object benhan  : (List<Object>)  RaWBenhAn.readListBenhAn()){
                if( benhan instanceof BenhAnThuong)
                    System.out.println( ((BenhAnThuong) benhan).toString());
                else     System.out.println( ((BenhAnVip) benhan).toString());

            }
        } catch (NotFoundMedicalRecordException  e)    {
            System.out.println(e.getMessage());
        }*/

    }

    public void themBenhAnThuong(){

        int stt ;
        if( benhAnList.size() == 0)
            stt = 1;
        else
            stt = benhAnList.get(benhAnList.size()-1).getStt()  + 1 ;

        System.out.println("Nhap ma Benh An");
        // scanner.nextLine();
        String maBenhAn =  Regex.regexStr( "BA-[\\d]{3}", "Khong dung dinh dang Ma benh an");
        System.out.println("Nhap ten Benh Nhan");
        String tenBenhNhan =   Regex.regexStr( "BN-[\\d]{3}", "Khong dung dinh dang Ma benh nhan");
        System.out.println("Nhap ngay nhap vien");
    //    String ngayNhapVien= Regex.regexStr("^(0[1-9]|[12][0-9]|[3][01])/(0[1-9]|1[012])/\\d{4}$","Khong phai dinh dang ngay");


        String ngayNhapVien= Regex.regexStr("^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[1,3-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$","hong phai ngay");

        System.out.println("Nhap ngay ra vien");
        String ngayRaVien = Regex.regexRavien( ngayNhapVien );
        System.out.println("Nhap ly do");
        String lyDo = scanner.nextLine();
        System.out.println("Nhap phi nam vien");
        double phiNamVien = scanner.nextDouble();


        BenhAnThuong benhAnThuong = new BenhAnThuong(stt, maBenhAn, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDo, phiNamVien);
        benhAnList.add(benhAnThuong);
        RaWBenhAn.writeListBenhAn(  benhAnList);

    }


    public void themBenhAnVip(){



        int stt ;
        if( benhAnList.size() == 0)
            stt = 1;
        else
            stt = benhAnList.get(benhAnList.size()-1).getStt()  + 1 ;

        System.out.println("Nhap ma Benh An");
        String maBenhAn =  Regex.regexStr( "BA-[\\d]{3}", "Khong dung dinh dang Ma benh an");
        System.out.println("Nhap ten Benh Nhan");
        String tenBenhNhan =   Regex.regexStr( "BN-[\\d]{3}", "Khong dung dinh dang Ma benh nhan");
        System.out.println("Nhap ngay nhap vien");
        String ngayNhapVien= scanner.nextLine();

        System.out.println("Nhap ngay ra vien");
        String ngayRaVien = scanner.nextLine();
        System.out.println("Nhap ly do");
        String lyDo = scanner.nextLine();
        System.out.println("Nhap thoi han");
        String thoihan = scanner.nextLine();
        System.out.println("Loai Vip (1,2,3)");
        int loaiVip = scanner.nextInt();
//      /  String  vip= Regex.regexStr(  "VIP [123]","VIp sai");


        BenhAnVip benhAnVip = new BenhAnVip(stt, maBenhAn, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDo, loaiVip, thoihan);
       benhAnList.add(benhAnVip);
       RaWBenhAn.writeListBenhAn(benhAnList);

    }
}
