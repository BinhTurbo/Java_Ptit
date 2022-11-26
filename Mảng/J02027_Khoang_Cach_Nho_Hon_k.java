import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J02027_Khoang_Cach_Nho_Hon_k {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = Integer.parseInt(input.nextLine());
        while (test-- > 0){
            int n = input.nextInt();
            int k = input.nextInt();
            ArrayList<Integer> M = new ArrayList<Integer>();
            for (int i = 0; i < n; i++){
                int x = input.nextInt();
                M.add(x);
            }
            Collections.sort(M);
            long cnt = 0;
            for (int i = 0; i < n; i++){
                int x = LowerBound(M, M.get(i) + k, n);
                if (x - i - 1 > 0)
                    cnt += x - i - 1;
            }
            System.out.println(cnt);
        }
        input.close();
    }
    private static int LowerBound(ArrayList<Integer> A, int x, int n){
        int l = -1, r = n;
        while (l + 1 < r) {
            int m = (l + r) >>> 1;
            if (A.get(m) >= x) r = m;
                else l = m;
        }
        return r;
    }
}
