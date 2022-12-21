package Ls14_Inheritance;

public class Dog extends Animal{
    private String weight;

    public Dog(String name, String breed,int age,String weight){
        super(name,breed,age);
        this.weight = weight;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}
