// Queue class implemented using an array
class Queue {
    private int front, rear, size;
    private int[] array;

    // Constructor to initialize the queue with a fixed capacity
    public Queue(int capacity) {
        array = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Check if the queue is full
    public boolean isFull() {
        return size == array.length;
    }

    // Enqueue operation (add an element at the rear of the queue)
    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + data);
            return;
        }
        rear = (rear + 1) % array.length; // Circular increment of rear index
        array[rear] = data;
        size++;
        System.out.println(data + " enqueued to queue");
    }

    // Dequeue operation (remove and return the element at the front of the queue)
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1; // Indicating empty queue
        }
        int data = array[front];
        front = (front + 1) % array.length; // Circular increment of front index
        size--;
        System.out.println(data + " dequeued from queue");
        return data;
    }

    // Peek operation (return the front element without removing it)
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }
        return array[front];
    }

    // Get the size of the queue
    public int size() {
        return size;
    }

    // Main method to test the queue operations
    public static void main(String[] args) {
        // Create a queue with capacity 5
        Queue queue = new Queue(5);

        // Enqueue some elements
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        // Try to enqueue when the queue is full
        queue.enqueue(60); // Should print that the queue is full

        // Print the front element
        System.out.println("Front element is: " + queue.peek());

        // Dequeue some elements
        queue.dequeue();
        queue.dequeue();

        // Print the size of the queue
        System.out.println("Queue size: " + queue.size());

        // Dequeue the remaining elements
        queue.dequeue();
        queue.dequeue();
        queue.dequeue(); // Dequeue when the queue is empty

        // Try to dequeue from an empty queue
        queue.dequeue(); // Should print that the queue is empty
    }
}
