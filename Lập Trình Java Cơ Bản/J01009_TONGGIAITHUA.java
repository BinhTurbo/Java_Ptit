import java.util.Scanner;

public class J01009_TONGGIAITHUA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long sum = 0;
        long gt = 1;
        for (int i = 1; i <= n; i++){
            gt *= i;
            sum += gt;
        }
         System.out.println(sum);
        input.close();
    }
}
