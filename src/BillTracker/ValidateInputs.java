package BillTracker;

import java.util.Scanner;

public class ValidateInputs {

    public static Scanner scanner = new Scanner(System.in);

    public static double validateTotalEntered(){
        System.out.println("How much did you transfer for this two week period?");

        double totalEntered;
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

        return totalEntered;
    }

    public static int validateNumOfTrans(){
        System.out.println("How many extra transactions would you like to account for?");

        int numOfTrans;
        boolean firstTime = true;

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

        return numOfTrans;
    }
}
