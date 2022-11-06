import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class J02004_MANGDOIXUNG {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = Integer.parseInt(input.nextLine());
        while (test-- > 0){
            int n = input.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++){
                list.add(input.nextInt());
            }
            System.out.println(palindrome(list));
        }
        input.close();
    }
    
    public static String palindrome(List<Integer> list) {
        for (int i = 0; i <= list.size()/2; i++) {
            if (list.get(i) != list.get(list.size()-i-1)) {
                return "NO";
            }
        }
        return "YES";
    }
}

// import java.util.Scanner;

// public class MANGDOIXUNG {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int test = input.nextInt();
//         while (test-- > 0){
//             int n = input.nextInt();
//             int[] a = new int[n];
//             for (int i = 0; i < n; i++){
//                 a[i] = input.nextInt();
//             }
//             System.out.println(check(a, n));
//         }
//         input.close();
//     }
//     static String check(int[] a, int n){
//         for (int i = 0; i <= n / 2; i++){
//             if (a[i] != a[n - i -1]){
//                 return "NO";
//             }
//         }
//         return "YES";
//     }
// }
