import java.util.Scanner;

public class J01008_PHANTICHTHUASONGUYENTO {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = Integer.parseInt(input.nextLine());
        int d = 0;
        while (d++ < test)
        {
            Long n = input.nextLong();
            System.out.print("Test " + d + ": ");
            int i = 2;
            int dem = 0;
            while (n != 1 && n % 2 == 0){
                dem++;
                n /= 2;
            }
            if (dem != 0) System.out.print(i + "(" + dem + ") ");
            dem = 0;
            i = 3;
            while (n != 1){
                while (n % i == 0 && J01004_SONGUYENTO.isPrimeNumber(i)){
                    dem++;
                    n /= i;
                }
                if (dem != 0) System.out.print(i + "(" + dem + ") ");
                dem = 0;
                i += 2;
            }
            System.out.println("\n");
        }
        input.close();
    }
}

