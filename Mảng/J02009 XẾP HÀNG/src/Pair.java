public class Pair <T, S>{
    private T a;
    private S b;

    public Pair(T a, S b) {
        this.a = a;
        this.b = b;
    }
    public T getA(){
        return this.a;
    }
    public S getB(){
        return this.b;
    }
}
