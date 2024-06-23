package TrainManagementSystem;

import java.sql.Date;

public class Station {

    private String source;
    private String destination;
    private Date trainTiming;
    private String trainName;
    private double rate; 

    public Station(){

    }
    public Station(String tSource, String tDestination, Date trTiming,String tName, double tRate){
        this.source = tSource;
        this.destination = tDestination;
        this.trainTiming = trTiming;
        this.trainName = tName;
        this.rate = tRate;


    }

    public String getSource(){
        return this.source;
    }
     public String getdestination(){
        return this.destination;
    }
     public Date gettrainTiming(){
        return this.trainTiming;
    }
     public String gettrainName(){
        return this.trainName;
    }
    public double getTRate(){
        return this.rate;
    }
    
    @Override
    public String toString() {
        return this.trainName + "       " + this.source + "        " + this.destination + "        " + this.trainTiming + "        " + this.rate;
    }
}
