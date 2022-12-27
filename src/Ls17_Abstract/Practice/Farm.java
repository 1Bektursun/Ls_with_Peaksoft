package Ls17_Abstract.Practice;

import java.util.Arrays;

public class Farm {

    private String addres;
    private String ownerName;
     Animals[] sheep ;
    Animals[] cows;
    Animals[] Horses;

    public Farm(String addres, String ownerName, Animals[] sheep, Animals[] cows, Animals[] horses) {
        this.addres = addres;
        this.ownerName = ownerName;
        this.sheep = sheep;
        this.cows = cows;
        Horses = horses;
    }

    @Override
    public String toString() {
        return "Farm: " +
                "addres: '" + addres + '\'' +
                ", ownerName: '" + ownerName + '\'' +
                ", sheep = " + sheep.length +
                ", cows = " + cows.length +
                ", Horses = " + cows.length;
    }
}
