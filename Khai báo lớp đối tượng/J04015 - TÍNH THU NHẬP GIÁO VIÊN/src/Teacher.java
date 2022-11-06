public class Teacher {
    private String id;
    private String name;
    private long basicsalary;
    private String cv;
    private int hs;
    private long pc;

    public Teacher(){}
    
    public Teacher(String id, String name, long basicsalary){
        this.id = id;
        this.cv = id.substring(0, 2);
        switch (this.cv){
            case "HT":
                this.pc = 2000000;
                break;
            case "HP":
                this.pc = 900000;
                break;
            case "GV":
                this.pc = 500000;
                break;
            default: this.pc = 0;
        }
        this.hs = Integer.parseInt(id.substring(2));
        this.name = name;
        this.basicsalary = basicsalary;
    }
    public String toString(){
        return id + " " + name + " " + hs + " " + pc + " " + (basicsalary * hs + pc);
    }
}
