import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int test = Integer.parseInt(input.nextLine());
        while (test-- > 0){
            Point A = new Point(input.nextDouble(), input.nextDouble());
            Point B = new Point(input.nextDouble(), input.nextDouble());
            Point C = new Point(input.nextDouble(), input.nextDouble());
            double c = A.distance(B);
            double b = A.distance(C);
            double a = B.distance(C);
            if ((a + b) <= c || (b + c) <= a || (c + a) <= b)
                System.out.println("INVALID");
            else {
                double S = Math.sqrt((a + b + c) * (a + b - c) * (b + c - a) * (c + a - b)) / 4;
                // System.out.printf("%.3f\n", s);
                double R = (a * b * c) / (4 * S);
                System.out.format("%.3f\n", Math.PI * Math.pow(R, 2));
            }
        }
        input.close();
    }
}
