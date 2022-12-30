import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J02033_Dao_Dau {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        ArrayList<Integer> M = new ArrayList<Integer>();
        for (int i = 0; i < n; i++){
            int x = input.nextInt();
            M.add(x);
        }
        Collections.sort(M);
        int x = 0;
        int min = 1000000000;
        for (int i = 0; i < n; i++){
            if (M.get(i) < 0){
                x++;
            }
            min = Math.min(Math.abs(M.get(i)), min);
        }
        if (x >= k){
            long temp1 = 0;
            for (int i = 0; i < n; i++){
                if (i < k) {
                    temp1 += -M.get(i);
                }
                else temp1 += M.get(i);
            }
            System.out.println(temp1);
        }
        else{
            long temp2 = 0;
            for (int i = 0; i < n; i++){
                temp2 += Math.abs(M.get(i));
            }
            k -= x;
            if (k % 2 != 0){
                temp2 -= 2 * min;
            }
            System.out.println(temp2);
        }
        input.close();
    }
}
