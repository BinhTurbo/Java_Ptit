import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class J07015_SONGUYENTOTRONGFILENHIPHAN {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        ObjectInputStream input = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> ds = (ArrayList<Integer>) input.readObject();
        int[] a = new int[100000];
        for (Integer i : ds) {
            if (J01004_SONGUYENTO.isPrimeNumber(i)) {
                a[i]++;
            }
        }
        for (int i = 0; i < 100000; i++){
            if (a[i] > 0){
                System.out.println(i + " " + a[i]);
            }
        }
    }
}
