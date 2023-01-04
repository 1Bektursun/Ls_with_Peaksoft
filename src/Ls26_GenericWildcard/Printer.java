package Ls26_GenericWildcard;

public class Printer <T,E>{
    private T element;
    private E element1;

    public Printer(T element ,E element1) {
        this.element = element;
        this.element1 = element1;
    }

    public void print(){
        System.out.println(element + " " + element1 );
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public E getElement1() {
        return element1;
    }

    public void setElement1(E element1) {
        this.element1 = element1;
    }

    @Override
    public String toString() {
        return "Printer{" +
                "element=" + element +
                ", element1=" + element1 +
                '}';
    }
}

