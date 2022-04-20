package FinalModule2.Service.utils;

import CuoiModule2.Models.BenhAn;
import CuoiModule2.utils.NotFoundMedicalRecordException;
import FinalModule2.Model.DienThoai;

import java.io.*;
import java.util.List;

public class RWDienThoai {

    private static String path = "C:\\Users\\ASUS\\Desktop\\CG\\A1121I1\\Module02\\src\\FinalModule2\\Data\\mobiles.csv";

    public static void writeListDienThoai( List<DienThoai> collection)  {
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

    public static Object readListDienThoai() throws NotFoundProductException  {
        File file = new File(path);
        if (!file.exists())
            try {
                file.createNewFile();
            }catch (IOException e){
                e.printStackTrace();
            }

        if (file.length() <=0){
            throw new NotFoundProductException("Khong co san pham nao trong file");
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
