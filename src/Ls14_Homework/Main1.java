package Ls14_Homework;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("\n");
        Programmer programmer = new Programmer("Temirbek","Programmer","TimaSoft");
        System.out.println(programmer);
        programmer.learn();

        System.out.println("\n");
        Dancer dancer = new Dancer("Atai","Dancer","Tumar");
        System.out.println(dancer);
        dancer.dancing();

        System.out.println("\n");
        Singer singer = new Singer("Mirbek","Singer" , "himself");
        System.out.println(singer);
        singer.playGuitar();
        singer.singing();
    }
}
