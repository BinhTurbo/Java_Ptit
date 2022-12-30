
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class J05003_DanhSachSinhVien {
    private String ma,hoTen;
    private Date ngaySinh;
    private String lop;
    private Float gpa;

    public J05003_DanhSachSinhVien(int ma, String hoTen, String lop, String ngaySinh, Float gpa) throws ParseException {
        this.ma = "B20DCCN"+String.format("%03d",ma);
        this.hoTen = hoTen;
        this.ngaySinh = new SimpleDateFormat("dd/mm/yyyy").parse(ngaySinh);
        this.lop = lop;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return ma +" "+hoTen+" "+lop+" "+new SimpleDateFormat("dd/mm/yyyy").format(ngaySinh)+" "+String.format("%.2f",gpa);
    }

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<J05003_DanhSachSinhVien> list = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for(int i = 1;i<=n;i++){
            J05003_DanhSachSinhVien s = new J05003_DanhSachSinhVien(i, scanner.nextLine(), scanner.nextLine(), scanner.nextLine(),Float.parseFloat(scanner.nextLine()));
            list.add(s);
        }
        for(J05003_DanhSachSinhVien i : list){
            System.out.println(i.toString());
        }
    }
}