package Ls16_Polimorphism.Practice1;

public class Main {
    public static void main(String[] args) {
        Person[] person = {new Programmer(),new Dancer(),new Singer()};
        for (Person persons:person
             ) {
            persons.walk();
        }
    }
}
