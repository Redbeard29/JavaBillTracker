package BillTracker;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args){
        double totalBiWeeklyEntry = 1425.00;

        double totalMonthlyBills = CalculateTotalDue.getTotalMonthlyPayment(totalBiWeeklyEntry);
        double totalCostOfBills = CalculateTotalDue.calculateTotalCost();

        System.out.println("Total cost of bills: $" + String.format("%.2f", totalCostOfBills));
        System.out.println("Total being entered: $" + String.format("%.2f", totalMonthlyBills));

        //Validate dollar amount entered
        double totalEntered = ValidateInputs.validateTotalEntered();

        //Validate number of extra transactions
        int numOfTrans = ValidateInputs.validateNumOfTrans();

        //Calculate difference between total cost of bills and amount entered
        double difference = CalculateDifference.calculateDifference(totalBiWeeklyEntry, totalEntered);

        System.out.println("You entered $" + String.format("%.2f", totalEntered) + ", which is a difference of $" + String.format("%.2f", difference) + " for " + numOfTrans + " extra transactions.");
    }

}
