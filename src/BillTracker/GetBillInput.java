package BillTracker;

import java.util.Scanner;

public class GetBillInput {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        //Validate dollar amount
        double totalEntered;
        System.out.println("How much did you transfer for this two week period?");
        boolean firstTime = true;
        do{
            if(!firstTime) {
                System.out.println("Please enter a positive number.");
            }
            while(!scanner.hasNextDouble()){
                System.out.println("That is not a valid input. You must enter a number.");
                scanner.next();
            }
            totalEntered = scanner.nextDouble();
            firstTime = false;
        }while (totalEntered < 0.00);

        //Validate number of extra transactions
        System.out.println("How many extra transactions would you like to account for?");
        int numOfTrans;
        firstTime = true;
        do{
            if(!firstTime) {
                System.out.println("Please enter a positive number.");
            }
            while(!scanner.hasNextInt()){
                System.out.println("That is not a valid input. You must enter a whole number.");
                scanner.next();
            }
            numOfTrans = scanner.nextInt();
            firstTime = false;
        }while (numOfTrans < 0);

        System.out.println("You entered $" + String.format("%.2f", totalEntered) + " for " + numOfTrans + " extra transactions.");
    }

}
