package linear.dynamic.linkedlist.doubly;

public class DoublyLL01 {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> dll = new DoublyLinkedList<>();
        dll.insertAtHead(10);
        dll.insertAtHead(20);
        dll.insertAtHead(30);
        dll.insertAtHead(40);
        dll.printList();
        dll.deleteAtHead();
        dll.printList();
        dll.deleteByValue(10);
        dll.printList();
    }
}
