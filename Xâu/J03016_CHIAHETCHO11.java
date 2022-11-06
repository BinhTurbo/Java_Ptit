import java.util.*;
import java.math.*;
public class J03016_CHIAHETCHO11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        BigInteger x = new BigInteger("11");
        BigInteger zero = new BigInteger("0");
        while (t-- > 0)
        {
            BigInteger a = in.nextBigInteger();
            if (a.mod(x).equals(zero))
            {
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }
        in.close();
    }
}
