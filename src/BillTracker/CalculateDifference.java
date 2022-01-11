package BillTracker;

public class CalculateDifference {

    public static double calculateDifference(double totalBiWeeklyEntry, double totalEntered){
        double difference;
        if(totalEntered > totalBiWeeklyEntry)
            difference = totalEntered - totalBiWeeklyEntry;
        else
            difference = totalBiWeeklyEntry - totalEntered;
        return difference;
    }

}
