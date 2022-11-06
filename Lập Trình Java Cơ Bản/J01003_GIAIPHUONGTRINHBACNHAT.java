import java.util.Scanner;

public class J01003_GIAIPHUONGTRINHBACNHAT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        if (a == 0 && b != 0)
        {
            System.out.println("VN");
        }
        else if (a == 0 && b == 0)
        {
            System.out.println("VSN");
        } else 
        {
            Float c = (float) -b/a;
            System.out.printf("%.2f", c);
        }
        input.close();
    }
}
