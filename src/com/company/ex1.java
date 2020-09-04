package com.company;
import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) {
        double num1,num2,num3,num4,num5,result,total;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Total Marks( For Each Subject ) : ");
        total = sc.nextDouble();
        System.out.print("Enter The Marks of Subject 1 : ");
        num1 = sc.nextDouble();
        System.out.print("Enter The Total Subject 2 : ");
        num2 = sc.nextDouble();
        System.out.print("Enter The Total Subject 3 : ");
        num3 = sc.nextDouble();
        System.out.print("Enter The Total Subject 4 : ");
        num4 = sc.nextDouble();
        System.out.print("Enter The Total Subject 5 : ");
        num5 = sc.nextDouble();
        result = num1+num2+num3+num4+num5;
        total = total*5;
        System.out.println("Your Percentage is: " + (result / total) * 100);


    }
}
