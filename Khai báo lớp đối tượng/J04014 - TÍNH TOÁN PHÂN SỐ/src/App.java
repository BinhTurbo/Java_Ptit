import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int test = Integer.parseInt(input.nextLine());
        while (test-- > 0) {
            Phanso f1 = new Phanso(input.nextLong(), input.nextLong());
            Phanso f2 = new Phanso(input.nextLong(), input.nextLong());
            Phanso f3 = f1.add(f2);
            System.out.print(f3 + " ");
            System.out.println(f3.mul(f1, f2));
        }
        input.close();
    }
}
