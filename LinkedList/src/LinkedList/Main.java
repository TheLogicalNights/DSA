package LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        // Test add function
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);

        // Test printList function
        linkedList.printList();

        // Test removeLast function
        LinkedList.Node lastElement = linkedList.removeLast();
        System.out.println("\nDeleted Node: " + lastElement.getData());
        linkedList.printList();


    }
}
