import java.util.Scanner;

public class J03023_So_La_Ma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = Integer.parseInt(input.nextLine());
        while (test-- > 0){
            String s = input.nextLine();
            int temp = 0;
            for (int i = 0; i < s.length(); i++){
                if (s.charAt(i) == 'I'){
                    if ((i + 1 < s.length()) && (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X')){
                        temp -= 1;
                    }
                    else {
                        temp += 1;
                    }
                }
                else if (s.charAt(i) == 'X') {
                    if ((i + 1 < s.length()) && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C')){
                        temp -= 10;
                    }
                    else {
                        temp += 10;
                    }
                } 
                else if (s.charAt(i) == 'C') {
                    if ((i + 1 < s.length()) && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M')){
                        temp -= 100;
                    }
                    else {
                        temp += 100;
                    }
                }
                else if (s.charAt(i) == 'D') temp += 500;
                else if (s.charAt(i) == 'M') temp += 1000;
                else if (s.charAt(i) == 'L') temp += 50;
                else temp += 5;
            }
            System.out.println(temp);
        }
        input.close();
    }
}
