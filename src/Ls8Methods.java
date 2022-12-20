import java.util.Scanner;

public class Ls8Methods {
    public static void main(String[] args) {
        //table();
        //Scanner scanner = new Scanner(System.in);
//        int[] number = {1, 2, 3};
//        array(number);
        //int n = scanner.nextInt();
//        myNameIs("Bektursun");
//
//        if(n == 1){
//            hello();
//        }else if(n == 2){
//            bye();
//        }else {
//            System.out.println("Myndai method jok!");
//        }

        int summa = 0;
        for (int i = 1; i < 300; i++) {
            if(i % 3 == 0 && i % 4 == 0 && i % 5 == 0){
                summa+=i;
                System.out.println(i);
            }
        }
        System.out.println("summa = " + summa);
    }


        public static void array(int[] massiv) {
        double sum = 0;
            for (int i = 0; i < massiv.length; i++) {
                sum+=massiv[i];
             System.out.print(massiv[i] + " ");
         }
            System.out.println("\nArif = " + sum / massiv.length);
     }

        public static void myNameIs (String myName){
            System.out.println("Hello " + myName);
        }
        public static void hello () {
            System.out.println("Hello!");
        }

        public static void bye () {
            System.out.println("Bye!");
        }

        public static void table () {
            for (int i = 2; i < 10; i++) {
                for (int j = 1; j <= 10; j++) {
                    System.out.println(i + " * " + j + " = " + i * j);
                }
                System.out.println();
            }
        }

}


