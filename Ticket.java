package TrainManagementSystem;

public class Ticket {
    
    private double rate;
    private String pName;
    private int seatNo;
    private String trainType;
    private int pnr;
    private String from;
    private String to;
    private int trainNo;

    public Ticket(){

    }
    public Ticket(int pnr, String pName , int trainNo, double rate, String  trainType, String from, String to, int seatNo){
        this.from= from;
        this.pName =pName;
        this.pnr= pnr;
        this.rate= rate;
        this.seatNo = seatNo;
        this.to = to;
        this.trainNo = trainNo;
        this.trainType  = trainType;
    }
    public String getPName()
    {
        return this.pName;
    }
    public String getfrom()
    {
        return this.from;
    }
    public String getto()
    {
        return this.to;
    }
    public String getTrainType()
    {
        return this.trainType;
    }
    public double getRate(){
        return this.rate;
    
    }
    public int getTrainNo(){
        return this.trainNo;
    }
    public int getPnr(){
        return this.pnr;
    }
    public int getSeatNo(){
        return this.seatNo;
    }
    @Override
    public String toString(){
        return this.pName + "       " + this.pnr + "        " + this.trainNo + "        " + this.trainType + "      " + this.from + "       " +  this.to + "        " + this.rate + "       " +  this.seatNo;
    }
}
