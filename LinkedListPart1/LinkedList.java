package LinkedListPart1;

public class LinkedList {

    /**
     * Node
     */
    public class Node {

        int data;
        Node next;

        public Node(int data) {

            this.data = data;

        }

    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        
        Node newNode = new Node(data);

        if (head == null) {
            
            head = tail = newNode;
            return;

        }

        newNode.next = head;

        head = newNode;
        

    }

    public void remove() {
        
    }

    public void printLinkedList() {

        if (head == null) {
            
            System.out.println("LinkedList is Empty!");
            return;

        }

        Node list = head;
        
        while (list.next != null) {
            
            System.out.println(list.data);
            list = list.next;

        }

        System.out.println(list.data);

    }
        
    

    public static void main(String[] args) {
        
        LinkedList linkedList = new LinkedList();

        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addFirst(3);
        linkedList.addFirst(4);

        linkedList.printLinkedList();

    }

    

}
