import java.util.*;
public class J02016_Bo_Ba_So_Pytago {

    private static boolean check (long[] A, int n) {
        Arrays.sort(A);
        int i = n-1, j = i - 1, k = 0;
        while (j > k) {
            if (A[i] == A[j] + A[k])    
                return true;
            if (A[i] > A[j] + A[k]) {
                k++;
            }
            else if (A[i] < A[j] + A[k]) {
                j--;
            }
            if (j == k) {
                i--;
                j = i-1;
                k = 0;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                a[i] *= a[i];
            }
            System.out.println(check(a, n) ? "YES" : "NO");
        }
        sc.close();
    }
}
