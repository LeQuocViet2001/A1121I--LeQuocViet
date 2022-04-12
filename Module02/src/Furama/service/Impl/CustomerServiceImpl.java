package Furama.service.Impl;

import Furama.models.Customer;
import Furama.models.Employee;
import Furama.service.CustomerService;
import Furama.service.utils.ReadandWrite;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {

    List<Customer> customerList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {

        customerList = (List<Customer>) ReadandWrite.readByte("C:\\Users\\ASUS\\Desktop\\CG\\A1121I1\\Module02\\src\\Furama\\Data\\customer.csv");

        for( Customer customer : customerList){
            System.out.println(customer.toString());
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

        System.out.println("Nhap loaiKhach");
        String loaiKhach = scanner.nextLine();

        System.out.println("Nhap diaChi");
        String diaChi = scanner.nextLine();

        Customer customer = new Customer(id, name,tuoi,gioiTinh,soDT,email,loaiKhach,diaChi);
        customerList.add(customer);

        ReadandWrite.writeByte( "C:\\Users\\ASUS\\Desktop\\CG\\A1121I1\\Module02\\src\\Furama\\Data\\customer.csv" , customerList);


    }

    @Override
    public void edit() {


        System.out.println("Nhap Id muon edit");
        int id = scanner.nextInt();

        boolean check = false;
        for ( Customer customer : customerList){
            if( customer.getId() == id ){


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

                System.out.println("Nhap loaiKhach");
                String loaiKhach = scanner.nextLine();

                System.out.println("Nhap diaChi");
                String diaChi = scanner.nextLine();

                customer.setHoTen(name);
                customer.setTuoi(tuoi);
                customer.setLoaiKhach(loaiKhach);
                customer.setDiaChi(diaChi);
                customer.setEmail(email);
                customer.setGioiTinh(gioiTinh);
                customer.setSoDT(soDT);

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
