import java.util.Scanner;


public class J01004_SONGUYENTO {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = Integer.parseInt(input.nextLine());
        while (test-- > 0)
        {
            long n = input.nextLong();
            if (isPrimeNumber(n))
            {
                System.out.println("YES");
            } else System.out.println("NO");

        }
        input.close();
    }
    public static boolean isPrimeNumber(long n){
        if (n < 2) return false;
        else{
            int suareRoot = (int) Math.sqrt(n);
            for (int i = 2; i <= suareRoot; i++)
            {
                if (n % i == 0)
                {
                    return false;
                }
            }
        }
        return true;
    }
}
