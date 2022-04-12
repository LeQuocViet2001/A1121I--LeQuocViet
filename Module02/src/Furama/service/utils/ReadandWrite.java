package Furama.service.utils;

import ss17.ByteIO.BaiTap.SanPham;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ReadandWrite {


    /////Doc ghi bang Byte
    public static void writeByte(String path, Collection collection)  {

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

    public static Object readByte(String path){


        File file = new File(path);
        if (!file.exists())
            try {
                file.createNewFile();
            }catch (IOException e){
                e.printStackTrace();
            }

      //  List<SanPham> sanPhams = new ArrayList<>();
        Object object = null;
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file)))  {
           // object =  ;
            return ois.readObject();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        return  null;


    }

}
