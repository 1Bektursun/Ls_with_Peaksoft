package Ls16_Polimorphism;

public class Animal {
    private String name;
    private String  colour;
    private String food;
    private int age;

    public Animal(String name, String colour, String food, int age) {
        this.name = name;
        this.colour = colour;
        this.food = food;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat(){
        System.out.println("Animal is eating");
    }
    public void speed(int speed){
        System.out.println("can speed");
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
