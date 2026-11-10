
package laundryserviceprocessing;

public class washAndDry extends laundryOrder {
    // Constructor
    public washAndDry(String transactionID,
                      String customerName,
                      double weight) {

        super(transactionID, customerName, weight,
              "Wash and Dry");
    }

}


    
