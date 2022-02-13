package BillTracker;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class SubtractAdjustments {

    public static Scanner scanner = new Scanner(System.in);

    public static boolean subtractAdjustments(int numOfTrans, double difference){
        double sumOfTrans = 0.00;
        for(int x = 0; x < numOfTrans; x++){
            System.out.println("Transaction " + (x + 1) + ": Which bill would you like to subtract from?");
            String reason = scanner.nextLine();

            System.out.println("How much?");
            double cost = ValidateInputs.validateTotalEntered();

            System.out.println("You entered $" + String.format("%.2f", cost) + " for " + reason);

            boolean addNotes = ValidateInputs.validateNotes();
            if(addNotes){
                System.out.println("Notes for $" + String.format("%.2f", cost) + " " + reason + ":");
                String notes = scanner.nextLine();
                System.out.println("\"" + notes + "\""  + " stored as notes for " + reason);
            }
            replaceBillValues();
            sumOfTrans += cost;
        }
        boolean hasValidAdjustmentSum = ValidateAdjustments.validateAdjustments(sumOfTrans, difference);
        return hasValidAdjustmentSum;
    }

    public static HashMap<String, Double> replaceBillValues(){
        //This method should accept the original Hashmap, then allow the user to change whatever values need to be changed
        //and pass the updated Hashmap into a temporary Hashmap in the main method.
        String [] billKeys = BillTally.returnBillKeys();
        System.out.println(Arrays.toString(billKeys));

        return new HashMap<String, Double>();
    }

}
