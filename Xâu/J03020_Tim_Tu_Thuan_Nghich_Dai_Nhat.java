import java.util.ArrayList;
import java.util.Scanner;

public class J03020_Tim_Tu_Thuan_Nghich_Dai_Nhat {
    private static boolean Check(String s){
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> S = new ArrayList<String>();
        while (input.hasNext()) {
            String s = input.next();
            if (Check(s)) S.add(s);
            if (s.isEmpty()) break;
        }
        int max_length = 0;
        for (String s : S) {
            max_length = Math.max(max_length, s.length());
        }
        for (int i = 0; i < S.size(); i++){
            int x = 0;
            for (int j = 0; j < i; j++){
                if (S.get(i).equals(S.get(j)))
                    x++;
            }
            if (x > 0) continue;
            if (S.get(i).length() == max_length) {
                int count = 0;
                for (int j = 0; j < S.size(); j++){
                    if (S.get(i).equals(S.get(j))) {
                        count++;
                    }
                }
                System.out.println(S.get(i) + " " + count);
            }            
        }
        input.close();
    }
}
