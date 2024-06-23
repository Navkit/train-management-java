package TrainManagementSystem;

import java.util.List;

public class TicketService {
    
    public void bookTicket(Passenger passenger, String trainName, String from, String to, List<Station> stations,List<Train>trains){
        int trainNumber=0;
        String trainType="";
        int i=0;
          System.out.println(" Passenger Name     PNR Number      Train Number      Train Type        From        To      Rate        Seat No");
                   
        for ( Station station : stations) {
            if(from.equals(station.getSource()) && to.equals(station.getdestination()) && trainName.equals(station.gettrainName())){
                i=1;
                if(passenger.getBankBalance() >= station.getTRate()){
                    for (Train train : trains) {
                        if(trainName.equals(train.getTName())){
                            trainNumber = train.getTNo();
                            trainType= train.getTType();
                        }
                    }
                    passenger.setBankBalance(passenger.getBankBalance()-station.getTRate());
                    Ticket ticket = new Ticket(1234567890, passenger.getName(), trainNumber, station.getTRate(), trainType, from, to, 55);

                   System.out.println(ticket);
                   System.out.println("successfully booked your ticket with details given below");
                    System.out.println("Balance remaining is : " + passenger.getBankBalance());
                }
                else{
                    i=2;
                }
                
            }
        }
        if(i==0){
                System.out.println("no trains found for the given source and destination for the given train name. Try with some other details ");      
        }else if(i==2){
                System.out.println("Booking unsuccessfull due to insufficient Balance, add more balance to continue");
        }
        
    }
}
