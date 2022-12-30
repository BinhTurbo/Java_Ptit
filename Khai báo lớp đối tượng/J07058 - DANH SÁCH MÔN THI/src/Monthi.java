public class Monthi {
    private String id_subject;
    private String name_subject;
    private String form_subject;
    public Monthi(){}
    public Monthi(String id_subject, String name_subject, String form_subject){
        this.id_subject = id_subject;
        this.name_subject = name_subject;
        this.form_subject = form_subject;
    }
    public String getId_subject() {
        return this.id_subject;
    }
    public String toString(){
        return id_subject + " " + name_subject + " " + form_subject;
    }
}
