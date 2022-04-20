package FinalModule2.Service.Impl;

import CuoiModule2.Models.BenhAn;
import CuoiModule2.utils.RaWBenhAn;
import CuoiModule2.utils.Regex;
import FinalModule2.Model.DienThoai;
import FinalModule2.Model.DtChinhHang;
import FinalModule2.Model.DtXachTay;
import FinalModule2.Service.utils.NotFoundProductException;
import FinalModule2.Service.utils.RWDienThoai;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DienThoaiServiceImpl implements DienThoaiService {

    public static List<DienThoai> listDienThoai = getListDienThoai();
    static Scanner scanner = new Scanner(System.in);


    @Override
    public void themMoi() {
        boolean check = true;
        while ( check){
            System.out.println("Ban muon them ien thoai chinh hanh hay xach tay");
            System.out.println("Chon 1 de them dien thoai chinh hanh");
            System.out.println("Chon 2 de them dien thoai xach tay");

            int i = Integer.parseInt(Regex.regexStr(  "1|2"  , "Khong phai 1 or 2"));

            if( i ==1 ){
                ThemDtChinhHanh();
                check=false;
                break;
            }
            else if (i ==2){
                ThemDtXachTay();
                check=false;
                break;

            }
        }
    }

    @Override
    public void xoa()  {

        boolean check = true;
        System.out.println("");
        System.out.println("Danh sach benh an");
        hienThi();

        while ((check)){

            try {

                System.out.println("Nhap Id benh an ma ban muon xoa");
                int id = Integer.parseInt(Regex.regexStr("^[0-9]+$", "Khong phai dinh dang Int"));
                boolean has = false;
                for (DienThoai dienThoai : listDienThoai) {
                    if (dienThoai.getId() == id) {
                        System.out.println("  Ban co that su muon xoa dien thoai nay : ");
                        System.out.println(dienThoai.toString());
                        String YN = Regex.regexStr("^[YyNn]$", "Hay nhap Y y N n");
                        listDienThoai.remove(dienThoai);
                        RWDienThoai.writeListDienThoai(listDienThoai);
                        System.out.println("Xoa thanh cong");
                        has = true;
                        check = false;
                        break;
                    }


                }
                if (has = false)
                    throw new NotFoundProductException("Khong co san pham nay");
            }catch (NotFoundProductException e)
            {
                System.out.println(e.getMessage());
            }

        }

    }

    @Override
    public void timKiem() {
        List<DienThoai> listSearch= new ArrayList<>() ;
        System.out.println("Nhap thong tin muon tiem kiem");
        String s = scanner.nextLine();

        for( DienThoai dienThoai : listDienThoai){
             String idS = String.valueOf(dienThoai.getId());
             String ten = dienThoai.getTenDienThoai();
            if(    idS.contains(s)     ){
                listSearch.add(dienThoai);
                System.out.println(dienThoai.toString());

            }
            else if ( ten.contains(s))
            {
                listSearch.add(dienThoai);
                System.out.println(dienThoai.toString());
            }
            if(listSearch.size() ==0){
                System.out.println("Khong tim thay san pham");
            }



        }
    }

    @Override
    public void hienThi()  {

       /* if( listDienThoai.isEmpty())
            System.out.println("Danh sach rong");
        else*/
            for( DienThoai diet : getListDienThoai()){
                System.out.println(diet);
            }

    }

    public static void ThemDtChinhHanh(){
        int id ;
        if( listDienThoai.size() == 0)
            id = 1;
        else
            id = listDienThoai.get(listDienThoai.size()-1).getId()  + 1 ;

        System.out.println("Nhap ten dien thoai");
        String name =scanner.nextLine();

        System.out.println("Nhap gia ban");
     //   scanner.nextLine();
        double gia = scanner.nextDouble();

        System.out.println("Nhap so luonhg");
        int soLuong = scanner.nextInt();

        System.out.println("Nhap hang");
        scanner.nextLine();
        String hang = scanner.nextLine();

        System.out.println("Nhap ngay bao hanh");
        int baoHanh = scanner.nextInt();

        System.out.println("Nhap pham vi bao hanh");
        scanner.nextLine();
        String tinhTrang = scanner.nextLine();

        DtChinhHang dtChinhHang = new DtChinhHang(id,name,gia, soLuong, hang, baoHanh, tinhTrang);
        listDienThoai.add(dtChinhHang);
        RWDienThoai.writeListDienThoai(listDienThoai);

    }
    public static void ThemDtXachTay(){


        int id ;
        if( listDienThoai.size() == 0)
            id = 1;
        else
            id = listDienThoai.get(listDienThoai.size()-1).getId()  + 1 ;

        System.out.println("Nhap ten dien thoai");
        String name =scanner.nextLine();

        System.out.println("Nhap gia ban");
        //   scanner.nextLine();
        double gia = scanner.nextDouble();

        System.out.println("Nhap so luonhg");
        int soLuong = scanner.nextInt();

        System.out.println("Nhap hang");
        scanner.nextLine();
        String hang = scanner.nextLine();

        System.out.println("Nhap quoc gia");
        String quocGia  = scanner.nextLine();

        System.out.println("Nhap tinh trang");
        String tinhTrang = scanner.nextLine();

        DtXachTay dtXachTay = new DtXachTay(id,name,gia, soLuong, hang, quocGia, tinhTrang );
        listDienThoai.add(dtXachTay);
        RWDienThoai.writeListDienThoai(listDienThoai);

    }

    public static List<DienThoai> getListDienThoai()  {

        List<DienThoai> listTemp = new ArrayList<>();
        try {
            for ( Object o  : (List<Object>) RWDienThoai.readListDienThoai()){

                    if( o instanceof DtChinhHang)
                        listTemp.add ((DtChinhHang) o);
                    else      listTemp.add ( ((DtXachTay) o));

                }
        } catch (NotFoundProductException e) {
            System.out.println("Khong co san phan nao trong  file");

        }
        return listTemp;
    }


}
