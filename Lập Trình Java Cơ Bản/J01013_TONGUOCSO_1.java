import java.util.Scanner;

public class J01013_TONGUOCSO_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer n = Integer.parseInt(input.nextLine());
        long sum = 0;
        while (n-- > 0){
            int k = input.nextInt();
            sum += Check_Sum(k);
        }
        System.out.println(sum);
        input.close();
    }
    public static long Check_Sum(int k){
        long sum = 0;
        while(k % 2 == 0){
            sum += 2;
            k /= 2;
        }
        while (k % 3 == 0){
            sum += 3;
            k /= 3;
        }
        int i = 5;
        while (i <= Math.sqrt(k)){
            while (k % i == 0){
                sum += i;
                k /= i;
            }
            while (k % (i + 2) == 0){
                sum += i + 2;
                k /= (i + 2);
            }
            i += 6;
        }
        if (k > 1) sum += k;
        return sum;
    }
}
