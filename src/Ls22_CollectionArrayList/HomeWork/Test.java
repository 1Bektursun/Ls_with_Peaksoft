package Ls22_CollectionArrayList.HomeWork;

import java.util.ArrayList;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> numbersRandom = new ArrayList<>();
        ArrayList<Integer> honestNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            numbersRandom.add(random.nextInt(1,100));
        }
        for (Integer i:numbersRandom) {
            if (i % 2 == 0){
                honestNumbers.add(i);
            }else{
                oddNumbers.add(i);
            }
        }
        System.out.println("Random numbers");
        for (int i = 0; i < numbersRandom.size(); i++) {
            System.out.print(numbersRandom.get(i) + " ");
        }
        System.out.println("\n\nHonest numbers");
        for (int i = 0; i < honestNumbers.size(); i++) {
            System.out.print(honestNumbers.get(i) + " ");
        }
        System.out.println("\n\nOdd numbers");
        for (int i = 0; i < oddNumbers.size(); i++) {
            System.out.print(oddNumbers.get(i) + " ");
        }

    }
}
