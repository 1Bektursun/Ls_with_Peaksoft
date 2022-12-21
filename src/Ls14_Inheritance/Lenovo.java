package Ls14_Inheritance;

public class Lenovo extends Laptop{
    private int price;
    private String harddisk;

    public Lenovo(String model, String name, int price, String harddisk) {
        super(model, name);
        this.price = price;
        this.harddisk = harddisk;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getHarddisk() {
        return harddisk;
    }

    public void setHarddisk(String harddisk) {
        this.harddisk = harddisk;
    }

    @Override
    public String toString() {
        return "Lenovo{" +
                "price=" + price +
                ", harddisk='" + harddisk + '\'' +
                '}' + super.toString();
    }
}
