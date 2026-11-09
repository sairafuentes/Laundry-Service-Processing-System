
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
    
     // Process next order
    public laundryOrder dequeue() {

        if (isEmpty()) {
            return null;
        }

        laundryOrder processed = orders[front];
        orders[front] = null;

        front = (front + 1) % orders.length;
        count--;

        return processed;
    }
     // View first order
    public laundryOrder peek() {

        if (isEmpty()) {
            return null;
        }

        return orders[front];
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
      // Get order by position for JTable
    public laundryOrder getOrderAt(int position) {

        if (position < 0 || position >= count) {
            return null;
        }

        int index = (front + position) % orders.length;

        return orders[index];
    }
    // Display pending orders
    public void display() {
        
    }
}
