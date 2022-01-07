package BillTracker;

import java.util.Scanner;

public class GetBillInput {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        double totalEntered;
        System.out.println("How much did you transfer for this two week period?");
        do{
            while(!scanner.hasNextDouble()){
                System.out.println("That is not a valid input. You must enter a number.");
                scanner.next();
            }
            totalEntered = scanner.nextDouble();
        }while (totalEntered <= 0.00);
        System.out.println("You entered: $" + String.format("%.2f", totalEntered));
    }

}
