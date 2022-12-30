import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;

public class J03010_Dia_Chi_Email {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = Integer.parseInt(input.nextLine());
        Map<String, Integer> m = new HashMap<String, Integer>();
        while (test-- > 0) {
            String s = input.nextLine();
            List<String> a = new ArrayList<String>();
            String x = "";
            s = s.toLowerCase() + " ";
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ' ') {
                    if (x != "") {
                        a.add(x);
                        x = "";
                    }
                } else {
                    x += s.charAt(i);
                }
            }
            s = a.get(a.size() - 1);
            for (int i = 0; i < a.size() - 1; i++)
                s += a.get(i).substring(0, 1);
            if (m.get(s) == null) {
                m.put(s, 1);
                x = "";
            } else {
                x = Integer.toString(m.get(s) + 1);
                m.put(s, m.get(s) + 1);
            }
            System.out.println(s + x + "@ptit.edu.vn");
        }
        input.close();
    }
}
