import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Sinhvien {
    private String id;
    private String name;
    private String cls;
    private Date date;
    private double gpa;
    public Sinhvien(int id, String name, String cls, String date, double gpa) throws ParseException {
        this.id = String.format("B20DCCN%03d", id);
        this.name = name;
        this.cls = cls;
        this.date = new SimpleDateFormat("dd/MM/yyyy").parse(date);
        this.gpa = gpa;
    }
    public String toString() {
        return id + " " + name + " " + cls + " " + new SimpleDateFormat("dd/MM/yyyy").format(date) + " " + String.format("%.2f", gpa);
    }
}