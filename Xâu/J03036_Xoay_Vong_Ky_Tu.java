import java.util.*;

public class J03036_Xoay_Vong_Ky_Tu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String[] A = new String[n];
        for (int i = 0; i < n; i++) {
            A[i] = input.next();
        }
        int res = (int) 1e9;
        boolean check = true;
        Loop:
            for (int i = 0; i < n; i++) {
                String[] tmp = A.clone();
                int cnt = 0;
                for (int j = 0; j < n; j++) {
                    int d = 0;
                    while (!tmp[j].equals(A[i])) {
                        tmp[j] += tmp[j].charAt(0);
                        tmp[j] = tmp[j].substring(1);
                        cnt++;
                        d++;
                        if (d > A[i].length()) {
                            check = false;
                            break Loop;
                        }
                    }
                }
                res = Math.min(res, cnt);
            }
        if (check)
            System.out.print(res);
        else
            System.out.print(-1);
        input.close();
    }
}