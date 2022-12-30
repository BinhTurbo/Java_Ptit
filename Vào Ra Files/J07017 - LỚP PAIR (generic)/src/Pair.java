public class Pair<T,S> {
    private T first;
    private S second;
    public Pair(T firstElement, S secondElement) {
        first = firstElement;
        second = secondElement;
    }
    public T getFist() {
        return first;
    }
    public S getSecond() {
        return second;
    }
    private boolean isPrime(int n) {
        for (int i = 2; i * i <= n; i++)
            if (n % i == 0)
                return false;
        return n > 1;
    }
    boolean isPrime() {
        return isPrime((Integer) first) && isPrime((Integer) second);
    }
    @Override
    public String toString() {
        return first + " " + second;
    }
}
