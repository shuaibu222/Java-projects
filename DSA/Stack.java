package DSA;

public class Stack {
    private int capacity;
    private int[] stackArr;
    private int top;

    public Stack(int size) {
        stackArr = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("OverFlow\nProgram Terminated\n");
            System.exit(1);
        }

        System.out.println("Inserting item: " + data);

        /*
         * e.g. 0 - 1 - 2 - 3 - 4 - 5 - 6 - 7 - 8 - 9
         * 
         * increment top++ before finding it in the array by 1 == 10
         * then add the data to the incremented, i.e. stackArr[top] == 10(i.e the data)
         */

        stackArr[++top] = data;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("STACK IS EMPTY!");
            System.exit(1);
        }

        /*
         * e.g. 0 - 1 - 2 - 3 - 4 - 5 - 6 - 7 - 8 - 9 - 10
         * 
         * return the value of stackArr[top] == 10
         * then decrement by one == 9
         */

        return stackArr[top--];
    }

    public void size() {
        System.out.println("The size of the stack is: " + stackArr.length);
    }

    // Check if the stack is empty
    public Boolean isEmpty() {
        return top == -1;
    }

    public Boolean isFull() {
        return top == capacity - 1;
    }

    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.println("Item: " + stackArr[i]);
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(2);
        stack.push(8);
        stack.push(3);

        stack.pop();
        stack.pop();
        stack.printStack();

        stack.size();

    }
}