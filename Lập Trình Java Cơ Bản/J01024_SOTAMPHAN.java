import java.util.Scanner;

public class J01024_SOTAMPHAN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = Integer.parseInt(input.nextLine());
        while (test-- > 0){
            System.out.println(check(input.nextLine()));
        }
        input.close();
    }
    public static String check(String s){
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (c != '0' && c != '1' && c != '2') return "NO";
        }
        return "YES";
    }
}
