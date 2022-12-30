import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Student ts = new Student(input.nextLine(), input.nextLine(), input.nextDouble(), input.nextDouble(), input.nextDouble());
        System.out.println(ts);
        input.close();
    }
}
