package Ls19_Enum.Practice;

import java.lang.reflect.Array;

public class Test {


    public static void main(String[] args) {

        Regions[] regions = Regions.values();
        for (Regions l:regions
             ) {
            System.out.println(l.getOzgocholuk());
        }

    }
}
