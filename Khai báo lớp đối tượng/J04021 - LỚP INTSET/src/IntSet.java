import java.util.TreeSet;

public class IntSet {
    private TreeSet<Integer> M;
    public IntSet(int[] a) {
        this.M = new TreeSet<Integer>();
        for (int i = 0; i < a.length; i++) {
            this.M.add(a[i]);
        }
    }
    public IntSet(TreeSet<Integer> M) {
        this.M = M;
    }
    public TreeSet<Integer> getM() {
        return this.M;
    }
    public void setM(TreeSet<Integer> M) {
        this.M = M;
    }
    public IntSet union(IntSet b) {
        TreeSet<Integer> temp = new TreeSet<Integer>();
        temp.addAll(M);
        temp.addAll(b.getM());
        return new IntSet(temp);
    }
    public String toString() {
        String temp = "";
        for (Integer i : M) {
            temp += i + " ";
        }
        return temp;
    }
}
