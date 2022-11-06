import java.util.*;
import java.math.*;
public class J03011_UOCSOCHUNGCUASONGUYENLON {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = Integer.parseInt(input.nextLine());
        while (t-- > 0)
        {
            BigInteger a = input.nextBigInteger();
            BigInteger b = input.nextBigInteger();
            System.out.println(a.gcd(b));
        }
        input.close();
    }
}
