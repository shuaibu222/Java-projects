package DSA;

public class Queue {
    private int FRONT, REAR, SIZE;
    private int[] queueArr;

    Queue(int size) {
        FRONT = -1;
        REAR = -1;
        this.SIZE = size;
        queueArr = new int[SIZE];
    }


    public void enQueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
            System.exit(1);
        } else { 
            if (FRONT == -1) {
                FRONT = 0;
            }
            REAR++;
            queueArr[REAR] = item;
            System.out.println("\nInserted " + item);
        }
        
    }

    public int deQueue() {
        int removedElement = 0;
        if (isEmpty()) {
            System.out.println("Queue is empty");
            System.exit(1);
        } else if (FRONT >= REAR) {
            FRONT = -1;
            REAR  = -1;
        } else {
            removedElement = queueArr[FRONT];
            FRONT++;
        }
        System.out.println("\nDeleted -> " + removedElement);
        return removedElement;
    }

    boolean isFull() {
        if (FRONT == 0 && REAR == SIZE - 1) {
            return true;
        }
        return false;
    }

    boolean isEmpty() {
        if (FRONT == -1)
            return true;
        else
            return false;
        }

    void display() {
    /* Function to display elements of Queue */
    int i;
    if (isEmpty()) {
        System.out.println("Empty Queue");
    } else {
        System.out.println("\nFront index-> " + FRONT);
        System.out.print("Items -> ");

        for (i = FRONT; i <= REAR; i++) {
            System.out.print(queueArr[i] + "  ");
        }
        
            System.out.println("\nRear index-> " + REAR);
        } 
    }

    public static void main(String[] args) {
        Queue q = new Queue(6);

        // enQueue 5 elements
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(5);
    
        // 6th element can't be added to because the queue is full
        q.enQueue(6);
    
        q.display();
    
        // deQueue removes element entered first i.e. 1
        q.deQueue();
    
        // Now we have just 4 elements
        q.display();
    
    }
}
