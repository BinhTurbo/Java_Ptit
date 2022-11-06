import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Thisinh a = new Thisinh(input.nextLine(),input.nextLine(),input.nextDouble(),input.nextDouble(),input.nextDouble());
        System.out.println(a);
        input.close();
    }
}
