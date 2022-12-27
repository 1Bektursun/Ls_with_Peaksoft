package Ls17_Abstract;

public class Lexus extends Car{

    public Lexus(String model, String colour, int maxSpeed) {
        super(model, colour, maxSpeed);
    }
    @Override
    public void gas() {
        System.out.println(getModel() + " is going");
    }

    @Override
    public void brake() {
        System.out.println(getModel()+ " is stopping");
    }


}
