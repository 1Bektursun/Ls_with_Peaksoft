import java.util.Random;
import java.util.Scanner;

public class Ls9ReturnMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(getPow(array));

//        int a = scanner.nextInt();
//        int b = random.nextInt(1,5);
//        System.out.println(trueFalse(a,b));
//        System.out.println(a + " sanyna cheyinkilerdin summasy = " + birSan(a));
//        System.out.println(getInfoNumber(a));
//        System.out.println("Arifmetikalyk orto sany = " + arif(5,7));
    }

    public static String getInfoNumber(int a){
        if(a % 2 ==0 ){
            return "Жуп сан";
        }else{
            return "Так сан";
        }
    }

    public static int arif(int a, int b){
        return (a+b)/2;
    }

    public static int birSan(int a){
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            sum+=i;
        }
        return sum;
    }

    public static boolean trueFalse(int a, int b){
        System.out.println("a = " + a + " b = "+ b);
        if(a == b){
            return true;
        }else {
            return false;
        }
    }


    public static int getPow(int[] array){
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
            }
        }
        return min * min;
    }
}
