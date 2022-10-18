package linear.dynamic.linkedlist.singly;

import java.util.Scanner;

public class SinglyLL01 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int option = 0;
        SinglyLinkedList sll = new SinglyLinkedList();

        while (option != 9) {
            System.out.print("\n\nMain Menu\n");
            System.out.print("\nChoose one option from the following list...\n");
            System.out.print("\n==========================================\n");
            System.out.print(
                    "\n1. Insert in begining\n2. Insert at last\n3. Insert at any random location\n4. Delete from the begining\n5. Delete from the last\n6. Delete node after specified location\n7. Search for an element\n8. Show\n9. Exit\n");
            System.out.print("Enter your option: ");

            option = sc.nextInt();
            switch (option) {
                case 1:
                    sll.beginInsert(new Node(sc.nextInt()));
                    break;
                case 2:
                    sll.endInsert(new Node(sc.nextInt()));
                    break;
                case 3:
                    System.out.print("Enter the Location to insert: ");
                    int loc = sc.nextInt();
                    sll.randomInsert(new Node(sc.nextInt()), loc);
                    break;
                case 4:
                    sll.beginDelete();
                    break;
                case 5:
                    sll.endDelete();
                    break;
                case 8:
                    sll.show();
                    break;
                case 9:
                    break;
                default:
                    System.out.print("Please enter a valid option..");
            }
        }
    }
}
