import java.util.Scanner;
import java.util.HashSet;
import java.util.Arrays;

public class J03009_TAPTURIENGCUAHAIXAU {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = Integer.parseInt(input.nextLine());
        while (test-- > 0)
        {
            HashSet<String> set1 = new HashSet<>(Arrays.asList(input.nextLine().split(" ")));
            HashSet<String> set2 = new HashSet<>(Arrays.asList(input.nextLine().split(" ")));
            for (String i : set1)
                if (!set2.contains(i))
                    System.out.print(i + " ");
            System.out.println();
        }
        input.close();
    }
}
