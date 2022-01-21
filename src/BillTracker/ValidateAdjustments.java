package BillTracker;

public class ValidateAdjustments {
    /* Method to verify that the amount entered for adjustments is equal to the difference between the amount entered for the
    two-week period and the amount expected to be entered for the two-week period. */
    public static boolean validateAdjustments(double sumOfExtraTrans, double difference){
        if(sumOfExtraTrans != difference){
            return false;
        }
        return true;
    }

}
