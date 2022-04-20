package Furama.service.utils;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexData {

    static Scanner scanner = new Scanner(System.in);
    public  static  String regexStr( String temp, String regex, String erro){
        boolean check = true;
        do{
            if( temp.matches( regex)){
                check =false;
            }
            else {
                System.out.println(erro);
                temp =scanner.nextLine();

            }
        }while (check);
        return  temp;
/// Date time "^\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}$"

    }


    ////Regex tuoi
    public static String regexAge(String temp, String regex){
        boolean check = true;
        while (check){
            try{
                if(Pattern.matches(regex,temp)){
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate age = LocalDate.parse(temp,formatter);
                    LocalDate now = LocalDate.now();
                    int current = Period.between(age,now).getYears();
                    if (current <100 && current >10){
                        check =false;
                    }else {
                        throw  new  Exception("Khong phai tuoi");
                    }
                }
                else throw  new Exception("Dinh dang khong dung");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                temp = scanner.nextLine();


            }
        }

        return temp;


    }



}
