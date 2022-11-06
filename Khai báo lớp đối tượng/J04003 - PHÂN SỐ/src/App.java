import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Phanso p = new Phanso(input.nextLong(), input.nextLong());
        System.out.println(p.Toigian());
        input.close();
    }
}
