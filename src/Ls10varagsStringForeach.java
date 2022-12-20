public class Ls10varagsStringForeach {
    public static void main(String[] args) {
//        String[] alar = {"Muhammed","Adam","Umar","Atam"};
//
//        for (String items:alar) {
//            System.out.println("Men seni jakshy korom " + items);
//        }

        String word = "Java c++";

        System.out.println(word.charAt(2));//index'tegi simvoldu kaitarat
        System.out.println(word.substring(1, 3));//saptyn bir bolugun kesip kaitarat
        System.out.println(word.contains("av"));//ushul sozdun ichinde a kamtylaby kamtylsa true kaitarat
        System.out.println(word.toUpperCase());//chon tamga menen jazyp beret
        System.out.println(word.toLowerCase());//kichine tamga menen jazyp beret
        System.out.println(word.trim());//ashykcha probelderdi jok kylat
        System.out.println(word.equals("java"));//barabar je barabar emes ekenin bilip beret
        System.out.println(word.replace("c++", "8"));//sozdu ozgortot
        System.out.println(word.length());//sozdun razmerin chygaryp beret probelder dagy eseptelet
        System.out.println(word.concat(" Hello from bishkek"));//soz koshot biriktiret


        //simple(1,2,3,4,12,21,33,112,331,33,1222,421);
        //getSum(12,21,12);
    }
    /*          String
      Символдордун топтому жана сслочный тип
     */

    /*           foreach
     Массивге гана колдонулат

        int[] massiv = {1,2,43,5,33,4};

        for (int array:massiv) {
            System.out.print(array + " ");
        }
    */
    /*           Varargs
    Эгер биз методко канча сан беришибизди билбесек
    varargs колдонобуз ал массивге окшоп иштейт
    бирок методтун параметрине гана жазылат ошол жерде гана ишейт
    varargs параметр катары эн акыркы турушу керек жана бир методко бир эле жолу иштелет
    simple(int a,int ... numbers)
    ушул сыяктуу
     */
    public static void simple(int ... numbers){
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + "   ");
        }
    }


    public static void getSum(int ... numbers){
        int sum = 0;
        for (int array:numbers) {
            sum += array;
            System.out.print("\n"+array + " ");
        }
        System.out.println("\nBaarynyn summasy = " + sum);
    }

}
