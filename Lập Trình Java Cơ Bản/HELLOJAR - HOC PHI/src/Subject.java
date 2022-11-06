public class Subject {
    private String code_subject;
    private String name_subject;
    private long number_of_credits;

    public Subject(String code_subject, String name_subject, long number_of_credits) {
        this.code_subject = code_subject;
        this.name_subject = name_subject;
        this.number_of_credits = number_of_credits;
    }
    public String getName(){
        return name_subject;
    }
    public long getNumberofcredits(){
        return number_of_credits;
    }
    public String getCode(){
        return code_subject;
    }
}
