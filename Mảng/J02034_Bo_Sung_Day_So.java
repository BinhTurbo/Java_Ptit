import java.util.Arrays;
import java.util.Scanner;

public class J02034_Bo_Sung_Day_So {
    static int[] X = new int[201];
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Arrays.fill(X, 0);
        int n = input.nextInt();
        int[] A = new int[n + 1];
        int max = 0;
        for (int i = 0; i < n; i++){
            A[i] = input.nextInt();
            X[A[i]] = 1;
            if (max < A[i]) max = A[i];
        }
        boolean kt = false; 
        for (int i = 1; i <= max; i++){
            if (X[i] == 0){
                kt = true;
                System.out.println(i);
            }
        }
        if (kt == false) System.out.print("Excellent!");
        input.close();
    }
}
