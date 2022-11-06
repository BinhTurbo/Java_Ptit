import java.io.FileNotFoundException;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class J07022_LOAIBOSONGUYEN {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("DATA.in"));
        ArrayList <String> arr = new ArrayList<>();
        while (input.hasNext()){
            String temp = input.next();
            try{
                Integer.valueOf(temp);
            }
            catch (NumberFormatException e) {
                arr.add(temp);
            }
        }
        arr.sort((a, b) -> a.compareTo(b));
        arr.forEach(n -> System.out.print(n + " "));
        input.close();
    }
}
