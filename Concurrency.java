import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;

/*
    Concurrency in Java refers to the ability of a program to execute multiple tasks concurrently, 
    allowing for efficient utilization of system resources and potentially improving performance. 
    Java provides built-in support for concurrency through its java.util.concurrent package, 
    which includes classes and interfaces to facilitate concurrent programming.

    Basics of Multi-Threading:

    Multi-threading is a programming concept that allows multiple threads to execute concurrently within a single process. Threads are lightweight processes that share the same memory space, allowing them to communicate and interact with each other efficiently.
    Key Points:

- Thread: A thread is the smallest unit of execution within a process. It represents an independent path of execution and has its own stack.
- Concurrency vs. Parallelism: Concurrency refers to the ability of a system to handle multiple tasks at the same time, whereas parallelism refers to the simultaneous execution of multiple tasks. Multi-threading enables concurrency by allowing threads to run concurrently on a single CPU core through time-sharing.
- Thread States: Threads can be in different states such as new, runnable, blocked, waiting, timed waiting, and terminated.
- Thread Lifecycle: Threads go through various states during their lifecycle, including creation, running, blocking, and termination.
- Thread Creation: Threads can be created by extending the Thread class or implementing the Runnable interface and passing it to a Thread constructor.
- Thread Priorities: Threads can have different priorities that influence their scheduling by the thread scheduler.
- Thread Synchronization: When multiple threads access shared resources concurrently, synchronization mechanisms such as locks, semaphores, or monitors are used to ensure thread safety and avoid data corruption.

    Synchronization: is the process of controlling the access of multiple threads to shared resources in a multi-threaded environment. It prevents race conditions and ensures that only one thread can access a critical section of code at a time.
    Key Points:

- Critical Section: A critical section is a part of the code that accesses shared resources and needs to be synchronized to prevent race conditions.
- Synchronized Keyword: In Java, the synchronized keyword is used to define critical sections or methods that can be accessed by only one thread at a time.
- Locks and Monitors: Behind the scenes, Java's synchronization is implemented using locks and monitors. When a thread enters a synchronized block, it acquires the lock associated with the monitor, preventing other threads from entering the same block until the lock is released.
- Wait and Notify: Java provides methods like wait() and notify() for inter-thread communication within synchronized blocks. Threads can wait for a condition to be met using wait(), and other threads can notify them when the condition is satisfied using notify() or notifyAll().

    Thread Pools: is a collection of pre-initialized threads that are ready to perform tasks. It manages the creation, reuse, and termination of threads, providing a scalable solution for executing multiple tasks concurrently without the overhead of thread creation and destruction.
    Key Points:

- Executor Framework: Java provides the java.util.concurrent.Executor framework for managing thread pools. It decouples task submission from task execution, allowing flexible control over thread management.
- ThreadPoolExecutor: The ThreadPoolExecutor class is a concrete implementation of the Executor interface. It allows you to customize various parameters such as the core pool size, maximum pool size, keep-alive time, and the queue used for holding tasks.
- ExecutorService: The ExecutorService interface extends Executor and provides additional methods for managing the lifecycle of the thread pool, submitting tasks, and shutting down the executor gracefully.
- FixedThreadPool: This type of thread pool maintains a fixed number of threads in the pool. If a thread is idle when a new task is submitted, it is reused to execute the task.
- CachedThreadPool: This type of thread pool creates new threads as needed and reuses existing threads when they are available. It is suitable for short-lived tasks with high concurrency.
- ScheduledThreadPool: This type of thread pool is used for scheduling tasks to execute after a certain delay or periodically at fixed intervals.
 */

class Producer implements Runnable {
    private BlockingQueue<Integer> queue;

    public Producer(BlockingQueue<Integer> q) {
        this.queue = q;
    }

    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(100); // Simulate some processing time
                queue.put(i); // Put data into the queue
                System.out.println("Produced: " + i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Consumer implements Runnable {
    private BlockingQueue<Integer> queue;

    public Consumer(BlockingQueue<Integer> q) {
        this.queue = q;
    }

    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                int num = queue.take(); // Take data from the queue
                System.out.println("Consumed: " + num);
                Thread.sleep(200); // Simulate some processing time
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Concurrency {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5); // Create a shared queue

        // Create producer and consumer threads
        Thread producerThread = new Thread(new Producer(queue));
        Thread consumerThread = new Thread(new Consumer(queue));

        // Start producer and consumer threads
        producerThread.start();
        consumerThread.start();
    }
}
