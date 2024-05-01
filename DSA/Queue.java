package DSA;

public class Queue<T> {
    private int front, rear, maxSize, currentSize;
    private T[] queueArray;

    @SuppressWarnings("unchecked")
    Queue(int size) {
        front = 0; // where the data is removed
        rear = -1; // back of the queue(aka. where data is inserted)
        this.maxSize = size; // size of the queue by the user
        this.currentSize = 0; // for tracking the number of items inserted
        queueArray = (T[]) new Object[size];
    }

    void enQueue(T data) {
        if (isFull()) {
            System.out.println("Queue is full");
            System.exit(1);
        } 

        // increments the rear to 0 position
        rear++;
        // insert the data into that position
        queueArray[rear] = data;
        // increment current size for tracking number of data
        currentSize++;
    }

    T deQueue() {

        if (isEmpty()) {
            System.out.println("Queue is empty");
            System.exit(1);
        } 

        // 1 - 2 - 3 - 4 - 5
        // returns the item at 0 position(i.e. the first item at front position)
        T removedItem = queueArray[front];
        // increments to the next position(i.e deleting(skipping) the data from the queue)
        front++;
        // decrements the num of items in the queue
        currentSize--;

        return removedItem;
    }

    T peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            System.exit(1);
        }

        return queueArray[front];
    }

    boolean isFull() {
        if (currentSize == maxSize) {
            return true;
        }
        return false;
    }

    boolean isEmpty() {
        if (currentSize == 0)
            return true;
        else
            return false;
        }

    void display() {
        if (isEmpty()) {
            System.out.println("Empty Queue");
            return;
        }

        System.out.print("Queue items: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queueArray[i] + " ");
        }
        System.out.println();
    }

    int size() {
        return currentSize;
    }

    public static void main(String[] args) {
        Queue<String> q = new Queue<>(5);

        // enQueue 5 elements
        q.enQueue("shuayb");
        q.enQueue("hassy");
        q.enQueue("ruqy");
        q.enQueue("sadik");
        q.enQueue("sul");
    
        // deQueue removes element entered first i.e. 1
        System.out.println("Removed: " + q.deQueue());
        System.out.println("Removed: " + q.deQueue());


        q.display();

        System.out.println("Return data without deleting: " + q.peek());
        System.out.println("The size of the queue is: " + q.size());
    
    }
}
