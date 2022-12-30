import java.util.*;

public class J01020_Day_Du_Cac_Chu_So {
    static int used[] = new int[10];
    static int cnt;

    public static void check(int n) {
        while (n > 0) {
            int x = n % 10;
            if (used[x] == 0) {
                used[x] = 1;
                cnt++;
            }
            n /= 10;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = Integer.parseInt(input.nextLine());
        while (test-- > 0) {
            int n = input.nextInt();
            if (n == 0) System.out.println("Impossible");
            else {
                for (int i = 0; i < 10; i++) used[i] = 0;
                int i = 1;
                cnt = 0;
                check(n);
                while (cnt < 10) {
                    i++;
                    check(n * i);
                }
                System.out.println(n * i);
            }
        }
        input.close();
    }
}


// import java.io.*;
// import java.util.*;


// public class J01020 {

//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int t = Integer.parseInt(sc.nextLine());

//         while(t-->0){

//             int n = sc.nextInt();
//             if(n == 0) System.out.println("Impossible");
//             else{
                
//                 int i = 1;
//                 Set<Integer> st = new HashSet<>();
//                 while(true){
                    
//                     getDigits(st,n*i);
//                     if(st.size() >= 10){
                        
//                         System.out.println(n*i);
//                         break;
                        
//                     }
//                     i += 1;
                    
//                 }
                
//             }

//         }

//         sc.close();
//     }

//     private static void getDigits(Set<Integer> st, int n){
        
//         while(n>0){
            
//             st.add(n%10);
//             n /= 10;
            
//         }
        
//     }
    
// }