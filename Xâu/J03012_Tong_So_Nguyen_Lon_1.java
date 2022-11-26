import java.util.*;
public class J03012_Tong_So_Nguyen_Lon_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
            System.out.println(sc.nextBigInteger().add(sc.nextBigInteger()));
        sc.close();
    }
}
