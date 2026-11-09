
package laundryserviceprocessing;


public class laundryQueue {
     private laundryOrder[] orders;
    private int front;
    private int rear;
    private int count;

    // Constructor
    public laundryQueue(int size) {

        if (size <= 0) {
            throw new IllegalArgumentException(
                "Queue size must be greater than zero."
            );
        }

        orders = new laundryOrder[size];
        front = 0;
        rear = -1;
        count = 0;
    } 
     // Check if empty
    public boolean isEmpty() {
        return count == 0;
    }
 // Check if full
    public boolean isFull() {
        return count == orders.length;
    }

    // Get number of orders
    public int getCount() {
        return count;
    }
}
