import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindTrainAPK {
    public static void main(String[] args) {
        TrainSystem trainSystem = new TrainSystem();

        //adding new station
        Station station1 = new Station("ST1001","Kurla");
        Station station2 = new Station("ST1002","Dadar");

        //adding train
        Train train1 = new Train("TR001","CSMT","Local");
        Train train2 = new Train ("TR002","Parel","AC ");

        //adding platform
        Platform p1 = new Platform(1);
        Platform p2 = new Platform(2);

        p1.setTrain(train1);
        p2.setTrain(train2);

        List<Platform> platformList = new ArrayList<>();
        platformList.add(p1);
        platformList.add(p2);

        station1.setPlatformList(platformList);

        Schedule s1 = new Schedule(train1,station1,"10:00 PM","10:10 PM",p1);
        Schedule s2 = new Schedule(train2,station2,"12:00 PM","12:10 PM",p2);

        trainSystem.addStation(station1);
        trainSystem.addStation(station2);
        trainSystem.addTrain(train1);
        trainSystem.addTrain(train2);
        trainSystem.addSchedule(s1);
        trainSystem.addSchedule(s2);

        //Lets find train between stations
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the source : ");
        String source = sc.nextLine();
        System.out.println(" Enter the Destination : ");
        String destination = sc.nextLine();

        List<Schedule> myTrains = trainSystem.findMyTrain(source,destination);
        System.out.println("Your train between "+source+" and "+destination);
//       Schedule schedule = myTrains.get(0);
//       Train train = schedule.getTrain();
//        System.out.println(train);

        System.out.println(myTrains.get(0));
   }
}
