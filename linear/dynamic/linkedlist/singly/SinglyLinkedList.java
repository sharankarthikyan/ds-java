public class SinglyLinkedList {
    private Node head;
    private int length;

    public SinglyLinkedList() {
        this.head = null;
        this.length = 0;
    }

    public void beginInsert(Node node) {
        if (head != null) {
            node.setNext(head);
        }
        head = node;
        this.length++;
    }

    public void endInsert(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node ptr = head;
            while (ptr.next != null) {
                ptr = ptr.next;
            }
            ptr.next = node;
        }
        this.length++;
    }

    public void randomInsert(Node node, int loc) {

        if (loc < 0 || loc > length) {
            System.out.print("Index Out of Bound");
            return;
        } else if (loc == 0) {
            beginInsert(node);
            return;
        } else if (loc == length) {
            endInsert(node);
            return;
        }

        int idx = 0;
        Node ptr1 = null;
        Node ptr2 = head;
        while (idx < loc) {
            ptr1 = ptr2;
            ptr2 = ptr2.next;
            idx++;
        }
        node.next = ptr2;
        ptr1.next = node;
        this.length++;
    }

    public Node beginDelete() {
        if (head == null) {
            System.out.println("List is Empty..");
            return null;
        }

        Node temp = head;
        head = head.next;
        return temp;
    }

    public Node endDelete() {
        if (head == null) {
            System.out.println("List is Empty...");
            return null;
        } else {
            
        }

        if(head.next == null) {
            head = null;
            return null;
        } else 

        Node ptr = head;
        while (ptr.next != null) {
            ptr = ptr.next;
        }
        ptr
    }

    public void show() {
        if (head == null) {
            System.out.println("List is Empty...");
        }

        Node ptr = head;
        while (ptr != null) {
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
        }
    }
}
