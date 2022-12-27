package Ls17_Abstract.Practice;

public class Horse extends Animals{
    private String colour;

    public Horse(int weight, int age, String gender, String nickName, String colour) {
        super(weight, age, gender, nickName);
        this.colour = colour;
    }

    public Horse(String colour) {
        this.colour = colour;
    }

    public Horse(){

    }
}
