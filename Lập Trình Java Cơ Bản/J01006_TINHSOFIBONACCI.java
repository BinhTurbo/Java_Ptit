import java.util.Scanner;
public class J01006_TINHSOFIBONACCI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = Integer.parseInt(input.nextLine());
        while (test-- > 0){
            int n = input.nextInt();
            if (n <= 2) System.out.println(1);
            else
            {
                long a = 1, b = 1;
                long temp = 0;
                for (int i = 3; i <= n; i++)
                {
                    temp = a + b;
                    a = b;
                    b = temp;
                }
                System.out.println(temp);
            }
        }
        input.close();
    }
}
