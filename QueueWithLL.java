// Node class to represent each element in the queue
class Node {
    int data;
    Node next;

    // Constructor to initialize the node
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Queue class implemented using LinkedList
class Queue {
    private Node front, rear;
    private int size;

    // Constructor to initialize an empty queue
    public Queue() {
        front = rear = null;
        size = 0;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return front == null;
    }

    // Enqueue operation (add an element at the rear of the queue)
    public void enqueue(int data) {
        Node newNode = new Node(data);

        // If the queue is empty, both front and rear will point to the new node
        if (rear == null) {
            front = rear = newNode;
            System.out.println(data + " enqueued to queue");
            size++;
            return;
        }

        // Otherwise, add the new node at the end and update rear
        rear.next = newNode;
        rear = newNode;
        size++;
        System.out.println(data + " enqueued to queue");
    }

    // Dequeue operation (remove and return the element at the front of the queue)
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1; // Indicating empty queue
        }

        // Remove the front element
        int dequeuedData = front.data;
        front = front.next;

        // If the queue becomes empty, set rear to null as well
        if (front == null) {
            rear = null;
        }

        size--;
        System.out.println(dequeuedData + " dequeued from queue");
        return dequeuedData;
    }

    // Peek operation (return the front element without removing it)
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return front.data;
    }

    // Get the size of the queue
    public int size() {
        return size;
    }
}

// Client code to test the Queue implementation
public class QueueWithLL{
    public static void main(String[] args) {
        // Create a queue with linked list
        Queue queue = new Queue();

        // Enqueue some elements
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        // Print the front element
        System.out.println("Front element is: " + queue.peek());

        // Dequeue some elements
        queue.dequeue();
        queue.dequeue();

        // Print the size of the queue
        System.out.println("Queue size: " + queue.size());

        // Dequeue the remaining element
        queue.dequeue();

        // Try to dequeue from an empty queue
        queue.dequeue();
    }
}
