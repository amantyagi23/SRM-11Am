class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

}

public class LinkedList {

    Node head;

    LinkedList() {
        this.head = null;
    }

    // insertion

    void insertionAtHead(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;

        head = newNode;

    }

    void insertionAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        Node curNode = head;

        while (curNode.next != null) {
            curNode = curNode.next;
        }

        curNode.next = newNode;
    }

    void show() {

        Node curNode = head;

        while (curNode.next != null) {
            System.out.print(curNode.data + " --> ");
            curNode = curNode.next;
        }

        System.out.println();

    }

    public static void main(String[] args) {
        LinkedList obj = new LinkedList();

        obj.insertionAtEnd(2);
        obj.insertionAtEnd(3);
        obj.insertionAtEnd(4);
        obj.insertionAtEnd(5);
        obj.insertionAtEnd(6);

        obj.show();
    }

}
