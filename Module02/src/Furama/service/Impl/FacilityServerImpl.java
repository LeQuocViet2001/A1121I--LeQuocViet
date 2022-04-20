package Furama.service.Impl;

import Furama.models.Facility;
import Furama.models.House;
import Furama.models.Room;
import Furama.models.Villa;
import Furama.service.FacilityService;
import Furama.service.utils.ReadandWrite;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServerImpl implements FacilityService {


    private static Map<Facility,Integer> facilityIntegerMap = new LinkedHashMap<>();
    private static Scanner scanner = new Scanner(System.in);


    @Override
    public void display() {

        for( Map.Entry<Facility,Integer> element : facilityIntegerMap.entrySet()){
            System.out.println("Service " + element.getKey() + "So lan da thue" + element.getValue());
        }
    }

    @Override
    public void addNewVilla() {

        System.out.println("Nhap id: ");
        int id = scanner.nextInt();

        System.out.println("Nhap ten dich  vu: ");
        scanner.nextLine();
        String tenDichVu = scanner.nextLine();

        System.out.println("Nhap dien tich: ");
        double dienTichDung = scanner.nextDouble();

        System.out.println("chi Phi Thue: ");
        double chiPhiThue = scanner.nextDouble();

        System.out.println("NNhap so nguoi");
        int soNguoi = scanner.nextInt();

        System.out.println("Nhap kieu Thue");
        scanner.nextLine();
        String kieuThue = scanner.nextLine();

        System.out.println("Nhap tieu Chuan Phong");
        String tieuChuanPhong = scanner.nextLine();

        System.out.println("Nhap dien Tich HoBoi");
        double DtHoBoi = scanner.nextDouble();

        System.out.println("Nhap so tang");
        int soTang = scanner.nextInt();

        Villa villa = new Villa(id,tenDichVu,dienTichDung,chiPhiThue,soNguoi,kieuThue,tieuChuanPhong,DtHoBoi,soTang);


      //  ReadandWrite.writeByte("C:\\Users\\ASUS\\Desktop\\CG\\A1121I1\\Module02\\src\\Furama\\Data\\Villa.csv", villa);
        facilityIntegerMap.put(villa,0);  // hien tai la 0l; sao nay book king thi co ng 1

    }

    @Override
    public void addNewHouse() {

        System.out.println("Nhap id: ");
        int id = scanner.nextInt();

        System.out.println("Nhap ten dich  vu: ");
        scanner.nextLine();
        String tenDichVu = scanner.nextLine();

        System.out.println("Nhap dien tich: ");
        double dienTichDung = scanner.nextDouble();

        System.out.println("chi Phi Thue: ");
        double chiPhiThue = scanner.nextDouble();

        System.out.println("NNhap so nguoi");
        int soNguoi = scanner.nextInt();

        System.out.println("Nhap kieu Thue");
        scanner.nextLine();

        System.out.println("Nhap tieu chuan phong");
        String tieuChuanPhong = scanner.nextLine();

        System.out.println(" Nhap so Tang");

        int soTang = scanner.nextInt();
        String kieuThue = scanner.nextLine();


        House house = new House(id, tenDichVu,dienTichDung,chiPhiThue,soNguoi,kieuThue, tieuChuanPhong, soTang);
        facilityIntegerMap.put(house,0);

    }

    @Override
    public void addNewRoom() {

        System.out.println("Nhap id: ");
        int id = scanner.nextInt();

        System.out.println("Nhap ten dich  vu: ");
        scanner.nextLine();
        String tenDichVu = scanner.nextLine();

        System.out.println("Nhap dien tich: ");
        double dienTichDung = scanner.nextDouble();

        System.out.println("chi Phi Thue: ");
        double chiPhiThue = scanner.nextDouble();

        System.out.println("NNhap so nguoi");
        int soNguoi = scanner.nextInt();

        System.out.println("Nhap kieu Thue");
        scanner.nextLine();
        String kieuThue = scanner.nextLine();

        System.out.println("Nhap dich vu di kem");
        String dVuDiKem = scanner.nextLine();

        Room room = new Room(id, tenDichVu,dienTichDung,chiPhiThue,soNguoi,kieuThue,dVuDiKem);
facilityIntegerMap.put(room,0);


    }
}
