import java.util.Scanner;

public class J01018_SOKHONGLIENKE {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = Integer.parseInt(input.nextLine());
        while (test-- > 0){
            String check = "YES";
            String str = input.nextLine();
            int s = Character.getNumericValue(str.charAt(0));
            for (int i = 1; i < str.length(); i++){
                if (Math.abs(Character.getNumericValue(str.charAt(i)) - Character.getNumericValue(str.charAt(i - 1))) != 2){
                    check = "NO";
                    break;
                }
                s += Character.getNumericValue(str.charAt(i));
            }
            if (s % 10 != 0)  check = "NO";
            System.out.println(check);
        }
        input.close();
    }
}
