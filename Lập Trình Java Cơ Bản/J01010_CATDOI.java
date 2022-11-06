import java.util.Scanner;

public class J01010_CATDOI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = Integer.parseInt(input.nextLine());
        while (test-- > 0){
            String s = input.nextLine();
            String temp = "";
            boolean kt = true;
            for (int i = 0; i < s.length(); i++){
                if (kt == false){
                    break;
                }
                else{
                    switch (s.charAt(i)){
                        case '0':
                            temp += '0';
                            break;
                        case '1':
                            temp += '1';
                            break;
                        case '8':
                            temp += '0';
                            break;
                        case '9':
                            temp += '0';
                            break;
                        default:
                            kt = false;
                    }
                }
            }
            if (kt == true){
                long lo = Long.parseLong(temp);
                if (lo == 0) System.out.println("INVALID");
                else System.out.println(lo);
            }
            else System.out.println("INVALID");
        }  
        input.close();
    }

}

