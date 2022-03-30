package Furama.controllers;

import Furama.service.Impl.EmployeeServiceImpl;

import java.util.Scanner;



public class FuramaController {

    public static void main(String[] args) {
       displayMainMenu();
    }


    public static  void displayMainMenu(){
        boolean check =true;
        while (check){
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Managerment ");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");


            Scanner scanner = new Scanner(System.in);
            System.out.println("");
            switch (scanner.nextInt()){
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

                    break;
                }

            }

        }


    }

    public static void displayEmployeeMenu(){
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
                    System.out.println("1. Display list employees");
                    employeeService.display();
                    break;
                }
                case 2:{
                    System.out.println("2. Add new employee");
                    employeeService.addNew();
                    break;
                }
                case 3:{
                    System.out.println("3. Edit employee");
                    break;
                }
                case 4:{
                    System.out.println("4. Return main menu");
                    break;
                }
                default:{
                }
            }
        }
    }

    public static  void displayCustonerMenu(){
        boolean check = true;
        while (check){
            System.out.println("1. Display list customers");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. Return main menu");

            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()){
                case 1:{
                    System.out.println("1. Display list customers");
                    break;
                }
                case 2:{
                    System.out.println("2. Add new customer");
                    break;
                }
                case 3: {
                    System.out.println("3. Edit customer");
                    break;
                }
                case 4: {
                    System.out.println("4. Return main menu");
                    break;
                }
            }
        }
    }

    public static  void displayFacilityMenu(){
        boolean check = true;
        while (check){
            System.out.println("1. Display list facility");
            System.out.println("2. Add new facility");
            System.out.println("3. Display list facility maintenance");
            System.out.println("4. Return main menu");

            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()){
                case 1:{
                    System.out.println("1. Display list facility");
                    break;
                }
                case 2:{
                    System.out.println("2. Add new facility");
                    break;
                }
                case 3: {
                    System.out.println("3. Display list facility maintenance");
                    break;
                }
                case 4: {
                    System.out.println("4. Return main menu");
                    break;
                }
            }
        }
    }

    public static  void displayBookingMenu(){
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
                    System.out.println("1. Add new booking");
                    break;
                }
                case 2:{
                    System.out.println("2. Display list booking");
                    break;
                }
                case 3: {
                    System.out.println("3. Create new constracts");
                    break;
                }
                case 4: {
                    System.out.println("4. Display list contracts");
                    break;
                }
                case 5: {
                    System.out.println("5. Edit contracts");
                    break;
                }
                case 6: {
                    System.out.println("6. Return main menu ");
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
                    System.out.println("1. Display list customers use service");
                    break;
                }
                case 2:{
                    System.out.println("2. Display list customers get voucher");
                    break;
                }
                case 3: {
                    System.out.println("3. Return main menu");
                    break;
                }
            }
        }
    }


}
