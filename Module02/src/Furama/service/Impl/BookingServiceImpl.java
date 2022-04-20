package Furama.service.Impl;

import Furama.models.*;
import Furama.service.BookingService;
import Furama.service.utils.BookingComparator;

import java.io.InputStream;
import java.util.*;

public class BookingServiceImpl  implements BookingService {

    static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());
    static List<Customer> customerList = new ArrayList<>();
    static Map<Facility,Integer>  facilityIntegerMap =new LinkedHashMap<>();


    static Scanner scanner = new Scanner(System.in);
    static {

        customerList.add( new Customer( 1,"wee" , 23 ,true,323 ,"Asd@", "As", "Sa"));
        customerList.add( new Customer( 2,"Viet" , 23 ,true,32342343 ,"Bsd@", "As", "Sa"));
        customerList.add( new Customer( 3,"B" , 23 ,true,32342343 ,"Bsd@", "As", "Sa"));

        facilityIntegerMap.put(new Villa(1,"TenDV1", 23.3,3,43, "Kieu thue 1","tieu chuan 1", 23,1   ), 0);
        facilityIntegerMap.put(new Villa(2,"TenDV2", 23.3,3,43, "Kieu thue 2","tieu chuan 2", 23,1   ), 0);
        facilityIntegerMap.put(new Room(3,"dv3", 43.4,343,4,"kieu thue", "dv kem kem"), 0);

        }



    @Override
    public void addBooking() {
        int id =1;

        if(bookingSet.isEmpty()){
            id= bookingSet.size();
        }

        Customer  customer = chooseCustomer();
        Facility facility = chooseFacility();

        System.out.println("Nhap ngay bat dau thue");
        String starDate = scanner.nextLine();
        System.out.println("Nhap ngay tra phong");
        String endDate = scanner.nextLine();

        Booking booking = new Booking(id, starDate, endDate, customer.getId(), facility.getTenDichVu(), facility);

        bookingSet.add(booking);
        System.out.println("Da them booking");




    }

    public  Set<Booking> setBooking(){
        return bookingSet;
    }

    public  static  Customer chooseCustomer(){
        System.out.println("Danh sach khach hang");
        for (Customer customer : customerList){
            System.out.println(customer);
        }

        System.out.println("NHap id khach hang");
        boolean check = true;
        int id ;// = Integer.parseInt(scanner.nextLine());

        while (check){

            id = Integer.parseInt(scanner.nextLine());

            for (Customer customer : customerList){
                if( id == customer.getId()){
                    check = false;
                    return customer;
                }
            }
            if(check){
                System.out.println("Khong co id duocj tim thay");
            }
        }
        return  null;
    }

    public  static  Facility chooseFacility(){
        System.out.println("Danh sach dich vu");
       for( Map.Entry<Facility, Integer>  entry : facilityIntegerMap.entrySet()){
           System.out.println( entry);
       }
        System.out.println("NHap id dich vu");
        boolean check = true;
        int id ;// = Integer.parseInt(scanner.nextLine());

        while (check){
            id  = Integer.parseInt(scanner.nextLine());
            for( Map.Entry<Facility, Integer>  entry : facilityIntegerMap.entrySet()){
                if(  id == entry.getKey().getId() ){
                    check = false;
                    return entry.getKey();
                }
            }
            if(check){
                System.out.println("Khong co id duocj tim thay");
            }
        }
        return  null;
    }

    @Override
    public void displayBooking() {
        for(  Booking booking : bookingSet){
            System.out.println(booking);
        }


    }
}
