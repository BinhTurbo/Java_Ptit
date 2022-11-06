import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class J01022_XAUNHIPJAN {
    private static List<Long> F = new ArrayList<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Fibo();
        int test = Integer.parseInt(input.nextLine());
        while (test-- > 0){
            int a = input.nextInt();
            long b = input.nextLong();
            System.out.println(binary_search(a, b));
        }
        input.close(); 
    }
    public static int binary_search(int a, long b){
        if (a == 0) return 0;
        if (a == 1) return 1;
        if (b > F.get(a -2)) return binary_search(a - 1, b - F.get(a - 2));
        return binary_search(a - 2, b);
    }
    public static void Fibo() {
        F.add((long) 1);
        F.add((long) 1);
        for (int i = 2; i < 93; i++) {
            F.add(F.get(i-1) + F.get(i-2));
        }
    }
}
