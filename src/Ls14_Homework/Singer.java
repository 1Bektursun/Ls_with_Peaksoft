package Ls14_Homework;

public class Singer extends Person{
    private String bandName;

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public void singing(){
        System.out.println(getName() + " is singing");
    }
    public void playGuitar(){
        System.out.println(getName() + " is playing Guitar");
    }

    @Override
    public String toString() {
        return "Singer " +super.toString()+" bandName '"+bandName+"'";
    }
}
