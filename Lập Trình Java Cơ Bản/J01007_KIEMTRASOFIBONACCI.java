import java.util.Scanner;

public class J01007_KIEMTRASOFIBONACCI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = Integer.parseInt(input.nextLine());
        while (test-- > 0){
            long n = input.nextLong();
            if (checkfibo(n)) System.out.println("YES");
            else System.out.println("NO");
        }
        input.close();
    }

    public static boolean checkfibo(long n)
    {
        if (n <= 2) return true;
        long f2 = 1, f1 = 1;
        for (long i = 3; i <= 94; i++)
        {
            long fn = f1 + f2;
            if (fn == n) return true;
            f1 = f2;
            f2 = fn;
        }
        return false;
    }
}
