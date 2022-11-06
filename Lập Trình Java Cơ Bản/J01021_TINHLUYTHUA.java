import java.util.*;
public class J01021_TINHLUYTHUA {
    private static final int Mod = (int) (1e9 + 7);
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true){
            long a = input.nextLong();
            long b = input.nextLong();
            if (a + b == 0) break;
            System.out.println(Pow(a,b));
        }
        input.close();
    }

    public static long Pow(long a, long b){
        if (b == 0) return 1;
        long pow50 = Pow(a,b/2);
        if (b % 2 == 0) return pow50 % Mod * pow50 % Mod;
        return pow50 % Mod * pow50 % Mod * a % Mod;
    }
}
