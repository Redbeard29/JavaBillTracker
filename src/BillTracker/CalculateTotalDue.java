package BillTracker;

import java.util.HashMap;
import java.util.Map;

public class CalculateTotalDue {

    public static double getTotalMonthlyPayment(double totalBiWeeklyEntry){
        double totalMonthlyBills = totalBiWeeklyEntry * 4;
        return totalMonthlyBills;
    }

    public static double calculateTotalCost(HashMap<String, Double> bills){
        double totalCostOfBills = 0;

        for(Map.Entry<String, Double> entry : bills.entrySet()){
            totalCostOfBills += entry.getValue();
        }

        return totalCostOfBills;
    }

}
