import java.util.Scanner;

public class J02037_Day_Uu_The {
    private static boolean Check(String[] M){
        int c = 0, l = 0;
        for (int i = 0; i < M.length; i++){
            if (Integer.parseInt(M[i]) % 2 == 0) c++;
            else l++;
        }
        if (((c + l) % 2 == 0 && c > l) || ((c + l) % 2 != 0 && c < l)) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = Integer.parseInt(input.nextLine());
        while (test-- > 0){
            String s = input.nextLine();
            String[] S = s.split(" ");
            System.out.println(Check(S) ? "YES" : "NO");
        }
        input.close();
    }
}
