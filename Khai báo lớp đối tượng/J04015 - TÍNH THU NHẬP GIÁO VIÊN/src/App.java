import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Teacher a = new Teacher(input.nextLine(), input.nextLine(), input.nextLong());
        System.out.println(a);
    }
}
