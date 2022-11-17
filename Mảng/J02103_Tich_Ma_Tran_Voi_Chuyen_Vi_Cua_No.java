import java.util.Scanner;

public class J02103_Tich_Ma_Tran_Voi_Chuyen_Vi_Cua_No {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test  = Integer.parseInt(input.nextLine());
        for (int d = 1; d <= test; d++) {
            int n = input.nextInt();
            int m = input.nextInt();
            int[][] A = new int[n + 1][m + 1];
            int[][] B = new int[m + 1][n + 1];
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    A[i][j] = B[j][i] = input.nextInt();
                }
            }
            System.out.printf("Test %d:\n",d);
            for (int i = 1; i <= n; i++){
                for (int j = 1; j <= n; j++){
                    int x = 0;
                    for (int k = 1; k <= m; k++){
                        x += A[i][k] * B[k][j];
                    }
                    System.out.printf("%d ", x);
                }
                System.out.println();
            }
            input.close();
        }
    }
}
