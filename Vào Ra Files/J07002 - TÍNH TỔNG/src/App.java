import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("DATA.in"));
        long sum = 0;
        while (input.hasNext()){
            String temp = input.next();
            try{
                sum += Integer.parseInt(temp);
            }
            catch (NumberFormatException e){
                continue;
            }
        }
        System.out.println(sum);
    }
}
