package CuoiModule2.utils;

import CuoiModule2.Models.BenhAn;
import CuoiModule2.Models.BenhAnThuong;
import ss17.ByteIO.BaiTap.SanPham;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RaWBenhAn {

    private static String path = "C:\\Users\\ASUS\\Desktop\\CG\\A1121I1\\Module02\\src\\CuoiModule2\\Data\\medical_records.csv";

    public static void writeListBenhAn( List <BenhAn> collection)  {
        File file = new File(path);
        if (!file.exists())
            try {
                file.createNewFile();
            }catch (IOException e){
                e.printStackTrace();
            }
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))){
            oos.writeObject(collection);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Object readListBenhAn()  throws NotFoundMedicalRecordException {
  //      List<BenhAnThuong> rs = new ArrayList<>();
        File file = new File(path);
        if (!file.exists())
            try {
                file.createNewFile();
            }catch (IOException e){
                e.printStackTrace();
            }

        if (file.length() <=0){
            throw new NotFoundMedicalRecordException("Khong co du lieu trong file");
        }

        Object rs  = new Object();
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file)) )  {
            rs = ois.readObject();
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (  ClassNotFoundException ioException) {
            ioException.printStackTrace();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return rs;
    }

}
