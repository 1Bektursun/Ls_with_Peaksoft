package Ls16_Polimorphism;

public class Dog extends Animal{
    public Dog(String name, String colour, String food, int age) {
        super(name, colour, food, age);
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }
    @Override
    public void speed(int speed){
        System.out.println(getName()+" can speed "+ speed);
    }
}
