package linear.dynamic.linkedlist.doubly;

public class Node<T> {
    T data;
    Node<T> nextNode;
    Node<T> prevNode;

    Node(T data) {
        this(data, null, null);
    }

    Node(T data, Node<T> nextNode, Node<T> prevNode) {
        this.data = data;
        this.nextNode = nextNode;
        this.prevNode = prevNode;
    }

    void setData(T data) {
        this.data = data;
    }

    void setNext(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    void setPrev(Node<T> prevNode) {
        this.prevNode = prevNode;
    }
}
