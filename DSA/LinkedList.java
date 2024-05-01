package DSA;

class Node<T> {
    T data;
    Node<T> next;
    Node<T> prev;

    Node(T data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class LinkedList<T> {
    Node<T> head;

    LinkedList() {
        this.head = null;
    }

    @SuppressWarnings("unchecked")
    void insertAtTheBeginning(T data) {
        @SuppressWarnings("rawtypes")
        Node<T> newNode = new Node(data);

        if (head == null) {
            // if head is null then head = newNode
            head = newNode;
        } else {
            // newNode point to current head, then current head prev pointer points to newNode, 
            // then update newNode to be the head
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    @SuppressWarnings("unchecked")
    void insertAtTheEnd(T data) {
        @SuppressWarnings("rawtypes")
        Node<T> newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;

            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;

        }
    }

    // 1 - 2 - 3 - 4 - 5
    @SuppressWarnings("unchecked")
    void insertAfter(T target, T data) {
        Node<T> curr = head;

        while (curr != null && curr.data != target) {
            curr = curr.next;
        }

        if (curr == null) {
            System.out.println("Previous node can't be null");
            return;
        }

        @SuppressWarnings("rawtypes")
        Node<T> newNode = new Node(data);

        newNode.next = curr.next;
        if (curr.next != null) {
            curr.next.prev = newNode;
        }
        curr.next = newNode;
        newNode.prev = curr;

    }

    void deleteByValue(T target) {
        Node<T> curr = head;

        // 1 - 2 - 3 - 4 - 5
        while (curr != null && curr.data != target) {
            curr = curr.next;
        }

        if (curr == null) {
            System.out.println("Node with value " + target + " not found in the list");
            return;
        }

        if (curr == head) {
            head = head.next;
        }

        if (curr.prev != null) {
            curr.prev.next = curr.next;
        }

        if (curr.next != null) {
            curr.next.prev = curr.prev;
        }
    }

    boolean search(T target) {
        Node<T> current = head;
        while (current != null) {
            if (current.data == target) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    void display() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<String>();
        
        l.insertAtTheBeginning("shuaibu");

        l.insertAtTheEnd("Uthaimeen");

        l.insertAfter("shuaibu", "hassana");
        l.insertAfter("hassana", "ruqayyah");
        l.insertAfter("ruqayyah", "sadik");

        // l.deleteByValue("hassana");
        
        l.display();

        System.out.println(l.search("hassana"));
    }
}