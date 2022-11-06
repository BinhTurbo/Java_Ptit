import java.util.Scanner;

public class J01012_UOCSOCHIAHETCHO2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = Integer.parseInt(input.nextLine());
        while(test-- > 0) {
            int n = input.nextInt();
            System.out.println(count(n));
        }
        input.close();
    }
    
    public static int count(int n) {
        int cnt = 0, sqr = (int) Math.sqrt(n);
        for (int i = 1; i <= sqr; i++) {
            if (n%i == 0) {
                if (i%2 == 0) cnt++;
                if ((n/i)%2 == 0) cnt++;
            }
        }
        if (sqr*sqr == n && sqr%2 == 0) cnt--;
        return cnt;
    }
}
