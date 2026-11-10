
package laundryserviceprocessing;
public class laundrySearch {
    public laundryOrder searchByTransactionID(
           laundryQueue queue, String searchID) {

        return queue.search(searchID);
    }
}