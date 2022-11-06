import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int test = Integer.parseInt(input.nextLine());
        while (test-- > 0){
            Point p1 = new Point(input.nextDouble(), input.nextDouble());
            Point p2 = new Point(input.nextDouble(), input.nextDouble());
            // System.out.printf("%.4f", Point.distance(p1, p2));
            System.out.printf("%.4f", p1.distance(p2));
            System.out.println();
        }
        input.close();
    }
}
