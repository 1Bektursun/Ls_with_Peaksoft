import java.util.Scanner;

public class Ls11_OOP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TheMachine mashina1 = new TheMachine();
        TheMachine mashina2 = new TheMachine();
        TheMachine mashina3 = new TheMachine();

        mashina1.marka = "Toyota";
        mashina1.model = "Corolla";
        mashina1.jyly = 2016;

        mashina2.marka = "Mecedes Benz";
        mashina2.model = "W210";
        mashina2.jyly = 2005;

        mashina3.marka = "Lexus";
        mashina3.model = "Nx250";
        mashina3.jyly = 2018;

//        mashina1.getInfo();
//        mashina2.getInfo();
//        mashina3.getInfo();


//        System.out.print("Атынызды жазыныз ");
//        String name = scanner.nextLine();
//        System.out.print("Фамилиянызды жазыныз жазыныз ");
//        String surname = scanner.nextLine();
//        System.out.print("Жашынызды жазыныз ");
//        int age = scanner.nextInt();




        Programmer developer1 = new Programmer();
        Programmer developer2 = new Programmer();
        System.out.println(" ");
        System.out.println("Атынызды жазыныз ");
        developer2.name = scanner.nextLine();

        System.out.println("Фамилиянызды жазыныз жазыныз ");
        developer2.surname= scanner.nextLine();

        System.out.println("Жашынызды жазыныз ");
        developer2.age = scanner.nextInt();

        //developer1.setProgrammer(name,surname,age);
        //developer2.setProgrammer(nameDeveloper,surname1,age1);

        //developer1.getInfo(name,surname,2022 - age);
        developer2.getInfo(developer2.name,developer2.surname,2022 - developer2.age);
    }

    public static class Programmer {
        String name;
        String surname;
        int age;

        public void setProgrammer(String name,String surname,int age){
            name = name;
            surname = surname;
            age = age;
        }
        public void getInfo(String name,String surname,int age){
            System.out.println(name + " " + surname + " " + age);
        }
    }

    public static class TheMachine{
        String marka;
        String model;
        int jyly;

        public void getInfo(){
            System.out.println("Markasy: " + marka + "\nModeli: " + model + "\nJyly: "+jyly);
        }
    }
}



