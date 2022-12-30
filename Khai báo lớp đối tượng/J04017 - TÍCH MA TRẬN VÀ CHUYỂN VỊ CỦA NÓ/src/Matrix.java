import java.util.Scanner;

public class Matrix {
    private int[][] M;
    public Matrix(int n, int m) {
        this.M = new int[n][m];
    }
    public Matrix(int[][] M){
        this.M = M;
    }
    public Matrix nextMatrix(Scanner sc){
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                M[i][j] = sc.nextInt();
            }
        }
        return new Matrix(M);
    }

    public Matrix trans(){
        int[][] tran = new int[M[0].length][M.length];
        for (int i = 0; i < tran.length; i++) {
            for (int j = 0; j < tran[0].length; j++) {
                tran[i][j] = M[j][i];
            }
        }
        return new Matrix(tran);
    }
    public Matrix mul(Matrix b) {
        int[][] temp = new int[M.length][b.M[0].length];
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[0].length; j++) {
                temp[i][j] = 0;
            }
        }
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < b.M[0].length; j++) {
                for (int k = 0; k < M[0].length; k++) {
                    temp[i][j] += M[i][k] * b.M[k][j];
                }
            }
        }
        return new Matrix(temp);
    }
    @Override
    public String toString() {
        String res = "";
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                res += M[i][j] + " ";
            }
            res += "\n";
        }
        return res;
    }
}
