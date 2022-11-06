import java.util.Scanner;


public class J01017_SOLIENKE {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = Integer.parseInt(input.nextLine());
        while (test-- > 0){
            String str = input.nextLine();
            String res = "YES";
            for (int i = 1; i < str.length(); i++){
                if (Math.abs(Character.getNumericValue(str.charAt(i)) - Character.getNumericValue(str.charAt(i - 1))) != 1){
                    res = "NO";
                    break;
                }
            }
            System.out.println( res );
        }
        input.close();
    }
}