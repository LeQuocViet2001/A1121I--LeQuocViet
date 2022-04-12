package Furama.service.Impl;

import Furama.models.Booking;
import Furama.models.Contract;
import Furama.models.Customer;
import Furama.service.ContractService;

import java.util.*;

public class ContractServiceImpl implements ContractService {

    static List<Contract> contractList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);


    @Override
    public void createNewContract() {
        Queue<Booking> bookingQueue = new LinkedList<>();
        Set<Booking> bookingSet = new BookingServiceImpl().setBooking();

        for ( Booking booking: bookingSet){
            bookingQueue.add(booking);
        }

        Booking booking = bookingQueue.poll();
      //  Customer customer = booking.getIdCustomer();

        System.out.println("Nhap thong tin cho Contact:  ");
        System.out.println("Nhap id Contact:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap so tien tra truoc ");
        double deposit = Double.parseDouble(scanner.nextLine());
        double totien = Double.parseDouble(scanner.nextLine());

        Contract contract = new Contract(  id, booking.getIdBooking(), deposit, totien, String.valueOf( booking.getIdCustomer() ));

    }

    @Override
    public void displayListContract() {

        for (Contract contract : contractList){
            System.out.println(contract);
        }

    }

    @Override
    public void editContract() {

    }
}
