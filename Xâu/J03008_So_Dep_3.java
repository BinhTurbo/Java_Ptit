import java.util.Scanner;
public class J03008_So_Dep_3 {
    public static int Check(String s) {
        int n = s.length();
        String x = "";
        for (int i = 0; i < n; i++) {
            x = s.charAt(i) + x;
            int k = s.charAt(i) - '0';
            if (k != 2 && k != 3 && k != 5 && k != 7)
                return 0;
        }
        if (s.compareTo(x) == 0)
            return 1;
        return 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        while (test-- > 0) {
            String s = input.next();
            if (Check(s) == 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
