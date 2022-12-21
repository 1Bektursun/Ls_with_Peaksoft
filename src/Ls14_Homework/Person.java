package Ls14_Homework;

public class Person {
    private String name;
    private String designation;

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void learn(){
        System.out.println(name + " is learning");
    }
    public void eat(){
        System.out.println(name + " is eating");
    }
    public void walk(){
        System.out.println(name + " is walking");
    }

    @Override
    public String toString() {
        return
                "name: '" + name + '\'' +
                ", designation: '" + designation + '\'';
    }
}
