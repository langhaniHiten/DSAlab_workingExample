class Node {
    int data;
    Node prev;
    Node next;
    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;
    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }
    public void deleteNodeAtPosition(int position) {
        if (position < 0 || position >= size) {
            System.out.println("Invalid position. Unable to delete.");
            return;
        }
        if (position ==0) {
            head = head.next;
            if (head !=null) {
                head.prev = null;
            } else {
                tail = null;
            }
        } else if (position == size - 1) {
            tail = tail.prev;
            if (tail != null) {
                tail.next = null;
            } else {
                head = null;
            }
        } else {
            Node current = head;
            for (int i = 0; i < position; i++) {
                current = current.next;
            }
            if (current !=null) {
                if (current.prev !=null) {
                    current.prev.next = current.next;
                }
                if (current.next !=null) {
                    current.next.prev = current.prev;
                }
            }
        }
        size--;
    }
    public void printList() {
        Node current =head;
        while (current !=null) {
            System.out.print(current.data+ " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        DoublyLinkedList list1 = new DoublyLinkedList();
        list1.addNode(20);
        list1.addNode(30);
        list1.addNode(40);
        list1.addNode(50);
        list1.addNode(60);
        System.out.println("Initial list:");
        list1.printList();
        list1.deleteNodeAtPosition(2);
        System.out.println("After deleting node at position 2:");
        list1.printList();
        list1.deleteNodeAtPosition(0);
        System.out.println("After deleting head node:");
        list1.printList();
        list1.deleteNodeAtPosition(2);
        System.out.println("After deleting tail node:");
        list1.printList();
    }
}
