package Ls20_ExceptionHandling.Ls20_HomeWork;
import Ls20_ExceptionHandling.MyException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws MyException {
        Scanner scanner = new Scanner(System.in);
        int height,length,width;

        try{
            height = scanner.nextInt();
            length = scanner.nextInt();
            width = scanner.nextInt();
            if(height > 20 || length > 20 || width > 20){
                throw new MyException();
            }else if(height < 0 || length < 0 || width < 0){
                throw new ArithmeticException();
            }else {
                Parallepiped parallepiped1 = new Parallepiped(height,length,width);
                System.out.println("Параллепипеддин аянты: "+parallepiped1.area() + "\nПараллепипеддин колому: " + parallepiped1.kolomu());
            }
        }catch (InputMismatchException ex){
            System.out.println("Number can't be symbol");
        }catch (MyException ex) {
            System.out.println("Numbers can't be more than 20!");
        }catch (ArithmeticException ex){
            System.out.println("Numbers can't be less than 0!");
        }

    }
}
