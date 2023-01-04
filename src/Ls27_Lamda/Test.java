package Ls27_Lamda;

import java.util.function.*;

public class Test {
    public static void main(String[] args) {

        //          Anonym classes

//
//        Device anonymPhone = new Device() {
//            String name = "Samsung";
//            @Override
//            public void getMessage() {
//                System.out.println("Hello "+ name);
//
//            }
//            public void method(){
//                System.out.println("Hello world!");
//            }
//        };
//        Devices<String> laptops = new Devices<String>() {
//            @Override
//            public void getMessage(String arg) {
//                System.out.println(arg + " Hello java 8");
//            }
//        };
//        Devices<Integer> price = new Devices<Integer>() {
//            @Override
//            public void getMessage(Integer arg) {
//                System.out.println("this mac cost " + arg + " som");
//            }
//        };
//        laptops.getMessage("Macbook Pro");
//        price.getMessage(65000);

        //         Lamda


//        Person teacher = (String arg,int parametrOfInt) -> System.out.println(arg+" Teaching zarplatasy: "+parametrOfInt);
//        teacher.work("Teacher",25000);
//        Person doctor = (arg,parametrOfInt) -> System.out.println(arg+" Working zarplatasy: "+parametrOfInt);
//        doctor.work("Doctor",35000);

        Consumer<String> consumer = (arg) -> System.out.println(arg);
        consumer.accept("java");

        IntConsumer consumer1 = (arg) -> System.out.println(arg);
        consumer1.accept(123);

        BiConsumer<String,Integer> biConsumer = (x,y)-> System.out.println(x+" "+y);
         biConsumer.accept("Java",8);


        Supplier<String> stringSupplier = ()-> "Hello java 8";
        System.out.println(stringSupplier.get());

        Predicate<Integer> predicate = (x) -> x>5;
        System.out.println(predicate.test(3));

        BiPredicate<String,Integer> biPredicate = (x,y)-> x.length()==y;
        System.out.println(biPredicate.test("java", 5));

        Function<Integer,String> function = (x)->x.toString();
        System.out.println(function.apply(12));

    }
}

interface Devices<T>{
    public void getMessage(T arg);
}

