/*
 * What is a Stack?

    A stack is a linear data structure that follows the Last In, First Out (LIFO) principle. It means that the element which is inserted last will be the first one to be removed.
    Operations on a Stack:

        Push: Adds an element to the top of the stack.
        Pop: Removes the top element of the stack.
        Peek: Returns the top element of the stack without removing it.
        isEmpty: Checks if the stack is empty.
        size: Returns the number of elements in the stack.

    Time Complexity Analysis:

        Push: O(1)
        Pop: O(1)
        Peek: O(1)
        isEmpty: O(1)
        size: O(1)

    Space Complexity:

    The space complexity of a stack is O(n), where n is the number of elements stored in the stack.
 */

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

    public void push(int item) {
        if (isFull()) {
            System.out.println("OverFlow\nProgram Terminated\n");
            System.exit(1);
        }
        System.out.println("Inserting item: " + item);
        /*
         * The program first increment ++top and then assign the result to the var top; then access the element in the array
            e.g. if top = -1 then(++top) == 0; then 0 == top; then add the inserted item to the array
         */
        stackArr[++top] = item;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("STACK IS EMPTY!");
            System.exit(1);
        }

        /*
         * the stack first decrements the top variable (stackArr[top]).
         * then moves the top pointer down to the next element in the stack
         * This is done using top--
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
            System.out.println("`Item " + stackArr[i]);
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