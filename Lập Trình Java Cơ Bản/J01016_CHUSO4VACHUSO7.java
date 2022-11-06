import java.util.Scanner;

public class J01016_CHUSO4VACHUSO7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] ch = input.nextLine().toCharArray();
        int count = 0;
        for (char c : ch) {
            if (c == '4' || c == '7') {
                count++;
            }
        }
        System.out.println((count == 4 || count == 7) ? "YES" : "NO");
        input.close();
    }
}
