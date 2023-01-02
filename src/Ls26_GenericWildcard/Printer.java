package Ls26_GenericWildcard;

public class Printer <T>{
    private T element;

    public Printer(T element) {
        this.element = element;
    }

    public void print(){
        System.out.println(element);
    }
}

