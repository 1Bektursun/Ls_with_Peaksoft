package Ls25_QueueDequeMap;

public class Model {
    private String marka;
    private int year;

    public Model(String marka, int year) {
        this.marka = marka;
        this.year = year;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Marka{" +
                "marka='" + marka + '\'' +
                ", year=" + year +
                '}'+"\n";
    }
}
