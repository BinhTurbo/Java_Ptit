public class Student {
    private String code;
    private String name;
    public Student() {}
    public Student(String code, String name) {
        this.code = code;
        this.name = name;    
    } 
    public String getCode(){
        return code;
    }
    public String getName(){
        return name;
    }
}
