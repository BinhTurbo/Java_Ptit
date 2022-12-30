import java.util.Scanner;

public class J03019_Xau_Con_Lon_Nhat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        int x = 0;
        for (int i = 'z'; i >= 'a'; i--) {
            for (int j = x; j < s.length(); j++){
                if (s.charAt(j) == i) {
                    System.out.printf(String.valueOf(s.charAt(j)));
                    x = j;
                }
            }
        }
        input.close();
    }
}