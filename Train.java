package TrainManagementSystem;


public class Train {
    
    private String name;
    private int number;
    private String type;

    public Train(){

    }
    public Train(String tname, int tno,String tType){
        this.name = tname;
        this.number = tno;
        this.type = tType;

    }
    public String getTName(){
     return this.name;
    }
    public int getTNo(){
        return this.number;
    }
    public String getTType()
    {
        return this.type;
    }
}