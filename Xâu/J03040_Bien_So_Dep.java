import java.util.Scanner;

public class J03040_Bien_So_Dep {
    private static boolean Check_1(String s){
        for (int i = 0; i < s.length() - 1; i++){
            if (s.charAt(i) >= s.charAt(i + 1)) return false;
        }
        return true;
    }

    private static boolean Check_2(String s){
        for (int i = 0; i < s.length() - 1; i++){
            if (s.charAt(i) != s.charAt(i + 1)) return false;
        }
        return true;
    }

    private static boolean Check_3(String s){
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) != '6' && s.charAt(i) != '8') return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = Integer.parseInt(input.nextLine());
        while (test-- > 0){
            String s = input.next();
            String a = s.substring(5, 8);
            String b = s.substring(9);
            s = a + b;
            if (Check_1(s) || Check_2(s) || Check_3(s) || (Check_2(a) && Check_2(b)))
                System.out.println("YES");
            else System.out.println("NO");
        }
        input.close();
    }
}
