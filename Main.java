package TrainManagementSystem;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main (String arg[])
    {   
        System.out.println("################################  TRAIN MANAGEMENT SYSTEM ###################################################");
        System.out.println();
          System.out.println("Hello User, Welcome to Our Platfrom !!!");
          System.out.println();
       
    int enterInput = -1;
    String cont = "yes";
    while(cont.equalsIgnoreCase("yes")) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 0 to Search Train by Name");
        System.out.println("Enter 1 to Search Train by source and destination ");
        System.out.println("Enter 2 to show all  train details");
        System.out.println("Enter 3 to book ticket");
        enterInput = scanner.nextInt();
         TrainService trainService = new TrainService();
        switch (enterInput) {
            case 0:
                 System.out.println("--------------------------------------------");
                 System.out.println("   Enter the TrainName: ");
                 String trainNameInput = scanner.next();
                 System.out.println("           Searching ....");
                 trainService.searchByName(trainNameInput);
                break;
            case 1:
                 System.out.println("--------------------------------------------");
                 System.out.println("   Enter Source: ");
                 String source = scanner.next();
                 System.out.println("   Enter Destination: ");
                 String destination = scanner.next();
                 System.out.println("           Searching ....");
                 trainService.searchBySrcDest(source,destination);
                 break;

            case 2:
                System.out.println("--------------------------------------------");
                TrainService trainservice = new TrainService();
                System.out.println("           Getting all the trains list ready for you ....");
                trainservice.showAllTrains();
                break;

            case 3:
             System.out.println("---------------   WELCOME TO TICKET BOOKING -----------------------------");
                System.out.println("    Enter your Name");
                String passengerName = scanner.next();
                 System.out.println("   Enter your age: ");
                 int passengerAge = scanner.nextInt();
                 System.out.println("   Enter your age group (adult, child, aged): ");
                 String ageGroup = scanner.next();
                 System.out.println("   Enter your Bank Balance: ");
                 double balance = scanner.nextDouble();
                 Passenger passenger = new Passenger(passengerName, ageGroup, passengerAge, balance);
              
                 System.out.println("   Enter the TrainName: ");
                 String trainName = scanner.next();

                 System.out.println("   Enter Source: ");
                 String from = scanner.next();
                 System.out.println("   Enter Destination: ");
                 String destination1 = scanner.next();
                 
                 TicketService ticketService = new TicketService();
                 System.out.println("          Ticket booking in progress, you are almost there. PLease wait ....");
                ticketService.bookTicket(passenger, trainName, from, destination1, trainService.stationList , trainService.trainList);
                break;
                case 5:
                break;
            default:
            System.out.println("enterrno");
                break; 
    }

    System.out.println();
    System.out.println("Enter Yes if you want to conitnue and No to stop.....: ");
    System.out.println();
     cont = scanner.next();
    
    } 
       
}  
    
}

