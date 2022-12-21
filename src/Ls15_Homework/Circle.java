package Ls15_Homework;

import java.util.Scanner;

public class Circle {
     static double PI = 3.141592653589793;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a radius: ");
        int radius = scanner.nextInt();
        System.out.println("Area = "+area(radius));
        System.out.println("Circumference = "+circumference(radius));
    }
     static double area(int radius){
        return PI * (radius * radius);
    }

     static double circumference(int radius){
        return PI * 2 * radius;
    }
}
