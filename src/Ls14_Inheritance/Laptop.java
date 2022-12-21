package Ls14_Inheritance;

public class Laptop {
    private String model;
    private String name;

    public Laptop(String model, String name) {
        this.model = model;
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void theMethod(){
        System.out.println(name + " is sleeping");
    }
    @Override
    public String toString() {
        return "Laptop{" +
                "model='" + model + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
