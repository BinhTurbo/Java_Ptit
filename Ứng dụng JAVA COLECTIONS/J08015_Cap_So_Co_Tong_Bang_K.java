import java.util.HashMap;
import java.util.Scanner;

public class J08015_Cap_So_Co_Tong_Bang_K {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = Integer.parseInt(input.nextLine());
        while (test-- > 0){
            int n = input.nextInt();
            long k = input.nextLong();
            long[] a = new long[n];
            for (int i = 0; i < n; i++){
                a[i] = input.nextLong();
            }
            System.out.println(countPair(a, k));
        }
        input.close();
    }
    private static long countPair(long[] a, long k){
        long count = 0;
        HashMap<Long, Long> hm = new HashMap<>();
        for (int i = 0; i < a.length; i++){
            if (!hm.containsKey(a[i])) hm.put(a[i], (long) 1);
            else hm.put(a[i], hm.get(a[i]) + 1);
        }
        for (int i = 0; i < a.length; i++){
            if (hm.get(k - a[i]) != null) count += hm.get(k - a[i]);
            if (k - a[i] == a[i]) count--;
        }
        return count/2;
    }
}