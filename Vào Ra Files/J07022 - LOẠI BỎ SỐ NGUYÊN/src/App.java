import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("DATA.in"));
        ArrayList<String> lines = new ArrayList<String>();
        while (input.hasNext()) {
            String temp = input.next();
            try {
                Integer.valueOf(temp);
            }
            catch (NumberFormatException e) {
                lines.add(temp);
            }
        }
        Collections.sort(lines);
        // lines.sort((a,b) -> a.compareTo(b));
        // lines.forEach(n -> System.out.print(n + " "));
        for (String line : lines) {
            System.out.print(line + " ");
        }
    }
}
