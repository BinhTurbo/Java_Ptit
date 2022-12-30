import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Staff nv = new Staff(input.nextLine(), input.nextInt(), input.nextInt(), input.next());
        System.out.println(nv);
        input.close();
    }
}
