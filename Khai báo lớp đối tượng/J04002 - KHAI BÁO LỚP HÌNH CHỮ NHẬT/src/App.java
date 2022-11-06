import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Rectange hcn = new Rectange(input.nextDouble(), input.nextDouble(), input.nextLine());
        System.out.println(hcn);
        //System.out.println(hcn); = System.out.println(hcn.toString());
        input.close();
    }
}
