package BillTracker;

import java.util.Arrays;
import java.util.HashMap;

public class BillTally {
    public static HashMap<String, Double> returnBillHashMap(){
        //Bills
        HashMap<String, Double> billItems = new HashMap<String, Double>();
        billItems.put("rent", 1680.00);
        billItems.put("power", 100.00);
        billItems.put("showtime", 10.99);
        billItems.put("wife life insurance", 35.00);
        billItems.put("hbo max", 14.99);
        billItems.put("minol", 85.00);
        billItems.put("cable", 15.40);
        billItems.put("phone", 333.00);
        billItems.put("car", 510.00);
        billItems.put("spotify", 12.99);
        billItems.put("netflix", 13.99);
        billItems.put("state farm", 132.65);
        billItems.put("my life insurance", 134.46);
        billItems.put("gas", 50.00);
        billItems.put("daycare", 1591.00);
        billItems.put("wife student loans", 220.00);
        billItems.put("therapy", 100.00);
        billItems.put("xm radio", 22.08);
        billItems.put("groceries", 500.00);

        return billItems;
    }

    public static String[] returnBillKeys(){
        HashMap<String, Double> billItems = returnBillHashMap();
        String [] billKeys = new String[billItems.size()];
        int x = 0;
        for(String key : billItems.keySet()){
            billKeys[x++] = key;
        }
        return billKeys;
    }

}
