import java.util.ArrayList;
import java.util.Scanner;

public class J02035_Quay_Phai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        while (test-- > 0){
            int n = input.nextInt();
            ArrayList<Integer> M = new ArrayList<Integer>();
            int min = 10000000, max = 0;
            for (int i = 0; i < n; i++){
                int x = input.nextInt();
                M.add(x);
                min = Math.min(min, x);
                max = Math.max(max, x);
            }
            System.out.println(Count(M, min, max, n));
        }
        input.close();
    }

    private static int Count(ArrayList<Integer> M, int min, int max, int n){
        int cnt = 0;
        while (true){
            if (M.get(0) == min && M.get(n - 1) == max) return cnt;
            M.add(M.get(0));
            M.remove(0);
            cnt++;
        }
    }
}
