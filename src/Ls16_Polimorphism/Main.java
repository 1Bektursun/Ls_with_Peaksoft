package Ls16_Polimorphism;

public class Main {
    public static void main(String[] args) {
        // 3жол менен объект тузууго болот
//        Cat cat = new Cat();
//
//        Animal cat1 = new Cat();
//
//        Object cat2 = new Cat();

        Animal[] animals = {
                new Cat("Tom", "White", "Fish", 4),
                new Dog("Hatiko","Black","bone",3)
        };
        for (Animal animal:animals) {
            System.out.println(animal);
            animal.eat();
            if(animal.getClass().equals(Cat.class)){
                animal.speed(12);
            }else if(animal.getClass().equals(Dog.class)){
                animal.speed(25);
            }
        }

    }
}
