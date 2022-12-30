package Ls21_FilesIO;

import javax.imageio.IIOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder("java");
        System.out.println(stringBuilder);
        System.out.println("CharAt: " + stringBuilder.charAt(1));
        stringBuilder.setCharAt(0,'J');
        System.out.println("SetcharAt: " +stringBuilder );
        System.out.println("Append: " + stringBuilder.append(" 8 "));

    }

    private static void fileReader() {
        try(FileReader fileReader = new FileReader("java8Info.txt")){       // try with resources
            Scanner scanner = new Scanner(fileReader);
            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        }catch (IOException e){
            System.out.println("No such file! ");
        }
    }

    private static void fileWriter() {
        try(FileWriter fileWriter = new FileWriter("java8Info.txt");){     //try with resources
            fileWriter.write("----------Peaksoft House--------");
            fileWriter.write("\nCourse: java");
            fileWriter.write("\nGroup: java - 8");
            fileWriter.write("\nStudents: 60");
            fileWriter.write("\nMentors: Maksat , Muhammed, Rahim");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
