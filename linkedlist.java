class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;

    }
}

public class linkedlist {
    private Node head;
    
    public void insertAStart(int data) {
        Node newNode = new Node (data);
        newNode.next = head;
        head = newNode;
    }
    public void printlist() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data +" -> ");
            current = current.next;
        }
        System.out.print("null");


    }
    public static void main (String args[]) {
        linkedlist list = new linkedlist();

        list.insertAStart(10);
        list.insertAStart(20);
        list.insertAStart(30);

        System.out.print("Linked list after insertion at start");
        list.printlist();

    }

    
}
