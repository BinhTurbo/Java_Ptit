import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class HELLOFILES {
    public static void main(String[] args) throws FileNotFoundException{
        try {
            Scanner input = new Scanner(new File("Hello.txt"));
            while (input.hasNextLine())
            {
                String data = input.nextLine();
                System.out.println(data);
            }
            input.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
