import java.util.Scanner;

public class J02106_Ma_Tran_Nhi_Phan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] A = new int[n + 1][4];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 3; j++) {
                A[i][j] = input.nextInt();
            }
        }
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            int zero = 0, one = 0;
            for (int j = 1; j <= 3; j++) {
                if (A[i][j] == 0) {
                    zero++;
                }
                else one++;
            }
            if (one > zero) {
                cnt++;
            }
        }
        System.out.println(cnt);
        input.close();
    }
}
