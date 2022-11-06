import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input  = new Scanner(System.in);
        Phanso f1 = new Phanso(input.nextLong(), input.nextLong());
        Phanso f2 = new Phanso(input.nextLong(), input.nextLong());
        System.out.println(Phanso.add(f1,f2));
    }
}
