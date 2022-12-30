import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.math.BigInteger;

public class J07003_Tach_Doi_Va_Tinh_Tong {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("DATA.in");
        Scanner input = new Scanner(file);
        String line = input.nextLine();
        while (line.length() > 1){
            String a = line.substring(0, line.length() / 2);
            String b = line.substring(line.length() / 2);
            BigInteger x = new BigInteger(a);
            BigInteger y = new BigInteger(b);
            BigInteger z = x.add(y);
            System.out.println(z);
            line = z.toString();
        }
        input.close();
    }
}
