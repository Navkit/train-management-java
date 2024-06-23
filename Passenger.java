package TrainManagementSystem;

public class Passenger{
    
    private String name;
    private int age;
    private String ageGroup;
    private double bankBalance;

    public String getName(){
     }
    public String getAgeGroup(){
        return this.ageGroup;
    }
    public int getAge(){
        return this.age;
    }
    public double getBankBalance(){
        return this.bankBalance;
    }

    public void setBankBalance(double balance){
        this.bankBalance = balance;
    }
    public Passenger(){

    }
    public Passenger(String pName, String pAgeGroup, int pAge, double pBankBalance ){
        this.name = pName;
        this.age = pAge;
        this.ageGroup = pAgeGroup;
        this.bankBalance = pBankBalance;

    }

}