import java.util.ArrayList;
import java.util.Scanner;
 
 public class SearchTrain_Main {
  public static void main(String[] args) {
   Scanner s = new Scanner(System.in);
   // fill your code here
 
   System.out.println(" source");
   String source = s.next();
 
   System.out.println("destination");
   String destination = s.next();
 
   System.out.println("coach type");
   String coachType = s.next();
   s.close();
 
   if (coachType=="ac1" || coachType=="ac2" || coachType=="ac3" || coachType=="seater" || coachType=="sleeper") {
 
    SearchTrain_Management manage = new SearchTrain_Management();
    ArrayList<SearchTrain_Train> trainList = manage.viewTrain(coachType, source, destination);
 
    if (trainList.isEmpty()) {
     System.out.println("No trains found");
     return;
    }
 
    for (SearchTrain_Train train : trainList) {
     System.out.println(train.getTrainNumber() + " " + train.getTrainName());
    }
    return;
   }
   System.out.println("Invalid Coach Type");
  }
 }