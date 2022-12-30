import java.text.DecimalFormat;

public class Student {
    private String id, name;
    private double maths, physics, chemistry, priority;
    public Student(String id, String name, double maths, double physics, double chemistry){
        this.id = id;
        this.name = name;
        this.maths = maths;
        this.physics = physics;
        this.chemistry = chemistry;

        String s = this.id.substring(2, 3);
        if (s.equals("1")) this.priority = 0.5;
        else if (s.equals("2")) this.priority = 1;
        else if (s.equals("3")) this.priority = 2.5;
    }
    private String checkScores(){
        double score = this.maths * 2 + this.physics + this.chemistry + this.priority;
        if (score >= 24) return "TRUNG TUYEN";
        else return "TRUOT";
    }
    public String toString(){
        return this.id + " " + this.name + " " + new DecimalFormat("0.#").format(this.priority) + " " + new DecimalFormat("0.#").format((this.maths * 2 + this.physics + this.chemistry)) + " " + checkScores();
    }
}
