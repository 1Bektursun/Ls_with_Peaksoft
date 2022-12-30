package Ls22_CollectionArrayList.Practice;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Azamat",21,"Java"));
        students.add(new Student("Bektur",25,"Java"));
        students.add(new Student("Aigul",29,"JavaScript"));
        students.add(new Student("Jumabek",19,"Java"));
        students.add(new Student("Jyldyz",19,"JavaScript"));
        students.add(new Student("Kanykey",23,"JavaScript"));
        students.add(new Student("Jolbol",24,"Java"));
        students.add(new Student("Nurdin",27,"JavaScript"));
        students.add(new Student("Ziregul",31,"Java"));
        students.add(new Student("Dinara",20,"JavaScript"));

        showStudents(students);
        System.out.println("\n");
        javaJavaScript(students);
        System.out.println("\n");
        ages(students);
        System.out.println("\n");
        studentsWithA(students);
    }

    private static void showStudents(ArrayList<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }

    }

    public  static void javaJavaScript(ArrayList<Student> students){
        ArrayList<Student> javaGroup = new ArrayList<>();
        ArrayList<Student> JsGroup = new ArrayList<>();
        for (int i = 0;i<students.size();i++){
            if (students.get(i).getGroup()=="Java"){
                javaGroup.add(students.get(i));
            } else if (students.get(i).getGroup() == "JavaScript") {
                JsGroup.add(students.get(i));
            }
        }

        javaGroup.forEach(System.out::println);
        JsGroup.forEach(System.out::println);
    }

    public static void ages(ArrayList<Student> students){
        ArrayList<Student> ages = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getAge() >= 19 && students.get(i).getAge() <= 23){
                ages.add(students.get(i));
            }
        }

        for (int i = 0; i < ages.size(); i++) {
            System.out.println(ages.get(i));
        }

    }


    public static void studentsWithA(ArrayList<Student> students){
        ArrayList<Student> students1 = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getName().charAt(0) == 'A'){
                students1.add(students.get(i));
            }
        }
        for (int i = 0; i < students1.size(); i++) {
            System.out.println(students1.get(i));
        }
    }
}
