package BillTracker;

import java.util.Scanner;

public class ValidateInputs {

    public static Scanner scanner = new Scanner(System.in);

    public static double validateTotalEntered(){
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
        System.out.println("How many transactions would you like to include to account for the difference?");

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

    public static boolean validateNotes(){
        System.out.println("Enter associated notes? Y/N");

        char noteResponse = scanner.next().charAt(0);
        while(!(Character.toUpperCase(noteResponse) == 'Y' || Character.toUpperCase(noteResponse) == 'N')){
            System.out.println("That input is invalid. Please enter Y or N.");
            noteResponse = scanner.next().charAt(0);
        }

        if(Character.toUpperCase(noteResponse) == 'Y'){
            return true;
        }

        return false;
    }
}
