import java.util.Arrays;
import java.util.Scanner;

public class J03031_Xau_Day_Du {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = Integer.parseInt(input.nextLine());
        while (test-- > 0) {
            String s = input.next();
            int k = input.nextInt();
            int[] M = new int[200];
            Arrays.fill(M,0);
            for (int i = 0; i < s.length(); i++)
                M[s.charAt(i)]++;
            int a = 0;
            for (int i = 'a'; i <= 'z'; i++)
                if (M[i] > 0) a++;
            if (k + a >= 26 && s.length() >= 26) System.out.println("YES");
            else System.out.println("NO");
        }
        input.close();
    }
}