public class Phanso {
    private long tu;
    private long mau;
    public Phanso(){}
    public Phanso(long tu, long mau){
        this.tu = tu;
        this.mau = mau;
    }
    
    private Phanso Rutgon(){
        long x = tu;
        long y = mau;
        while (y != 0){
            long temp = x;
            x = y;
            y = temp % y;
        }
        return new Phanso(tu / x, mau / x);
    }
    public Phanso add(Phanso f){
        return new Phanso(this.tu * f.mau + this.mau * f.tu, this.mau * f.mau).Rutgon();
    }

    public static Phanso add(Phanso f1, Phanso f2){
        return new Phanso(f1.tu * f2.mau + f1.mau * f2.tu, f1.mau * f2.mau).Rutgon();
    }
    @Override
    public String toString() {
        return tu + "/" + mau;
    }
}
