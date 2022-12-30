import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception, FileNotFoundException {
        Scanner input = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Subject> M = new ArrayList<Subject>();
        for (int i = 0; i < n; i++) {
            M.add(new Subject(input.nextLine(), input.nextLine(), Integer.parseInt(input.nextLine())));
        }
        M.sort((a, b) -> {
            return a.getName().compareTo(b.getName());
        });
        M.forEach(System.out::println);
    }
}
