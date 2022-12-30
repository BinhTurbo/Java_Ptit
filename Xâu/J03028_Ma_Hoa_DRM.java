import java.util.Scanner;
public class J03028_Ma_Hoa_DRM {
    static int Distance(String s){
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += s.charAt(i) - 'A';
        }
        while (sum > 26) sum -= 26;
        return sum;
    }
    static Character Route(char x, int k){
        int m = x - 'A' + k;
        if (m <= 25) return (char)(x + k);
        else {
            return (char)(m - 26 + 'A');
        }
    }
    static String EnCode(String s, int k){
        String enCode = "";
        for (int i = 0; i < s.length(); i++){
            enCode += Route(s.charAt(i), k);
        }
        return enCode;
    }
    static String DRM(String s_1, int d_1, String s_2, int d_2){
        String val_1 = EnCode(s_1, d_1);
        String val_2 = EnCode(s_2, d_2);
        String res = "";
        for (int i = 0; i < val_1.length(); i++){
            res += Route(val_1.charAt(i), val_2.charAt(i) - 'A');
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = Integer.parseInt(input.nextLine());
        while (test-- > 0) {
            String s = input.nextLine();
            String s1 = s.substring(0, s.length() / 2);
            String s2 = s.substring(s.length() / 2);
            int d1 = Distance(s1), d2 = Distance(s2);
            System.out.println(DRM(s1, d1, s2, d2));
        }
        input.close();
    }
}