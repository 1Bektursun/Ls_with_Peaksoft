import java.util.Scanner;

public class Ls6LoopsFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int n = scanner.nextInt();
        int counter = 0;
        double sum = 0;

        while (true){
            System.out.print("Сан киргизиниз: ");
            int n = scanner.nextInt();
            counter++;
            sum+=n;
            if(n <= 0){
                counter--;
                System.out.println("Сиз " + counter + " сан киргиздиниз");
                System.out.println("Сандардын жалпы суммасы: " + sum);
                System.out.println("Орточо арифметикалык суммасы: " + sum / counter);
                break;

            }
        }






//        for(int i = 1;i <= 10;i++){
//            System.out.println(n + " * " + i + " = " + i * n);
//        }
//        for(int i = 1;i <= 10;i++){
//            System.out.printf("%d * %d =  %d\n",n,i,i*n);
//        }
    }
}
