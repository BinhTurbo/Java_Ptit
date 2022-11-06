public class Phanso {
    private long tu;
    private long mau;
    public Phanso(){}
    public Phanso(long tu, long mau){
        this.tu = tu;
        this.mau = mau;
    }
    private static long gcd(long tu, long mau){
        if (mau == 0) return tu;
        else return gcd(mau, tu % mau);
    }
    public Phanso Toigian(){
        return new Phanso(tu / gcd(tu, mau), mau / gcd(tu, mau));
    }
    public String toString(){
        return tu + "/" + mau;
    }
}
