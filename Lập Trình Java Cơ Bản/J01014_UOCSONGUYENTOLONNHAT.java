import java.util.Scanner;

public class J01014_UOCSONGUYENTOLONNHAT {
     static long mdv = 1;
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int test = Integer.parseInt(input.nextLine());
        while (test-- > 0){
            long n = Long.parseLong(input.nextLine());
            mdv = 1;
            n = Div(n, 2);
            n = Div(n, 3);
            int i = 5;
            while (i <= Math.sqrt(n)) {
                n = Div(n, i);
                n = Div(n, i+2);
                i += 6;
            }
            if (mdv < n) mdv = n;
            System.out.println(mdv);
        }
        input.close();
    }
    private static long Div(long n, long div) {
        if (n%div != 0) return n;
        mdv = div;
        while(n%div == 0)
            n /= div;
        return n;
    }
}
