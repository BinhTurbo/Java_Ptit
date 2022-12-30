import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner input = new Scanner(new File("SV.in"));
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Sinhvien> M = new ArrayList<>();
        try {
            for (int i = 1; i <= n; i++) {
                M.add(new Sinhvien(i, input.nextLine(), input.nextLine(), input.nextLine(), Double.parseDouble(input.nextLine())));
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        M.forEach(System.out::println);
    }
}
