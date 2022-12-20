import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ls7Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Massivdin razmerin kirgiziniz");
        int n = scanner.nextInt();
        Random random = new Random();
        int[] array = new int[n];

        double sum = 0;
        for (int i = 0;i < array.length;i++){
            array[i] = random.nextInt(1,20);
            sum+=array[i];
            System.out.println(array[i]);
        }
        System.out.println("Summa " + sum);
        System.out.println(sum/array.length);

//
//        int[] variant1 = {1,2,3,4,5};
//        //Массивди жарыялоо
//        int[] variant2 = new int[]{2,3,4,5,5};
//        //Маасивди беруу жана ага ошол жерден эле элементтерин беруу
//        int[] variant3 = new int[5];
        //variant3.length массивдин размери
//        //Массивге размер беруу
//        System.out.println(Arrays.toString(variant1));
        //Массивди консолго чыгаруунун бир жолу да циклдар менен да чыгарса болот

    }
}
