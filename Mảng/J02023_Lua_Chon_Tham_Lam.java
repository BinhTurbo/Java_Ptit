import java.util.Scanner;

public class J02023_Lua_Chon_Tham_Lam {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int s = input.nextInt();
        if (s == 0 || s > n * 9) {
            System.out.println("-1 -1");
        }
        else {
            String a = "", b = "";
            int x = s, y = s;
            x--;
            for (int i = n; i >= 1; i--){
                if (x >= 9) {
                    a = "9" + a;
                    x -= 9;
                }
                else {
                    if (i == 1){
                        int z = x + 1;
                        a = z + a;
                    }
                    else {
                        a = x + a;
                        x = 0;
                    }
                }
            }
            for (int i = n; i >= 1; i--){
                if (y >= 9) {
                    b += "9";
                    y -= 9;
                }
                else {
                    b += y;
                    y = 0;
                }
            }
            System.out.println(a + " " + b);
        }
        input.close();
    }
}
