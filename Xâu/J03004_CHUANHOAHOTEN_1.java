import java.util.Scanner;
import java.util.StringTokenizer;

public class J03004_CHUANHOAHOTEN_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = Integer.parseInt(input.nextLine());
        while (test-- > 0)
        {
            String name = input.nextLine();
            System.out.println(ChuanHoa(name));
        }
        input.close();
    }

    private static String ChuanHoa(String s)
    {
        StringTokenizer st = new StringTokenizer(s);
        StringBuilder kq = new StringBuilder();
        while (st.hasMoreTokens())
        {
            String t = st.nextToken();
            kq.append(Character.toUpperCase(t.charAt(0)));
            for (int i = 1; i < t.length(); i++)
            {
                kq.append(Character.toLowerCase(t.charAt(i)));
            }
            kq.append(" ");
        }
        return kq.toString().trim();
    }
}
