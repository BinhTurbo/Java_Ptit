import java.util.Scanner;
import java.math.*;
public class J01011_BOISOCHUNG_UOCSOCHUNG {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = Integer.parseInt(input.nextLine());
        while (test-- > 0)
        {
            BigInteger a = input.nextBigInteger();
            BigInteger b = input.nextBigInteger();
            BigInteger c = a.multiply(b);
            BigInteger d = a.gcd(b);
            System.out.println(c.divide(d) + " " + d);
        }
        input.close();
    }
}
