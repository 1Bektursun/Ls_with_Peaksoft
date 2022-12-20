import java.util.Scanner;

public class Ls4ConditionalOperators {
    public static void main(String[] args){
            //Тернадык операторлор
        /* Тернарный - тройной дегенди билдирет
        себеби 3 болугу бар
        шарт жана эки мумкун болго жыйынтык
         */
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Экзаменден канча балл алдыныз?");
//        int a = scanner.nextInt();
//        //int b = scanner.nextInt();
//        System.out.println(a > 50 ? "Экзаменден оттунуз " : "Экзаменден отподунуз");
        String valuta = scanner.nextLine();

        switch (valuta){
            case "USD":
                System.out.println(81.31);
                break;
            case "RUB":
                System.out.println(1.32);
                break;
            case "EUR":
                System.out.println(79.72);
            case "LIRA":
                System.out.println(4.38);
                break;
            default:
                System.out.println("ERROR");
        }

    }
}
