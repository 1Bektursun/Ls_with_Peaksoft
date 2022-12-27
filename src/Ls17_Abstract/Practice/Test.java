package Ls17_Abstract.Practice;

import org.w3c.dom.ls.LSOutput;

public class Test {
    public static void main(String[] args) {
        Farm farm1 = new Farm("Ahunbaeva 129","Bektursun",new Animals[3],new Animals[5],new Animals[2]);
        Farm farm2 = new Farm("Junusalieva 15","Adam",new Animals[1],new Animals[1],new Animals[1]);
        System.out.println(" ");
        System.out.println(farm1);
        System.out.println(" ");
        System.out.println(farm2);
    }

}
