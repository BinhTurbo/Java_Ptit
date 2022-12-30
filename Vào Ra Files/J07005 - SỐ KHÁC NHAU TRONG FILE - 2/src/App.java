import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        DataInputStream input = new DataInputStream(new FileInputStream("DATA.IN"));
        int[] A = new int[1001];
        for (int i = 0; i < 100000; i++) {
            A[input.readInt()]++;
        }
        for (int i = 0; i <= 1000; i++) {
            if (A[i] > 0) {
                System.out.println(i + " " + A[i]);
            }
        }
        input.close();
    }
}
