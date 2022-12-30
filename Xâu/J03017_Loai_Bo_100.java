
import java.util.Scanner;
import java.util.Stack;

public class J03017_Loai_Bo_100 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = Integer.parseInt(input.nextLine());
        while (test-- > 0){
            String s = input.next();
            char[] c = s.toCharArray();
            int len = 0, ans = 0;
            Stack <Character> st = new Stack <>();
            for (int i = c.length - 1; i >= 0; i--) {
                if (c[i] == '1') {
                    if (st.size() > 1) {
                        len += 3;
                        st.pop(); 
                        st.pop();
                    }
                    else {
                        st.clear();
                        len = 0;
                    }
                    ans = Math.max(len, ans);
                }
                else {
                    st.add('0');
                    if (st.size() > 2)
                        len = 0;
                }
            }
            System.out.println(ans);
        }
        input.close();
    }
}