import java.util.Scanner;


public class J02008_BOISONHONHATCUANSONGUYENDUONGDAUTIEN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = Integer.parseInt(input.nextLine());
        while (test-- > 0){
            int n = input.nextInt();
            long res = 1;
            for (int i = 2; i <= n; i++) 
                res = lcm(res, i);
            System.out.println(res);
        }
        input.close();
    }
    static long gcd (long a, long b) {
        if (b == 0) return a;
        else return gcd(b, a%b);
    }
    static long lcm (long a, long b) {
        return a / gcd(a, b) * b;
    }
}
