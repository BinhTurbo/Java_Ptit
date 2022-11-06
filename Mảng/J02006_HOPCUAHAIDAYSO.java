import java.util.Scanner;

public class J02006_HOPCUAHAIDAYSO{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int[] a = new int[1001];
        int[] b = new int[1001];
        for (int i = 0; i < n; i++){
            int x = input.nextInt();
            a[x] = 1;
        }
        for (int i = 0; i < m; i++){
            int y = input.nextInt();
            b[y] = 1;
        }
        for (int i = 0; i < 1001; i++){
            if (a[i] == 1 || b[i] == 1) System.out.print(i + " ");
        }
        input.close();
    }
}