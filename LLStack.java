class StackWithLinkedList {
    private Node top;

    public static class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    // Insert at the top of the stack (push operation)
    public void insertFirst(int data) {
        Node n = new Node(data);
        n.next = top;
        top = n;
    }

    // Delete the top of the stack (pop operation)
    public Node deleteFirst() {
        if (top == null) {
            System.out.println("Stack is empty");
            return null;
        }
        Node temp = top;
        top = top.next;
        return temp;
    }

    // Display the elements in the stack
    public void displayList() {
        Node current = top;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}

 class LinkedList {
    StackWithLinkedList stack = new StackWithLinkedList();

    // Push an element onto the stack
    public void push(int element) {
        stack.insertFirst(element);
    }

    // Pop an element from the stack
    public void pop() {
        stack.deleteFirst();
    }

    // Display the current stack
    public void displayStack() {
        System.out.println("Stack content:");
        stack.displayList();
    }
}

public class LLStack {
    public static void main(String[] args) {
        LinkedList li = new LinkedList();

        // Pushing elements to the stack
        li.push(50);
        li.push(70);
        li.push(190);

        // Display stack after push operations
        System.out.println("1. Stack after push operation:");
        li.displayStack();

        // Pop an element from the stack
        li.pop();

        // Display stack after pop operation
        System.out.println("\n2. Stack after pop operation:");
        li.displayStack();
    }
}
