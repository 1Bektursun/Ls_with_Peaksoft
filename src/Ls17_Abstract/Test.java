package Ls17_Abstract;

public class Test {
    public static void main(String[] args) {
       Car toyota1 = new Toyota("XLE","white",220);
       Car toyota2 = new Toyota("SE","Black",180);

       Car lexus1 = new Lexus("ES 300","Grey",260);
       Car lexus2 = new Lexus("Rx 570","Black",260);

       toyota1.gas();
       toyota1.brake();
       toyota2.gas();
       toyota2.brake();

       lexus1.gas();
       lexus1.brake();
       lexus2.gas();
       lexus2.brake();
    }
}

