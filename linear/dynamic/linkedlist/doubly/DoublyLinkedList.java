package linear.dynamic.linkedlist.doubly;

public class DoublyLinkedList<T> {
    public Node<T> head;
    public int size;

    public DoublyLinkedList() {
        this.head = null;
    }

    public boolean isEmpty() {
        if (head == null)
            return true;
        return false;
    }

    public void insertAtHead(T data) {
        Node<T> node = new Node<>(data);

        node.nextNode = this.head;
        if (this.head != null) {
            this.head.prevNode = node;
        }

        this.head = node;
        size++;
    }

    public void deleteAtHead() {
        if (isEmpty())
            return;

        this.head = this.head.nextNode;
        if (this.head != null)
            this.head.prevNode = null;

        size--;
    }

    public void deleteByValue(T value) {
        if (isEmpty())
            return;

        Node<T> currentNode = this.head;
        while (currentNode.data.equals(value)) {
            deleteAtHead();
            return;
        }

        while (currentNode != null) {
            if (value.equals(currentNode.data)) {
                currentNode.prevNode.nextNode = currentNode.nextNode;
                if (currentNode.nextNode != null) {
                    currentNode.nextNode.prevNode = currentNode.prevNode;
                }
                size--;
            }
            currentNode = currentNode.nextNode;
        }
    }

    public void printList() {
        Node<T> ptr = this.head;
        System.out.print("null <-> ");
        while (ptr != null) {
            System.out.print(ptr.data + " <-> ");
            ptr = ptr.nextNode;
        }
        System.out.println("null");
    }
}
