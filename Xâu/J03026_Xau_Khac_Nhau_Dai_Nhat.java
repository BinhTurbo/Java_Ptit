import java.util.Scanner;

public class J03026_Xau_Khac_Nhau_Dai_Nhat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = Integer.parseInt(input.nextLine());
        while (test-- > 0){
            String a = input.next();
            String b = input.next();
            System.out.println(a.equals(b) ? "-1" : Math.max(a.length(), b.length()));
        }
        input.close();
    }
}
