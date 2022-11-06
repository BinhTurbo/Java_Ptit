import java.util.Arrays;
import java.util.Scanner;

public class J02022_So_Xa_Cach {
    static int[] map = new int[0];
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        while (test-- > 0){
            int n = input.nextInt();
            map = new int[n + 1];
            Arrays.fill(map,0);
            Try(1, "", n);
        }
        input.close();
    }

    public static void Try(int i, String res, int n){
        for (int j = 1; j <= n; j++){
            if (map[j] == 0){
                map[j] = 1;
                res += Integer.toString(j);
                if (i == n) check(res);
                else Try(i + 1, res, n);
                map[j] = 0;
                res = res.substring(0,res.length() - 1);
            }
        }
    }

    public static void check(String s){
        for (int i = 0; i < s.length() - 1; i++){
            if (Math.abs(s.charAt(i) - s.charAt(i + 1)) == 1){
                return;
            }
        }
        System.out.println(s);
    }
}
