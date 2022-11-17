import java.util.Scanner;

public class J02104_Danh_Sach_Canh{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int[][] A = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                A[i][j] = input.nextInt();
            }
        }
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                if (A[i][j] == 1){
                    System.out.printf("(%d,%d)\n", i, j);
                    A[i][j] = A[j][i] = 0;
                }
            }
        }
        input.close();
    }
}