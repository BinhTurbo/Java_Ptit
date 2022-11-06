public class Rule {
    private String coderule;
    private String namerule;
    private double creditprice;
    public Rule(){}
    public Rule(String coderule, String namerule, double creditprice){
        this.coderule = coderule;
        this.namerule = namerule;
        this.creditprice = creditprice;
    }
    public String getCode(){
        return coderule;
    }
    public double getCreditPrice(){
        return creditprice;
    }
    public String getName() {
        return namerule;
    }
}
