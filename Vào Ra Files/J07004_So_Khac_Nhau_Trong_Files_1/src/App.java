import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("DATA.in"));
        int[] A = new int[1009];
        while (input.hasNext()) {
            int x = Integer.parseInt(input.next());
            A[x]++;
        }
        for (int i = 0; i <= 1000; i++){
            if (A[i] != 0){
                System.out.println(i + " " + A[i]);
            }
        }
    }
}
