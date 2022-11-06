import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class J07005_SOKHACNHAUTRONGFILE_2 {
    public static void main(String[] args) throws IOException{
        DataInputStream input = new DataInputStream(new FileInputStream("DATA.IN"));
        int[] a =new int[1001];
        for (int i = 0; i < 100000; i++){
            a[input.readInt()]++;
        }
        for (int i = 0; i < 1000; i++){
            if (a[i] > 0){
                System.out.println(i + " " + a[i]);;
            }
        }
        input.close();
    }
}
