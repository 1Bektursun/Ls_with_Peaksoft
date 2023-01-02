package Ls26_GenericWildcard;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        // generic ар кандай типтерди берсек болот
//    print(34,33);
//    print('A',12);
//    print("Java",'a');
//    print(new Person(),221  );
//    print(new Date(),new Person());

        PrintInteger printInteger = new PrintInteger(12);


        PrintString printString = new PrintString("java");


        Printer<String> printer = new Printer("Java");
        printer.print();

        Printer<Integer> integerPrinter = new Printer<>(12);
        integerPrinter.print();


    }
//    public static <T> void print(T e1, T e2){
//        System.out.println(e1.getClass().getSimpleName() );
//    }

}
