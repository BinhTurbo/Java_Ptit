import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.*;;
//CopyFileBinary

public class Example {
    public static void main(String[] args) throws IOException {
        FileInputStream input = new FileInputStream("DANHSACH.pdf");
        FileOutputStream output = new FileOutputStream("DANHSACH2.pdf");
        int x = 0;
        while (true){
            x = input.read();
            if (x == -1) break;
            output.write(x);
        }
        output.close();
        input.close();
    }
}
