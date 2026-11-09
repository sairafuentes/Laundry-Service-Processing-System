
package laundryserviceprocessing;

public class laundryOrder {
 
// Private attributes
    private String transactionID;
    private String customerName;
    private double weight;
    private String serviceType;
    private String status;
    
 // Constructor with Input Validation
    public laundryOrder(String transactionID,
                        String customerName,
                        double weight,
                        String serviceType) {
 // Check Transaction ID
        if (transactionID == null || transactionID.trim().isEmpty()) {
            throw new IllegalArgumentException(
                "Transaction ID cannot be empty.");
        }
   // Check Customer Name
        if (customerName == null || customerName.trim().isEmpty()) {
            throw new IllegalArgumentException(
                "Customer name cannot be empty.");
            

        }       
    }
    }
