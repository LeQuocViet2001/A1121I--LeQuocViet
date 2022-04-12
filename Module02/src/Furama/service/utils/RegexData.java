package Furama.service.utils;

import java.util.Scanner;

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

}
