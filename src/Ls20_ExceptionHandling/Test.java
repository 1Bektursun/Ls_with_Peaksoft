package Ls20_ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int value = scanner.nextInt();
//
//        if(Math.sqrt(value)%1 != 0){
//            throw new RuntimeException();
//        }

//        try {
//            int a = scanner.nextInt();
//            int b = scanner.nextInt();
//            System.out.println(a/b);
//        }catch (InputMismatchException ex){
//            System.out.println("Wrong input!");
//        }catch (ArithmeticException ex){
//            System.out.println("Number can't be devided to 0!");
//        }finally {
//            System.out.println("Final block dayima ishteit!");
//        }

//        try{
//            int age = scanner.nextInt();
//            if(age<0){
//                throw new MyException();
//            }else{
//                System.out.println("I'm " + age + " years old");
//            }
//        }catch (MyException exception){
//            System.out.println("Age can't be lower than 0");
//        }

        try{
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            if(!name.matches("[z-zA-Za-яА-Я]*")){
                throw new MyException();
            }
            System.out.println("Enter your age: ");
            int age = scanner.nextInt();
            if(age<0){
                throw new MyException();
            }
        }catch (MyException ex){
            System.out.println("Wrong input!");
        }catch (InputMismatchException ex){
            System.out.println("Age can't be writes with letters!");
        }
    }
}
