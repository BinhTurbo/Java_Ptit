import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class J05081 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<MatHangJ05081> list = new ArrayList<>();
        int m;
        m = scanner.nextInt();
        scanner.nextLine();
        for (int i = 1;i<=m;i++){
            String maMH = "MH" + String.format("%03d", i);
            String tenMH = scanner.nextLine();
            String donViTinh = scanner.nextLine();
            String giaMua = scanner.nextLine();
            String giaBan = scanner.nextLine();

            MatHangJ05081 matHangJ05081 = new MatHangJ05081(maMH, tenMH, donViTinh, Integer.parseInt(giaMua), Integer.parseInt(giaBan));
            list.add(matHangJ05081);
        }
        list.sort(new Comparator<MatHangJ05081>() {
            @Override
            public int compare(MatHangJ05081 o1, MatHangJ05081 o2) {
                return o1.compareTo(o2);
            }
        });

        for (MatHangJ05081 matHangJ05081: list) {
            System.out.println(matHangJ05081);
        }

    }
}

class MatHangJ05081{
    private String maMH;
    private String tenMH;
    private String donViTinh;

    private int loiNhuan;
    private int giaMua;
    private int giaBan;

    public MatHangJ05081(String maMH, String tenMH, String donViTinh, int giaMua, int giaBan) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.donViTinh = donViTinh;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
        this.loiNhuan = giaBan - giaMua;
    }
    public int compareTo(MatHangJ05081 matHangJ05081) {
        return -(this.loiNhuan - matHangJ05081.loiNhuan);
    }


    @Override
    public String toString(){
        return maMH + " " + tenMH + " " + donViTinh + " " +giaMua + " " + giaBan + " " + loiNhuan + " ";
    }
}