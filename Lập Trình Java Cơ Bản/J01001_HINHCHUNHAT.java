import java.util.Scanner;
public class J01001_HINHCHUNHAT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        if (a > 0 && b > 0)
        {
            System.out.println((a + b) * 2 + " " + (a * b));
        }
        else{
            System.out.println(0);
        }
        input.close();
    }
}
