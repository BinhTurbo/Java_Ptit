import java.util.Scanner;

public class J01026_SOCHINHPHUONG {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = Integer.parseInt(input.nextLine());
        while (test-- > 0)
        {
            int n = input.nextInt();
            if (checkPerfectSquare(n)) System.out.println("YES");
            else System.out.println("NO");
        }
        input.close();
    }
    static boolean checkPerfectSquare(double x)
    {
        double sq = Math.sqrt(x);
        return ((sq - Math.floor(sq)) == 0);
    }
}
