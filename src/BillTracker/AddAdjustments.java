package BillTracker;

import java.util.Scanner;

public class AddAdjustments {

    public static Scanner scanner = new Scanner(System.in);

    public static double addAdjustments(int numOfTrans){
        double sumOfTrans = 0.00;
        for(int x = 0; x < numOfTrans; x++){
            System.out.println("Transaction " + (x + 1) + ":");
            String reason = scanner.nextLine();
            System.out.println("How much?");
            double cost = ValidateInputs.validateTotalEntered();
            System.out.println("You entered $" + String.format("%.2f", cost) + " for " + reason);
            sumOfTrans += cost;
        }
        return sumOfTrans;
    }
}
