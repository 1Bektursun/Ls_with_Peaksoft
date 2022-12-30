package Ls22_CollectionArrayList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();



        for (int i = 0; i < 10; i++) {
           arrayList.add(i, random.nextInt(1,100));
        }
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println("\n");
        arrayList.sort(Comparator.naturalOrder());
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }

        Iterator<Integer> integers = arrayList.iterator();
        while (integers.hasNext()){
            System.out.println(integers.next());
        }
    }
}
