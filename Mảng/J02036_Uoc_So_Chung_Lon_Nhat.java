import java.util.ArrayList;
import java.util.Scanner;

public class J02036_Uoc_So_Chung_Lon_Nhat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = Integer.parseInt(input.nextLine());
        while (test-- > 0){
            int n = input.nextInt();
            ArrayList<Integer> A = new ArrayList<Integer>();
            for (int i = 0; i < n; i++){
                int x = input.nextInt();
                A.add(x);
            }
            ArrayList<Integer> B = new ArrayList<>();
            B.add(A.get(0));
            for (int i = 1; i < n; i++){
                B.add(Lcm(A.get(i), A.get(i - 1)));
            }
            B.add(A.get(n - 1));
            for (Integer x : B){
                System.out.print(x + " ");
            }
            System.out.println();
        }
        input.close();
    }

    private static int Gcd(int a, int b){
        while (a * b != 0){
            if (a > b) a %= b;
            else b %= a;
        }
        return a + b;
    }

    private static int Lcm(int a, int b){
        return (a * b) / Gcd(a, b);
    }
}
