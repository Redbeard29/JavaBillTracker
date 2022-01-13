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

        //If there is a difference between total cost of bills and amount entered, calculate and print it
        if(totalEntered != totalBiWeeklyEntry){

            //Calculate difference and print it
            double difference = CalculateDifference.calculateDifference(totalBiWeeklyEntry, totalEntered);

            //Validate number of extra transactions to account for difference
            int numOfTrans = ValidateInputs.validateNumOfTrans();

            System.out.println("You are accounting for the difference of $" + String.format("%.2f", difference) + " with " + numOfTrans + " transactions.");

        }
        else{
            System.out.println("This is exactly the amount that is expected.");
        }

    }

}
