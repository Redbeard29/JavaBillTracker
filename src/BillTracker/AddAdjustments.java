package BillTracker;

import java.util.Scanner;

public class AddAdjustments {

    public static Scanner scanner = new Scanner(System.in);

    public static boolean addAdjustments(int numOfTrans, double difference){
        double sumOfTrans = 0.00;
        for(int x = 0; x < numOfTrans; x++){
            System.out.println("Transaction " + (x + 1) + ":");
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
            sumOfTrans += cost;
        }
        boolean hasValidAdjustmentSum = ValidateAdjustments.validateAdjustments(sumOfTrans, difference);
        return hasValidAdjustmentSum;
    }
}
