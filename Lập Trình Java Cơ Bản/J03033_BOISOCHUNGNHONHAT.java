import java.math.BigInteger;
import java.util.Scanner;

public class J03033_BOISOCHUNGNHONHAT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = Integer.parseInt(input.nextLine());
        while (test-- > 0){

            BigInteger a = input.nextBigInteger();
            BigInteger b = input.nextBigInteger();

            // BigInteger a = new BigInteger(input.nextLine());
            // BigInteger b = new BigInteger(input.nextLine());
            BigInteger gcd = a.gcd(b);
            BigInteger res = a.multiply(b).divide(gcd);
            System.out.println(res);
        }
        input.close();
    }
    
}
