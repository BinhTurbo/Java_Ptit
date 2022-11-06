import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        ObjectInputStream input = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> ds = (ArrayList<Integer>) input.readObject();
        int[] a = new int[100000];
        for (Integer i : ds) {
            if (isPrime(i)) {
                a[i]++;
            }
        }
        for (int i = 0; i < 100000; i++){
            if (a[i] > 0){
                System.out.println(i + " " + a[i]);
            }
        }
        input.close();
    }
    public static boolean isPrime(int n) {
        if(n == 2 || n == 3) return true;
        if(n < 5 || n%2 == 0 || n%3 == 0) return false;
        for (int i = 5; i <= Math.sqrt(n); i++)
            if(n%i == 0 || n%(i+2) == 0) return false;
        return true;
    }
}