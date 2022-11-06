import java.util.Scanner;


public class J03006_SODEP_1 {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int t = sc.nextInt();
    //     sc.nextLine();
    //     while (t-- > 0) {
    //         StringBuffer s = new StringBuffer(sc.nextLine());
    //         System.out.println(s.toString().matches("[^13579]+") && s == s.reverse() ? "YES" : "NO");
    //     }
    //     sc.close();
    // }
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int test = Integer.parseInt(input.nextLine());
        while (test-- > 0){
            System.out.println(Solve());
        }
        input.close();
    }
    private static String Solve(){
        char[] s = input.nextLine().toCharArray();
        for (int i = 0; i < s.length / 2; i++){
            if (s[i] != s[s.length - i - 1] || Character.getNumericValue(s[i]) % 2 != 0){
                return "NO";
            }
        }
        return "YES";
    }
}