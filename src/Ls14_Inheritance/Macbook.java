package Ls14_Inheritance;

public class Macbook extends Laptop {
    private String processor;
    private String colour;

    public Macbook(String model, String name, String processor, String colour) {
        super(model, name);
        this.processor = processor;
        this.colour = colour;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Macbook{" +
                "processor='" + processor + '\'' +
                ", colour='" + colour + '\'' +
                '}'+super.toString();
    }
}
