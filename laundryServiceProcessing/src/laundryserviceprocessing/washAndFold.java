
package laundryserviceprocessing;

public class washAndFold extends laundryOrder {
     // Constructor
    public washAndFold(String transactionID,
                       String customerName,
                       double weight) {

        super(transactionID, customerName, weight,
              "Wash and Fold");
    }

}