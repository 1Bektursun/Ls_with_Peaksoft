package Ls20_ExceptionHandling.Ls20_HomeWork;

public class Parallepiped {
    private int height;
    private int length;
    private int width;

    public Parallepiped(int height, int length, int width) {
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int area(){
        return 2*((getHeight()*getLength())+(getLength()*getWidth())+(getHeight()*getWidth()));
    }

    public int kolomu(){
        return getWidth()*getHeight()*getLength();
    }

}
