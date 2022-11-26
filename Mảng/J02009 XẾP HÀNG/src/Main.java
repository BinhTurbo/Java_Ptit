import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = Integer.parseInt(input.nextLine());
        int temp = 0;
        ArrayList <Pair<Integer, Integer>> map = new ArrayList<>();
        while (test-- > 0){
            map.add(new Pair<Integer,Integer>(input.nextInt(), input.nextInt()));
        }
        map.sort((a, b) -> a.getA().compareTo(b.getA()));
        for (Pair<Integer, Integer> i : map){
            temp = i.getA() > temp ? i.getA() : temp;
            temp += i.getB();
        }
        System.out.println(temp);
        input.close();
    }
}
