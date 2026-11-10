
package laundryserviceprocessing;
public class laundrySearch {
    public laundryOrder searchByTransactionID(
           laundryQueue queue, String searchID) {
        
        // Validate queue
        if (queue == null) {
            return null;
        }

        return queue.search(searchID);
    }
}