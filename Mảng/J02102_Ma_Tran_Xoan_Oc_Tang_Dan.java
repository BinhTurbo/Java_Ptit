import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J02102_Ma_Tran_Xoan_Oc_Tang_Dan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] A = new int[n][n];
        ArrayList<Integer> M = new ArrayList<Integer>();
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                A[i][j] = input.nextInt();
                M.add(A[i][j]);
            }
        }
        Collections.sort(M);
        int x = 0;
        int c = n;
        for (int i = 0; i <= c / 2; i++){
            for (int j = i; j < n; j++) A[i][j] = M.get(x++);
            for (int j = i + 1; j < n; j++) A[j][n - 1] = M.get(x++);
            for (int j = n - 2; j >= i; j--)  A[n - 1][j] = M.get(x++);
            for (int j = n - 2; j > i; j--) A[j][i] = M.get(x++);
            n--;
        }
        for (int i = 0; i < c; i++){
            for (int j = 0; j < c; j++){
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        input.close();
    }
}
