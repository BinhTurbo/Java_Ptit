import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07001_DOCFILEVANBAN {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner input = new Scanner(new File("DATA.in"));
        while (input.hasNextLine()){
            System.out.println(input.nextLine());
        }
    }
}