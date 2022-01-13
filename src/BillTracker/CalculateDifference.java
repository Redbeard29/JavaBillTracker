package BillTracker;

public class CalculateDifference {

    public static double calculateDifference(double totalBiWeeklyEntry, double totalEntered){
        double difference;
        if(totalEntered > totalBiWeeklyEntry){
            difference = totalEntered - totalBiWeeklyEntry;
            System.out.print("You have entered $" + String.format("%.2f", totalEntered) + ", which is $" + String.format("%.2f", difference) + " more than expected. ");
        }
        else{
            difference = totalBiWeeklyEntry - totalEntered;
            System.out.print("You have entered $" + String.format("%.2f", totalEntered) + ", which is $" + String.format("%.2f", difference) + " less than expected. ");
        }
        return difference;
    }

}
