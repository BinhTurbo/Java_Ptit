import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.*;
import java.util.*;
public class Sinhvien {
    private String id;
    private String name;
    private String cls;
    private Date date;
    private double gpa;
    public Sinhvien(){
        id = "";
        name = "";
        cls = "";
        gpa = 0;
    }
    public Sinhvien(String name, String cls, String date, double gpa) throws ParseException{
        this.id = "B20DCCN001";
        this.name = name;
        this.cls = cls;
        this.date = new SimpleDateFormat("dd/MM/yyyy").parse(date);
        this.gpa = gpa;
    }
    public String toString(){
        return id + " " + name + " " + cls + " " + new SimpleDateFormat("dd/MM/yyyy").format(date) + " " + String.format("%.2f",gpa);
    }
}
