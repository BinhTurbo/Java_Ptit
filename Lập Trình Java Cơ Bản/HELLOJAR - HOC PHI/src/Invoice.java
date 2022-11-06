import java.util.ArrayList;
public class Invoice {
    private Student st;
    private ArrayList<Subject> lsb;
    private Rule rl;

    public Invoice(Student st, ArrayList<Subject> lsb, Rule rl) {
        this.st = st;
        this.lsb = lsb;
        this.rl = rl;
    }
    public Student getSt(){
        return st;
    }
    public ArrayList<Subject> getAlSubject(){
        return lsb;
    }
    public double getAmount(){
        double sum_number_of_credits = 0;
        for (Subject sb : lsb){
            sum_number_of_credits += sb.getNumberofcredits();
        }
        return rl.getCreditPrice() * sum_number_of_credits;
    }
    public Rule getRule(){
        return rl;
    }
}
