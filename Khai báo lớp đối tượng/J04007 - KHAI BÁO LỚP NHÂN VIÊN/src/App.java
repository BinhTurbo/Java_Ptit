import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Nhanvien a = new Nhanvien(input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine());
        System.out.println(a);
        input.close();
    }
}
