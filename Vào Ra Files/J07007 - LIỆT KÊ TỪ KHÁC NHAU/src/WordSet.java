import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class WordSet {
    private TreeSet<String> words;
    public WordSet(String file) throws IOException{
        Scanner input = new Scanner(new File(file));
        words = new TreeSet<String>();
        while(input.hasNext()){ 
            words.add(input.next().toLowerCase().trim());
        }
    }
    @Override
    public String toString() {
        return String.join("\n", words);
    }
}
