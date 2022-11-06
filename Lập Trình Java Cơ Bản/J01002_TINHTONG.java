import java.util.Scanner;
public class J01002_TINHTONG {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        while (test > 0)
        {
          long number = input.nextInt();
          long s = (number * (number + 1)) / 2;
           System.out.println(s);
           test--;
        }
        input.close();
    }
}
