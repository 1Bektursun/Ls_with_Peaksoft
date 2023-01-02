package Ls23_LinkedList;

import java.util.*;

public class Test {
    public static void main(String[] args) {
//        LinkedList<Integer> linkedList = new LinkedList<>();
//        LinkedList<Integer> linkedList1 =new LinkedList<>(Arrays.asList(
//                1,2,3,4,5,6,7
//        ));
//        List<Integer> list = List.of(1,2,3,4,5,6,6,7,8,9,2,4,2,43);
//         linkedList.add(12);
//         linkedList.add(1122);
//         linkedList.add(12212);
//         linkedList.add(1251);
//         linkedList.add(1222);
//         linkedList.pollFirst();
//        System.out.println(linkedList);
//        for (Integer i:linkedList
//             ) {
//            System.out.println(i);
//        }
//
//        System.out.println("\n");
//        Iterator<Integer> iterator = linkedList.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
        LinkedList<Students> students = new LinkedList<>();
        students.add(new Students("Begaly","Momunaly uulu",22));
        students.add(new Students("Aijamal","Bekmuratva",18));
        students.add(new Students("Darygul","Kamchybek kyzy",24));
        students.add(new Students("Amantur","Esenbai uulu",21));
        students.add(new Students("Alisher","Abakirov",19));
        //Collections.sort(students);
        NameComparator nameComparator = new NameComparator();
        students.sort(nameComparator);
        for (Students s:students) {
            System.out.println(s);
        }
    }
}
