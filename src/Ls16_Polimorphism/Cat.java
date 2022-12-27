package Ls16_Polimorphism;

public class Cat extends Animal{
    public Cat(String name, String colour, String food, int age) {
        super(name, colour, food, age);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating "+getFood());
    }

    @Override
    public void speed(int speed){
        System.out.println(getName()+" can speed "+ speed);
    }
}
