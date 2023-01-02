package Ls25_QueueDequeMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        //  Queue  FIFO      : first in first out
        //  Deque  LIFO(FILO): last in first out
        //  Stack  LIFO      : last in first out


//        Queue<String> queue = new LinkedList<>();
//        queue.add("Bishkek");
//        queue.add("Talas");
//        queue.add("Jalal-Abad");
//        queue.add("Chui");
//        queue.add("Kara-Kol");
        Map<Integer, Model> map = new LinkedHashMap<>();
        map.put(1,new Model("Toyota",2008 ));
        map.put(2,new Model("Mecedes Benz",2008 ));
        map.put(3,new Model("Lada",2008 ));
        map.put(4,new Model("Lexus",2008 ));
        map.put(5,new Model("Range Rover",2008 ));

        for (Integer s:map.keySet()) {
            System.out.println(map.get(s));
        }
    }
}
