import java.util.ArrayList;
import java.util.Scanner;

public class PaymentController {
    private Scanner input = new Scanner(System.in);
    public PaymentController(){}
    public Invoice getInvoice(){
        Student st = new Student(input.nextLine(), input.nextLine());
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Subject> allSubject = new ArrayList<>();
        for (int i = 0; i < n; i++){
            allSubject.add(new Subject(input.nextLine(), input.nextLine(), Integer.parseInt(input.nextLine())));
        }
        Rule rule = new Rule(input.nextLine(), input.nextLine(), Double.parseDouble(input.nextLine()));
        return new Invoice(st, allSubject, rule);
    }
}
