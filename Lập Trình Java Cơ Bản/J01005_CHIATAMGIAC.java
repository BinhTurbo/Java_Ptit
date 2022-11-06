import java.util.Scanner;


public class J01005_CHIATAMGIAC {
    public static void findPoint(int n, int h){
        for (int i = 1; i < n; i++)
        {
            System.out.printf("%.6f ",Math.sqrt(i / (n * 1.0)) * h);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = Integer.parseInt(input.nextLine());
        while (test-- > 0)
        {
            int n = input.nextInt();
            int h = input.nextInt();
            findPoint(n, h);
            System.out.println("\n");
        }
        input.close();
    }
}

