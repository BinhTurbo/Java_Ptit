import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J02026_Day_Con_Co_K_Phan_Tu_Tang_Dan {
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
            int[] A = new int[k + 1];
            for (int i = 1; i <= k; i++) A[i] = i;
            while (true){
                int a = 0;
                for (int i = 1; i <= k; i++){
                    System.out.print(M.get(A[i] - 1) + " ");
                }
                System.out.println();
                for (int i = k; i > 0; i--){
                    if (A[i] != n - k + i){
                        A[i]++;
                        a++;
                        for (int j = i + 1; j <= k; j++){
                            A[j] = A[j - 1] + 1;
                        }
                        break;
                    }
                }
                if (a == 0) break;
            }
        }
        input.close();
    }
}
