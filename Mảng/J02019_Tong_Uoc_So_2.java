import java.util.Arrays;
import java.util.Scanner;

public class J02019_Tong_Uoc_So_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int[] A = new int[b + 1];
        Arrays.fill(A, 0);
        for (int i = 1; i < b; i++){
            for (int j = 2 * i; j <= b; j += i){
                A[j] += i;
            }
        }
        int cnt = 0;
        for (int i = a; i <= b; i++){
            if (A[i] > i) cnt++;
        }
        System.out.println(cnt);
        input.close();
    }
}
