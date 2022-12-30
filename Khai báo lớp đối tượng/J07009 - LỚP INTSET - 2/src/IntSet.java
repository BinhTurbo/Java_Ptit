import java.util.TreeSet;

public class IntSet {
    private TreeSet<Integer> intTree;
    public IntSet(int[] a) {
        intTree = new TreeSet<Integer>();
        for (int i = 0; i < a.length; i++) {
            intTree.add(a[i]);
        }
    }
    public IntSet(TreeSet<Integer> intTree) {
        this.intTree = intTree;
    }
    public void setintTree(TreeSet<Integer> intTree) {
        this.intTree = intTree;
    }
    public IntSet intersection(IntSet other){
        TreeSet<Integer> temp = new TreeSet<Integer>();
        for (Integer i : intTree) {
            if (other.intTree.contains(i)) {
                temp.add(i);
            }
        }
        return new IntSet(temp);
    }
    public String toString(){
        String tmp = "";
        for (Integer i : intTree) {
            tmp += i + " ";
        }
        return tmp;
    }
}
