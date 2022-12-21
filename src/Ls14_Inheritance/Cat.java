package Ls14_Inheritance;

public class Cat extends Animal{
    private String colour;

    public Cat(String name,String breed, int age,String colour){
        super(name,breed,age);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "colour='" + colour + '\'' +
                '}' + super.toString();
    }

}
