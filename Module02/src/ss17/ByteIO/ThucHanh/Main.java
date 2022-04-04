package ss17.ByteIO.ThucHanh;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Vũ Kiều Anh", "Hà Nội"));
        students.add(new Student(2, "Nguyễn Minh Quân", "Hà Nội"));
        students.add(new Student(3, "Đặng Huy Hoà", "Đà Nẵng"));
        students.add(new Student(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        students.add(new Student(5, "Nguyễn Khắc Nhật", "Hà Nội"));
        writeToFile("C:\\Users\\ASUS\\Desktop\\CG\\A1121I1\\Module02\\src\\ss17\\ByteIO\\ThucHanh\\student.txt", students);
        List<Student> studentDataFromFile = readFromFile("C:\\Users\\ASUS\\Desktop\\CG\\A1121I1\\Module02\\src\\ss17\\ByteIO\\ThucHanh\\student.txt");
        for (Student student : studentDataFromFile){
            System.out.println(student);
        }

    }

    public static void writeToFile(String path, List<Student> students) {
        try ( ObjectOutputStream oos = new ObjectOutputStream( new FileOutputStream(path))) {
           /* FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);*/
            oos.writeObject(students);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public  static  List<Student> readFromFile(String path){

        List<Student> students = new ArrayList<>();

        try(ObjectInputStream oi = new ObjectInputStream(new FileInputStream(path))) {

             students = (List<Student> )  oi.readObject();


         } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        return  students;



    }



}
