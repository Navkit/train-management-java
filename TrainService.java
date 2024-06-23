package TrainManagementSystem;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class TrainService {
        public static List<Station> stationList = new ArrayList<>();
        public static List<Train> trainList = new ArrayList<>();
      static{
        stationList.add(new Station("qwe","poi", Date.valueOf("2023-07-01"), "abc", 200));
        stationList.add(new Station("qwe","poi", Date.valueOf("2023-07-01"), "abc1", 100));
        stationList.add(new Station("asd","lkj",Date.valueOf("2023-07-02"),"xyz", 300));
        stationList.add(new Station("zxc", "mnb", Date.valueOf("2023-05-22"), "lkd", 100));
    }
    static{
        trainList.add(0, new Train("abc",12,"superfast"));
        trainList.add(new Train("abc1",12,"superfast"));
        trainList.add(new Train("xyz",13,"intercity"));
        trainList.add(new Train("lkd", 0, "passanger"));
        trainList.add(new Train("asd", 14, "xpress"));
        }

    public void searchBySrcDest(String tSource,String tDest){
        int i=0;
        System.out.println("Train Name      Source      Destination         Train Timing        Rate        Train Number        Train Type");
        for (Station sLocation : stationList) {
            if(tSource.equals(sLocation.getSource()) && tDest.equals(sLocation.getdestination()) ){
                i=1;
                System.out.print(sLocation  + "     ");
                for (Train tdetails : trainList) {
                    if(tdetails.getTName().equals(sLocation.gettrainName())){
                        i=1;
                        System.out.println(tdetails.getTNo() + "        " + tdetails.getTType());
                    }
                }
            }       
            
        }
           if(i==0){
                System.out.println("Given source and destination are not correct, try changing the source or destination");
            }

    }


    public void showAllTrains(){
         System.out.println("Train Name      Source      Destination         Train Timing        Rate");
           
        for (Station station : stationList) {
             System.out.println(station);
        }
    }

    public void  searchByName(String trainName){
        // for(int i=0;i<stationList.size();i++)
        // {
        //     if(trainName.equals(stationList.get(i).gettrainName())){
        //         System.out.println(stationList.get(i));
        //     }
        // }
        int i=0;
         System.out.println("Train Name      Source      Destination         Train Timing        Rate");
               
        for(Station sName : stationList){
            
            if(trainName.equals(sName.gettrainName())){
                i=1;
                 System.out.println(sName);
            }
        }
        if(i==0){
            System.out.println("No Train found for given name");
        }
        
    }

    
}
