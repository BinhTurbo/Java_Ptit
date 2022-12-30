public class Subject {
    private String id;
    private String name;
    private int numberOfCredit;

    public Subject() {
    }

    public Subject(String id, String name, int numberOfCredit) {
        this.id = id;
        this.name = name;
        this.numberOfCredit = numberOfCredit;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfCredit() {
        return numberOfCredit;
    }

    public void setNumberOfCredit(int numberOfCredit) {
        this.numberOfCredit = numberOfCredit;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + numberOfCredit;
    }
}
