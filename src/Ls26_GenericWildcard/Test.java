package Ls26_GenericWildcard;

import java.util.ArrayList;
import java.util.Date;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        // generic ар кандай типтерди берсек болот
//    print(34,33);
//    print('A',12);
//    print("Java",'a');
//    print(new Person(),221  );
//    print(new Date(),new Person());

//        PrintInteger printInteger = new PrintInteger(12);
//
//
//        PrintString printString = new PrintString("java");
//
//
//        Printer<String> printer = new Printer("Java");
//        printer.print();
//
//        Printer<Integer> integerPrinter = new Printer<>(12);
//        integerPrinter.print();

//        Printer<String,Integer> printer = new Printer<>("Java",12);
//        printer.print();

        MyArrayList<String> myArrayList = new MyArrayList<>();

        List<Integer> list  = new ArrayList<>();
        list.add(21);
        list.add(21);
        list.add(21);
        test(list);

        List<String> stringList = new ArrayList<>();
        stringList.add("Java");
        stringList.add("Java");
        stringList.add("Java");
        stringList.add("Java");
        test(stringList);
    }
//    public static <T> void print(T e1, T e2){
//        System.out.println(e1.getClass().getSimpleName() );
//    }

    public static void test(List<?> list){    //    wildcard
        for(int i = 0; i < list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
