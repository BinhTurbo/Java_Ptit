public class Staff {
    private String id, name, position;
    private int basicsalary, dailysalary, workdays, allowance, bonus;
    public Staff(){}
    public Staff(String name, int dailysalary, int workdays, String position){
        this.id = "NV01";
        this.name = name;
        this.dailysalary = dailysalary;
        this.workdays = workdays;
        this.position = position;
        this.basicsalary = (int) this.dailysalary * this.workdays;
        if (this.workdays >= 25) this.bonus = (int) (this.basicsalary * 0.2);
        else if (this.workdays >= 22) this.bonus = (int) (this.basicsalary * 0.1);
        else this.bonus = 0;
        if (this.position.equals("GD")) this.allowance = 250000;
        else if (this.position.equals("PGD")) this.allowance = 200000;
        else if (this.position.equals("TP")) this.allowance = 180000;
        else if (this.position.equals("NV")) this.allowance = 150000;
    }
    private int getTotalSalary(){
        return this.basicsalary + this.bonus + this.allowance;
    }
    public String toString(){
        return this.id + " " + this.name + " " + this.basicsalary + " " + this.bonus + " " + this.allowance + " " + getTotalSalary();
    }
}
