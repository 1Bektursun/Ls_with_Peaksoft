public class Ls13_HomeWork {
    public static void main(String[] args) {
        myClass myData = new myClass("Bektursun","Adylbek uulu",22);
        myClass myData1 = new myClass(new String[]{"Java","Soft skills"},"Lagman");

        System.out.println(myData.getName() + " " + myData.getSurname()+" "+myData.getAge() );
        System.out.println(myData1.getCourses()[0]+" "+myData1.getCourses()[1] + "\n"+myData1.getMyFood());
    }

}

class myClass{
    private String name;
    private String surname;
    private int age;
    private String[] courses;
    private String myFood;

    public myClass(String name,String surname,int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public myClass(String[] courses,String myFood){
        this.courses = courses;
        this.myFood = myFood;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String[] getCourses() {
        return courses;
    }

    public String getMyFood() {
        return myFood;
    }
}