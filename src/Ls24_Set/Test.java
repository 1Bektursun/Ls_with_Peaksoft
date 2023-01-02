package Ls24_Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
//        Set<String> set = new HashSet<>();
//        set.add("bekbolot");
//        set.add("Chyngyz");
//        set.add("Doolot");
//        set.add("Arzybek");

//          Set<String> set = new LinkedHashSet<>();
//            set.add("bekbolot");
//            set.add("Chyngyz");
//            set.add("Doolot");
//            set.add("Arzybek");
//            set.forEach(System.out::println);
//        Set<Integer> set1 = new HashSet<>();
//        set1.add(12);
//        set1.add(1);
//        set1.add(4);
//        set1.add(121);
//        set1.add(5);
//        set1.forEach(System.out::println);

        Set<Student> set = new HashSet<>();
        set.add(new Student("Aijamal",18));
        set.add(new Student("Aijamal",18));
        set.add(new Student("Aijamal",18));
        set.add(new Student("Aijamal",18));
        set.add(new Student("Aijamal",18));
        set.forEach(System.out::println);

    }
}
