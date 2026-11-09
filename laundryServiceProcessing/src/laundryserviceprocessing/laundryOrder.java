
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
         // Check Weight
        if (weight <= 0 || Double.isNaN(weight)
                || Double.isInfinite(weight)) {
            throw new IllegalArgumentException(
                "Weight must be greater than zero.");
    }
           // Check Service Type
        if (serviceType == null || serviceType.trim().isEmpty()) {
            throw new IllegalArgumentException(
                "Service type cannot be empty.");
    }
         // Assign values
        this.transactionID = transactionID.trim();
        this.customerName = customerName.trim();
        this.weight = weight;
        this.serviceType = serviceType.trim();
        this.status = "Pending";
    }
     // Getters
    public String getTransactionID() {
        return transactionID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getWeight() {
        return weight;
    }

    public String getServiceType() {
        return serviceType;
    }

    public String getStatus() {
        return status;
    }
    // Setter with Validation
    public void setStatus(String status) {
    
    if (status == null || status.trim().isEmpty()) {
    throw new IllegalArgumentException(
    "Status cannot be empty."
    );
}
}
}


