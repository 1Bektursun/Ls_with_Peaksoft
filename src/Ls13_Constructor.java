import java.util.Scanner;

public class Ls13_Constructor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//       Cat cat1 = new Cat("Sarymyshyk","Sary",3);
//       Cat cat2 = new Cat("EkinchiMyshyk","black",4);
//
//       Dog dog1 = new Dog("Baikadam","Taigan",7);
//       Dog dog2 = new Dog("Aktosh","mashka",4);
//
//        System.out.println(cat1.getName() + " " + cat1.getColour() + " " + cat1.getAge());
//        System.out.println(cat2.getName() + " " + cat2.getColour() + " " + cat2.getAge());
//
//        System.out.println(dog1.getName() + " " + dog1.getType() + " " + dog1.getAge());
//        System.out.println(dog2.getName() + " " + dog2.getType() + " " + dog2.getAge());
        Students student1 = new Students("Bektursun",22,40);
        Students student2 = new Students("Janbol",12,32);

        Course course = new Course("Java ", "Aijamal ",  student1);
        Course course1 = new Course("Soft skills" ,"Nurak" ,student2);

        System.out.println(course.getCourseName()  + "\n" + course.getInstructor()  + "\n" + course.getStudent().getName()  + "\n" + course.getStudent().getAge()  + "\n" + course.getStudent().getTyping());
        System.out.println("\n\n\n");
        System.out.println(course1.getCourseName()  + "\n" + course1.getInstructor()  + "\n" + course1.getStudent().getName()  + "\n" + course1.getStudent().getAge()  + "\n" + course1.getStudent().getTyping());

    }


}
class Students{
    private String name;
    private int age;
    private int typing;

    public Students(String name,int age,int typing){
        this.name = name;
        this.age = age;
        this.typing = typing;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getTyping() {
        return typing;
    }
}

class Course{
    private String courseName;
    private String instructor;
    private Students student;

    public Course(String courseName, String instructor,Students student){
        if(courseName.length() <= 2){
            System.out.println("Course name must have 3 or more letters");
            this.courseName = null;
        }else{
            this.courseName = courseName;
        }
        this.instructor = instructor;

        if(student.getAge() <= 16){

            System.out.println(student.getName() + " Окууга мумкунчулугу жок");
        }else {
            this.student = student;
        }

    }


    public String getCourseName() {
        return courseName;
    }

    public String getInstructor() {
        return instructor;
    }

    public Students getStudent() {
        return student;
    }
}

class Cat {
    private String name;
    private String colour;
    private int age;

    public Cat(String name,String colour,int age){
        this.name = name;
        this.colour = colour;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    public int getAge() {
        return age;
    }
}

class Dog{
    private String name;
    private String type;
    private int age;

    public Dog(String name,String type,int age){
        this.name = name;
        this.type = type;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }
}

class Phone{
    String name;
    String model;
    int price;

    //     Конструктор тузуу

    public Phone(String name, String model, int price){
         this.name = name;
         this.model = model;
         this.price = price;
    }

    //     Конструктор без параметра

    public Phone(){

    }
    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }
}