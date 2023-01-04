package Ls26_GenericWildcard;

import java.util.Arrays;

public class MyArrayList <T> {
    private T[] element = (T[]) new Object[10];
    private int index = 0;

    public void add(T element){
        this.element[index] = element;
        index++;
    }
    public T get(int index){
        return element[index];
    }
    @Override
    public String toString() {
        return "MyArrayList{" +
                "element=" + Arrays.toString(element) +
                '}';
    }


}
