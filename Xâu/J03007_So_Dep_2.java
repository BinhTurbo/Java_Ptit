import java.util.Scanner;

public class J03007_So_Dep_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = Integer.parseInt(input.nextLine());
        while (test-- > 0){
            StringBuilder st = new StringBuilder(input.nextLine());
            if (checkString(st) == true){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
        input.close();
    }
    private static boolean checkString(StringBuilder s){
        int d = 0, n = s.length();
        StringBuilder x = s.reverse();
        if (s.charAt(0) != '8' && s.charAt(n - 1) != '8')
            return false;
        for (int i = 0; i < n; i++) {
            d += s.charAt(i) - '0';
        }
        if (d % 10 == 0 && s.equals(x) == true)
            return true;
        return false;
    }
    
}
