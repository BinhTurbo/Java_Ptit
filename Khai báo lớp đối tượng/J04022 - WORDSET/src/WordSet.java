import java.util.TreeSet;

public class WordSet {
    private TreeSet<String> words;

    public WordSet(String s) {
        words = new TreeSet<String>();
        String[] temp = s.toLowerCase().split("\\s+");
        for (int i = 0; i < temp.length; i++) {
            words.add(temp[i]);
        }
    }
    public WordSet(TreeSet<String> words) {
        this.words = words;
    }
    // public TreeSet<String> getWords() {
    //     return words;
    // }
    public void setWords(TreeSet<String> words) {
        this.words = words;
    }
    public WordSet union(WordSet other) {
        TreeSet<String> t = new TreeSet<String>();
        t.addAll(words);
        t.addAll(other.words);
        return new WordSet(t);
    }
    public WordSet intersection(WordSet other) {
        TreeSet<String> t = new TreeSet<String>();
        for (String s : words) {
            if (other.words.contains(s)) {
                t.add(s);
            }
        }
        return new WordSet(t);
    }
    public String toString(){
        return String.join(" ", words);
    }
}

