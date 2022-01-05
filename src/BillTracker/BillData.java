package BillTracker;

import java.util.HashMap;

public class BillData {

    public static void main(String[] args){
        double totalBiWeeklyEntry = 1425.00;
        HashMap<String, Double> billItems = new HashMap<String, Double>();
        billItems.put("rent", 1680.00);
        System.out.println(billItems);
    }

}
