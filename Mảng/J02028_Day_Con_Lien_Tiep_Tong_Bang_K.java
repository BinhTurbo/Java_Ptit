import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class J02028_Day_Con_Lien_Tiep_Tong_Bang_K {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = Integer.parseInt(input.nextLine());
        while (test-- > 0){
            int n = input.nextInt();
            long k = input.nextLong();
            ArrayList<Long> M = new ArrayList<Long>();
            HashSet<Long> X = new HashSet<>();
            for (int i = 0; i < n; i++){
                long temp = input.nextLong();
                if (i == 0) M.add(temp);
                else M.add(temp + M.get(i - 1));
                X.add(M.get(i));
            }
            System.out.println(Kiemtra(M, n, k, X));
        }
        input.close();
    }

    private static String Kiemtra(ArrayList<Long> M, int n, long k, HashSet<Long> X){
        if (k == 0) return "NO";
        if (M.contains(k)) return "YES";
        for (int i = 0; i < n; i++){
            int z = X.size();
            X.add(M.get(i) + k);
            if (X.size() == z) return "YES";
            else X.remove(M.get(i) + k);
        }
        return "NO";
    }
}
