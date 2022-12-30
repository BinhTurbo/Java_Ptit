import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new FileInputStream("MONHOC.in"));
        int test = Integer.parseInt(input.nextLine());
        ArrayList<Monthi> M = new ArrayList<Monthi>();
        while (test-- > 0){
            M.add(new Monthi(input.nextLine(), input.nextLine(), input.nextLine()));
        }
        Collections.sort(M, new Comparator<Monthi>() {
            @Override
            public int compare(Monthi s1, Monthi s2) {
                return s1.getId_subject().compareTo(s2.getId_subject());
            }
        });
        for (Monthi x : M){
            System.out.println(x);
        }
        input.close();
    }
}
