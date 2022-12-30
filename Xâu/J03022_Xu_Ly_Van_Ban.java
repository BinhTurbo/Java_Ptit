import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class J03022_Xu_Ly_Van_Ban {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String temp = "";
        ArrayList<String> S = new ArrayList<String>();
        while (input.hasNext()){
            String s = input.next();
            if (s.charAt(s.length() - 1) == '.' || s.charAt(s.length() - 1) == '!' || s.charAt(s.length() - 1) == '?'){
                temp += s.substring(0, s.length() - 1);
                S.add(temp.trim().toLowerCase(Locale.ROOT));
                temp = "";
            }
            else {
                temp += s + " ";
            }
            if (s.isEmpty()) break;
        }

        for (String x : S){
            for (int i = 0; i < x.length(); i++){
                if (i == 0) {
                    System.out.print((char) (x.charAt(i) - 32));
                }
                else System.out.print(x.charAt(i));
            }
            System.out.println();
        }
        input.close();
    }
}
