package BillTracker;

import java.util.HashMap;

public class Main {

    public static void main(String[] args){
        double totalBiWeeklyEntry = 1425.00;

        double totalMonthlyPayment = CalculateTotalDue.getTotalMonthlyPayment(totalBiWeeklyEntry);
        HashMap<String, Double> bills = BillTally.returnBillHashMap();
        double totalCostOfBills = CalculateTotalDue.calculateTotalCost(bills);

        System.out.println("Total cost of bills: $" + String.format("%.2f", totalCostOfBills));
        System.out.println("Total being entered: $" + String.format("%.2f", totalMonthlyPayment));

        //Validate dollar amount entered
        System.out.println("How much did you transfer for this two week period?");
        double totalEntered = ValidateInputs.validateTotalEntered();

        //If there is a difference between total cost of bills and amount entered, calculate and print it
        if(totalEntered != totalBiWeeklyEntry){

            //Calculate difference and print it
            double difference = CalculateDifference.calculateDifference(totalBiWeeklyEntry, totalEntered);

            //Validate number of extra transactions to account for difference
            int numOfTrans = ValidateInputs.validateNumOfTrans();
            boolean isValidAdjustment;
            //Store this logic in a method to avoid repetition
            if(totalEntered > totalBiWeeklyEntry){
                isValidAdjustment = AddAdjustments.addAdjustments(numOfTrans, difference);
            }
            else{
                isValidAdjustment = SubtractAdjustments.subtractAdjustments(numOfTrans, difference);
            }
            while(!isValidAdjustment){
                System.out.println("The amount entered does not equal the difference specified. Please re-enter adjustments.");

                //Store this logic in a method to avoid repetition
                if(totalEntered > totalBiWeeklyEntry){
                    isValidAdjustment = AddAdjustments.addAdjustments(numOfTrans, difference);
                }
                else{
                    isValidAdjustment = SubtractAdjustments.subtractAdjustments(numOfTrans, difference);
                }
            }
            System.out.println("The sum of these " + numOfTrans + " extra transactions is $" + String.format("%.2f", difference) + ", which is equal to the difference specified.");
        }
        else{
            System.out.println("This is exactly the amount that is expected.");
        }

    }

}
