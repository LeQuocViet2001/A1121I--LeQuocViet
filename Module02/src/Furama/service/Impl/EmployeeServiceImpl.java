package Furama.service.Impl;

import Furama.models.Employee;
import Furama.service.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {

    private static List<Employee> employeeList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {

        for( Employee employee : employeeList){
            System.out.println(employee.toString());
        }
        
    }

    @Override
    public void addNew() {
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
    }

    @Override
    public void edit( ) {
        System.out.println("Nhap Id muon edit");
        int id = scanner.nextInt();



/*
        boolean check = false;
        for( Employee employee : employeeList){
            if( employee.getId() == Id){
                check = true;

                // Tien hanh sua




            }
        }*/





    }

    @Override
    public void delete() {

    }
}
