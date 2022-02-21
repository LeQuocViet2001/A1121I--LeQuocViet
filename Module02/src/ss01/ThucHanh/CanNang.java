package ss01.ThucHanh;

import java.util.Scanner;

public class CanNang {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap chiru cao");
        float h = scanner.nextFloat();
        System.out.println("Nhap can nang");
        float w = scanner.nextFloat();
        float bmi = w / ( h * h );

        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        else
            System.out.printf("%-20.2f%s", bmi, "Obese");
    }}
