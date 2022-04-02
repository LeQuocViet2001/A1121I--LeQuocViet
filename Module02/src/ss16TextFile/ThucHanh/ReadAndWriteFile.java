package ss16TextFile.ThucHanh;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {

    public static List<Integer> readFile (String filePath) {
        List<Integer> numbers = new ArrayList<>();

        try {
            File file = new File(filePath);
            if (!file.exists())
                throw new FileNotFoundException();

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = null;

            while ( (line = br.readLine() ) != null){
                   numbers.add(Integer.parseInt(line));
            }

            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("File khong ton tai");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return numbers;


    }


    public static void writeFile( String filePath, int Max){

        try( BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            bw.write("Gia tri lon nhat la "+ Max);
            //bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        List<Integer> integers = readFile("C:\\Users\\ASUS\\Desktop\\CG\\A1121I1\\Module02\\src\\ss16TextFile\\ThucHanh\\numbers.txt");
       int max = integers.get(0);
       for( int i = 1 ; i < integers.size() ; i++){
           if( max < integers.get(i))
               max = integers.get(i);
       }
       String filePath = "C:\\Users\\ASUS\\Desktop\\CG\\A1121I1\\Module02\\src\\ss16TextFile\\ThucHanh\\intMax.txt";
       writeFile(filePath,max);



    }
}
