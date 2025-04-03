package LinkedList;

public class LinkedList {
    private Node head;
    private Node tail;
    public static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public int getData() {
            return this.data;
        }
    }

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (this.head == null && this.tail == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.next = newNode;
            this.tail = newNode;
        }
    }

    public Node removeLast() {
        Node temp = this.head;
        Node pre = this.head;

        while (temp.next != null) {
            temp = temp.next;
            if (temp.next != null) {
                pre = pre.next;
            }
        }

        this.tail = pre;
        this.tail.next = null;

        return temp;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }
}
