package Ls26_GenericWildcard.Practice;

import java.util.Arrays;

public class MyArray <T>{
    private T[] array = (T[]) new Object[10];
    private T element;
    private int index = 0;
    public MyArray() {
        this.array = array;
    }
    public void add(T element){
        this.array[index] = element;
        index++;
    }



    public void print(){
        System.out.println("Первый элемент массива: " + array[0]);
        System.out.println("Последний элемент массива: " + array[index-1]);
        System.out.print("Все элементы массива: ");
        for (int i = 0; i < index; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
