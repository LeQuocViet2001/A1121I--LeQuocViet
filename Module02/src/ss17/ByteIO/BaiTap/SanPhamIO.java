package ss17.ByteIO.BaiTap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SanPhamIO {
    static  String path = "C:\\Users\\ASUS\\Desktop\\CG\\A1121I1\\Module02\\src\\ss17\\ByteIO\\BaiTap\\spham.txt";

    public static void main(String[] args) {

        List<SanPham> sanPhams = new ArrayList<>();
        sanPhams.add( new SanPham(1,"A",12.4));
        sanPhams.add( new SanPham(2,"B",15.4));
        sanPhams.add( new SanPham(3,"C",16.4));
        addSanPham(sanPhams);

        writeByteSanPham(path , sanPhams );

        Scanner cn = new Scanner(System.in);
        System.out.println("Nhap id sp muon tim");
        //String name = cn.nextLine();
        int id = cn.nextInt();

        System.out.println( timKiemSanPham(id).toString());






    }

    static SanPham timKiemSanPham( int id ){

        List<SanPham> sanPhams = readByteSanPham(path);
        SanPham rs =null ;

        for( SanPham sanPham : sanPhams){
            if ( sanPham.getMasp() == id)
            {
                rs = sanPham;
                break;
            }
        }

        return rs;


    }

   static public void addSanPham( List<SanPham> sanPhams){
        Scanner cn = new Scanner(System.in);
        System.out.println("Them 1 san pham");
        System.out.println("Nhap id");
        int id = cn.nextInt();
        System.out.println("Nhap ten");
        cn.nextLine();
         String name  =cn.nextLine();
        System.out.println("Nhap gia");
        double gia  = cn.nextDouble();

        sanPhams.add( new SanPham(id, name, gia) );

    }

    public static void writeByteSanPham(String path, List<SanPham> sanPhams){

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))){
            oos.writeObject(sanPhams);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static  List<SanPham> readByteSanPham (String path){

        List<SanPham> sanPhams = new ArrayList<>();
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path)))  {


            sanPhams = (List<SanPham>) ois.readObject();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        return  sanPhams;


    }
}
