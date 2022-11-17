import java.util.Scanner;

public class J02105_Danh_Sach_Ke {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int[][] A = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                A[i][j] = input.nextInt();
            }
        }
        for (int i = 1; i <= n; i++) {
            System.out.printf("List(%d) = ", i);
            for (int j = 1; j <= n; j++)
                if (A[i][j] == 1) {
                    System.out.print(" " + j);
                }
            System.out.println();
        }
        input.close();
    }
}
