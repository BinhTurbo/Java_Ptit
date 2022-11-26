import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
public class J02025_Day_Con_Co_Tong_Nguyen_To {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = Integer.parseInt(input.nextLine());
        while (test-- > 0){
            int n = input.nextInt();
            ArrayList<Integer> M = new ArrayList<Integer>();
            for (int i = 0; i < n; i++){
                int x = input.nextInt();
                M.add(x);
            }
            Collections.sort(M);
            Collections.reverse(M);
            int[] A = new int[n];
            Arrays.fill(A, 0);
            while (true){
                int a = 0;
                for (int i = n - 1; i >= 0; i--){
                    if (A[i] == 0){
                        A[i] = 1;
                        a++;
                        for (int j = i + 1; j < n; j++){
                            A[j] = 0;
                        }
                        break;
                    }
                }
                if (a == 0) break;
                int sum = 0;
                for (int i = 0; i < n; i++){
                    sum += A[i] * M.get(i);
                }
                if (isPrime(sum)){
                    for (int i = 0; i < n; i++)
                        if (A[i] == 1) System.out.print(M.get(i) + " ");
                    System.out.println();
                }
            }
        }
        input.close();
    }

    private static boolean isPrime(int n){
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return n >= 2;
    }
}
