package ss16TextFile.BaiTap;

import ss12.ThucHanh.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFileCSV {


    private static String SEPARATION = ",";

    public static void  WriteListContries(String path, Object o){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(path, true)) ){




        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static List<Countries> ReadListCountries(String path){

        List<Countries> countries = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(path))){
            String line = null;
            // bỏ qua header
            line = reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(SEPARATION);
                int id =  Integer.parseInt(values[0]  );
                String name = values[1];
                String age =   values[2];
                countries.add( new Countries(id,name,age)   );
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return countries;
    }

    }

