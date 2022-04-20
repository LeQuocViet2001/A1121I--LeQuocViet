package FinalModule2.Service.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Regex {
    Scanner scanner = new Scanner(System.in);
    public static String regexStr(String regex, String err)
    {   Scanner sc = new Scanner(System.in);
        boolean check = true;
        String temp;

        do {
            temp = sc.nextLine();
            if (temp.matches(regex)){
                check = false;
            }
            else
            {
                System.out.println(err);
                System.out.println("Xin nhap lai");
            }
        }while (check);
        return temp;
    }

}
