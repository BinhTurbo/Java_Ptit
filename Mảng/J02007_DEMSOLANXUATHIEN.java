import java.util.Scanner;

public class J02007_DEMSOLANXUATHIEN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // int test = input.nextInt();
        int test = Integer.parseInt(input.nextLine());
        int d = 0;
        while (test-- > 0){
            int n = input.nextInt();
            int[] a = new int[n + 1];
            int[] b = new int[100001];
            for (int i = 0; i < n; i++){
                a[i] = input.nextInt();
                b[a[i]]++;
            }
            System.out.println("Test " + ++d + ":");
            for (int i = 0; i < n; i++){
                if (b[a[i]] != 0){
                    System.out.println(a[i] + " xuat hien " + b[a[i]] + " lan");
                    b[a[i]] = 0;
                }
            }
        }
        input.close();
    }
}
