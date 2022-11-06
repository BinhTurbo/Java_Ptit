public class Thisinh {
    private String name;
    private String date;
    private double d1,d2,d3,s;
    public Thisinh(){}
    public Thisinh(String name, String date, double d1,double d2,double d3){
        this.name = name;
        this.date = date;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.s = d1 + d2 + d3;
    }
    public String toString(){
        return name + " " + date + " " + String.format("%.1f",(double)s);
    }
}
