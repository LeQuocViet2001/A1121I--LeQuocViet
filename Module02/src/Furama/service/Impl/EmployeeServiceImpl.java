package Furama.service.Impl;

import Furama.models.Employee;
import Furama.service.EmployeeService;
import Furama.service.utils.ReadandWrite;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {

    private static List<Employee> employeeList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {


        employeeList = (List<Employee>) ReadandWrite.readByte("C:\\Users\\ASUS\\Desktop\\CG\\A1121I1\\Module02\\src\\Furama\\Data\\employee.csv");

        for( Employee employee : employeeList){
            System.out.println(employee.toString());
        }
        
    }

    @Override
    public void addNew()  {
        System.out.println("Nhap id: ");
        int id = scanner.nextInt();

        System.out.println("Nhap ten: ");
        scanner.nextLine();
        String name = scanner.nextLine();

        System.out.println("Nhap tuoi: ");
        int tuoi = scanner.nextInt();

        System.out.println("Nam/ Nu: ");
        boolean gioiTinh = scanner.nextBoolean();

        System.out.println("Nhap so dien thoai");
        long soDT = scanner.nextLong();

        System.out.println("Nhap so email");
        scanner.nextLine();
        String email = scanner.nextLine();

        System.out.println("Nhap Trinh do");
        String trinhDo = scanner.nextLine();

        System.out.println("Nhap vi tri");
        String viTri = scanner.nextLine();

        System.out.println("Nhap luong");
        double luong = scanner.nextDouble();

        Employee employee = new Employee( id, name, tuoi, gioiTinh,soDT, email, trinhDo,viTri,luong );
        employeeList.add(employee);

        ReadandWrite.writeByte("C:\\Users\\ASUS\\Desktop\\CG\\A1121I1\\Module02\\src\\Furama\\Data\\employee.csv", employeeList);


    }

    @Override
    public void edit( ) {
        System.out.println("Nhap Id muon edit");
        int id = scanner.nextInt();

        boolean check = false;
        for ( Employee employee : employeeList){
            if( employee.getId() == id ){


                System.out.println("Nhap ten: ");
                String name = scanner.nextLine();

                System.out.println("Nhap tuoi: ");
                int tuoi = scanner.nextInt();

                System.out.println("Nam/ Nu: ");
                boolean gioiTinh = scanner.nextBoolean();

                System.out.println("Nhap so dien thoai");
                long soDT = scanner.nextLong();

                System.out.println("Nhap so email");
                scanner.nextLine();
                String email = scanner.nextLine();

                System.out.println("Nhap Trinh do");
                String trinhDo = scanner.nextLine();

                System.out.println("Nhap vi tri");
                String viTri = scanner.nextLine();

                System.out.println("Nhap luong");
                double luong = scanner.nextDouble();

                employee.setHoTen(name);
                employee.setTrinhDo(trinhDo);
                employee.setViTri(viTri);
                employee.setTuoi(tuoi);
                employee.setLuong(luong);
                employee.setEmail(email);
                employee.setGioiTinh(gioiTinh);
                employee.setSoDT(soDT);

                check = true;
                break;
            }


        }
        if( check == false) {
            System.out.println("ID nay khong ton tai");
        }


    }

    @Override
    public void delete() {

    }
}
