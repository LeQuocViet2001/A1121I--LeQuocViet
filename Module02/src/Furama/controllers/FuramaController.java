package Furama.controllers;

import Furama.models.Facility;
import Furama.service.Impl.*;

import java.io.FileNotFoundException;
import java.util.Scanner;



public class FuramaController {

    public static void main(String[] args) {
       displayMainMenu();
    }


    public static  void displayMainMenu(){
        boolean check =true;
        int choice = 0;

        while (check){
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Managerment ");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");


            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt( scanner.nextLine());
            }catch ( NumberFormatException e){
                System.out.println("Hay nhap tu 1-6");
            }

            System.out.println("");
            switch (choice){
                case 1: {
                      displayEmployeeMenu();
                      break;
                }
                case 2:{
                    displayCustonerMenu();
                    break;
                }
                case 3:{
                    displayFacilityMenu();
                    break;
                }
                case 4:{
                    displayBookingMenu();
                    break;
                }
                case 5:{
                    displayPromotionMenu();
                    break;

                }
                case 6:{
                    check =false;
                    break;
                }

            }

        }


    }

    public static void displayEmployeeMenu()  {
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();



        boolean check = true;
        while ((check)){
            System.out.println("1. Display list employees");
            System.out.println("2. Add new employee");
            System.out.println("3. Edit employee");
            System.out.println("4. Return main menu");

            Scanner scanner = new Scanner(System.in);

            switch (scanner.nextInt()){
                case 1: {
                    System.out.println(" Display list employees");
                    employeeService.display();
                    break;
                }
                case 2:{
                    System.out.println(" Add new employee");
                    employeeService.addNew();
                    break;
                }
                case 3:{
                    System.out.println(" Edit employee");
                    employeeService.edit();
                    break;
                }
                case 4:{
                    System.out.println(" Return main menu");
                    check =false;
                    break;
                }
                default:{
                }
            }
        }
    }

    public static  void displayCustonerMenu(){
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        boolean check = true;
        while (check){
            System.out.println("1. Display list customers");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. Return main menu");

            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()){
                case 1:{
                    System.out.println(" Display list customers");
                    customerService.display();
                    break;
                }
                case 2:{
                    System.out.println(" Add new customer");
                    customerService.addNew();
                    break;
                }
                case 3: {
                    System.out.println(" Edit customer");
                    customerService.edit();
                    break;
                }
                case 4: {
                    System.out.println(" Return main menu");
                    check=false;
                    break;
                }
            }
        }
    }

    public static  void displayFacilityMenu(){
        FacilityServerImpl facilityServer = new FacilityServerImpl();
        boolean check = true;
        while (check){
            System.out.println("1. Display list facility");
            System.out.println("2. Add new facility");
            System.out.println("3. Display list facility maintenance");
            System.out.println("4. Return main menu");

            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()){
                case 1:{
                    System.out.println(" Display list facility");
                    facilityServer.display();
                    break;
                }
                case 2:{
                    System.out.println("Add new facility");
                    addNewFacilityMenu();
                    break;
                }
                case 3: {
                    System.out.println(" Display list facility maintenance");
                    break;
                }
                case 4: {
                    System.out.println(" Return main menu");
                    check =false;
                    break;
                }
            }
        }
    }

    public static  void addNewFacilityMenu(){
        FacilityServerImpl facilityServer = new FacilityServerImpl();

        boolean check = true;
        while (check){
            System.out.println("1. Add new villa");
            System.out.println("2. Add new house");
            System.out.println("3. Add new room");
            System.out.println("4. Return ");

            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()){
                case 1:{
                    System.out.println(" Add new villa");
                    facilityServer.addNewVilla();
                    break;
                }
                case 2:{
                    System.out.println(" Add new house");
                    facilityServer.addNewHouse();
                    break;
                }
                case 3: {
                    System.out.println(" Add new room");
                    facilityServer.addNewRoom();
                    break;
                }
                case 4: {
                    System.out.println(" Return  menu");
                    check = false;
                    break;
                }
            }
        }
    }

    public static  void displayBookingMenu(){
        BookingServiceImpl bookingService = new BookingServiceImpl();
        ContractServiceImpl contractService = new ContractServiceImpl();
        boolean check = true;
        while (check){
            System.out.println("1. Add new booking");
            System.out.println("2. Display list booking");
            System.out.println("3. Create new constracts");
            System.out.println("4. Display list contracts");
            System.out.println("5. Edit contracts");
            System.out.println("6. Return main menu ");

            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()){
                case 1:{
                    System.out.println(" Add new booking");
                     bookingService.addBooking();
                    break;
                }
                case 2:{
                    System.out.println(" Display list booking");
                     bookingService.displayBooking();
                    break;
                }
                case 3: {
                    System.out.println(" Create new constracts");
                    contractService.createNewContract();
                    break;
                }
                case 4: {
                    System.out.println(" Display list contracts");
                    contractService.displayListContract();
                    break;
                }
                case 5: {
                    System.out.println(" Edit contracts");
                    break;
                }
                case 6: {
                    System.out.println(" Return main menu ");
                    check = false;
                    break;
                }
            }
        }
    }

    public static  void displayPromotionMenu(){
        boolean check = true;
        while (check){
            System.out.println("1. Display list customers use service");
            System.out.println("2. Display list customers get voucher");
            System.out.println("3. Return main menu");


            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()){
                case 1:{
                    System.out.println(" Display list customers use service");
                    break;
                }
                case 2:{
                    System.out.println(" Display list customers get voucher");
                    break;
                }
                case 3: {
                    System.out.println(" Return main menu");
                    break;
                }
            }
        }
    }


}
