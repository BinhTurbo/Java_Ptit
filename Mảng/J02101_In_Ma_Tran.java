import java.util.Scanner;

public class J02101_In_Ma_Tran{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = Integer.parseInt(input.nextLine());
        while (test-- > 0){
            int n = input.nextInt();
            int[][] A = new int[102][102];
            for (int i = 0; i < n; i++){
                for (int j = 0; j < n; j++){
                    A[i][j] = input.nextInt();
                }
            }
            for (int i = 0; i < n; i++){
                if (i % 2 == 0){
                    for (int j = 0; j < n; j++){
                        System.out.print(A[i][j] + " ");
                    }
                }
                else{
                    for (int j = n - 1; j >= 0; j--){
                        System.out.print(A[i][j] + " ");
                    }
                }
            }
            System.out.println();
        }
        input.close();
    }
}