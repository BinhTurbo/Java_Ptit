import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Sinhvien a = new Sinhvien(input.nextLine(), input.nextLine(), input.nextLine(),input.nextDouble());
        System.out.println(a);
        input.close();
    }
}
