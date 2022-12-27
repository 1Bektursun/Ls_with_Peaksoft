package Ls16_Polimorphism.Practice2;

public class Main {
    public static void main(String[] args) {
        Animal horse = new Horse();
        Cow cow = new Cow();
        Horse horse1 = new Horse();

        voice(horse);
        voice(cow);
        voice(horse1);
    }

    static void voice(Animal animal){
        animal.talk();
    }
}
