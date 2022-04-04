package ss16TextFile.BaiTap;

import ss12.ThucHanh.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFileCSV {


    private static String SEPARATION;
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

