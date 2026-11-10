
package laundryserviceprocessing;
public class laundrySearch {
    public laundryOrder searchByTransactionID(
           laundryQueue queue, String searchID) {
        
        // Validate queue
        if (queue == null) {
            return null;
        }

       // Validate search ID
        if (searchID == null || searchID.trim().isEmpty()) {
            return null;
        }

        // Perform searching operation
        return queue.search(searchID.trim());
    }
}