import java.util.Scanner;

public class J03021_Dien_Thoai_Cuc_Gach {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = Integer.parseInt(input.nextLine());
        while (test-- > 0) {
            String s = input.nextLine().toUpperCase();
            String temp = Phone(s);
            System.out.println(reversible(temp));
        }
    }
    static String reversible(String s) {
        for (int i = 0; i < s.length()/2; i++)
            if(s.charAt(i) != s.charAt(s.length()-1-i))
                return "NO";
        return "YES";
    }
    static String Phone(String s){
        String temp = "";
        for (int i = 0; i < s.length(); i++){
            temp += translate(s.charAt(i));
        }
        return temp;
    }

    static char translate(char c){
        if(c <= 'C') return '2';
        if(c <= 'F') return '3';
        if(c <= 'I') return '4';
        if(c <= 'L') return '5';
        if(c <= 'O') return '6';
        if(c <= 'S') return '7';
        if(c <= 'V') return '8';
        return '9';
    }
}
