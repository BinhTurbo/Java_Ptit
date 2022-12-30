import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class App {
    public static void main(String[] args) throws Exception, FileNotFoundException {
        Scanner input = new Scanner(new File("DATA.in"));
        while (input.hasNextLine()) {
            String name = input.nextLine();
            if (name.equals("END")) break;
            else if (ChuanHoa(name).equals(" ") == false)
                System.out.println(ChuanHoa(name));
        }
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
