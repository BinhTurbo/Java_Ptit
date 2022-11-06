import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Nhanvien {
    private String id;
    private String name;
    private String gioitinh;
    private Date date;
    private String adress;
    private String mathue;
    private Date dateline;
    public Nhanvien(){}
    public Nhanvien(String name, String gioitinh, String date, String adress, String mathue, String dateline) throws ParseException{
        this.id = "00001";
        this.name = name;
        this.gioitinh = gioitinh;
        this.date = new SimpleDateFormat("dd/MM/yyyy").parse(date);
        this.adress = adress;
        this.mathue = mathue;
        this.dateline = new SimpleDateFormat("dd/MM/yyyy").parse(dateline);
    }
    public String toString(){
        return id + " " + name + " " + gioitinh + " " + new SimpleDateFormat("dd/MM/yyyy").format(date) + " " + adress + " " + mathue + " " + new SimpleDateFormat("dd/MM/yyyy").format(dateline);
    }
}
