public class Stack {
    private int arr[];
    private int size;
    private int index = 0;

    public Stack(int size) {
        this.size = size;
        arr = new int[size];
    }

    // Push method
    public void push(int element) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }
        arr[index] = element;
        index++;
    }

    // Pop method
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1; // Returning -1 to indicate an error
        }
        return arr[--index];
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return index == 0;
    }

    // Check if the stack is full
    public boolean isFull() {
        return index == size;
    }

    // Get the current size of the stack
    public int size() {
        return index;
    }

    // Main method to test the Stack class
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(8);
        stack.push(11);
        stack.push(13);
        stack.push(20);
        stack.push(11);

        System.out.println("1. Size of stack after push operations: " + stack.size());

        System.out.println("2. Pop elements from stack:");
        while (!stack.isEmpty()) {
            System.out.printf("%d ", stack.pop());
        }

        System.out.println("\n3. Size of stack after pop operations: " + stack.size());
    }
}
