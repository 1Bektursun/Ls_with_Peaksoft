package Ls26_GenericWildcard;

import java.util.Comparator;

public class PrintInteger <E extends Comparable<E>>{
    public void print(E parametr){
        System.out.println(parametr);
    }


}
