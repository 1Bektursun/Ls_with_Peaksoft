import java.util.Scanner;

public class Ls12Encapsulation {
    public static void main(String[] args) {
//        Regtanlge kvadrat = new Regtanlge();
//        kvadrat.setLength(10);
//        kvadrat.setWith(12);
//        System.out.println("Kvadraty = " + kvadrat.getArea());

        Scanner scanner = new Scanner(System.in);

        Student student1 = new Student();

        System.out.print("What's your name: ");
        String name = scanner.nextLine();
        System.out.print("What's your surname: ");
        String surname = scanner.nextLine();
        System.out.print("How old are you:");
        int age = scanner.nextInt();
        System.out.print("Kancha kurska barasyz: ");
        int n = scanner.nextInt();
        String[] courses = new String[n];
        System.out.println("Kurstardyn attary:");
        for (int i = 0; i < courses.length; i++) {
            courses[i] = scanner.nextLine();
        }

        student1.setName(name);
        student1.setSurname(surname);
        student1.setAge(age);
        student1.setCourses(courses);

        System.out.println("Student: " + student1.getName() + " " + student1.getSurname() + " " + student1.getAge() );
        System.out.print("Katyshkan kurstary: ");

        for (String kurs:courses) {
            System.out.print(kurs + " ");
        }

    }

}

class Student{
    private String name;
    private String surname;
    private int age;
    private String[] courses ;

    public void setName(String aty){
        name = aty;
    }
    public String getName(){
        return name;
    }
    public void setSurname(String familiyasy){
        surname = familiyasy;
    }
    public String getSurname(){
        return surname;
    }
    public void setAge(int jashy){
        age = jashy;
    }
    public int getAge(){
        return age;
    }

    public void setCourses(String[] kurstar){
       courses = kurstar;
    }
    public String[] getCourses(){
      return courses;
    }

}


 class Regtanlge{
    private int length;
    private int with;

    public void setLength(int number){
        length = number;
    }
    public int getLength(){
        return length;
    }
    public void setWith(int number){
        with = number;
    }
    public int getWith(){
        return with;
     }
    public int getArea(){
        return length * with;
    }

}
