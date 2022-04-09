public class LL {
    Node head;
    private int size;

    Linked_List(){
        this.size = 0;
    }

    class Node{
        String data;
        Node next;

        Node(String data){            // Constructor
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // Add - first, last
    public void addFirst() {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;   
        }

        newNode.next = head;
        head = newNode;
    }

    // last
    public void addLast(){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;   
        }

        Node currNode = head;
        while (currNode.next != null ) {
            currNode = currNode.next;   
        }

        cuurNode.next = newNode;
    }

    // Print
    public void printList() {
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Node currNode = head;
        while (currNode != null ) {
            System.out.println(cuurNode.data + " -> ");
            currNode = currNode.next;   
        }
        System.out.println("Null");
        
    }

    // Delete first
    public void deleteFirst() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }

        size--;

        head = head.next;
    }

    // Delete last
    public void deleteLast() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }

        size--;

        if (head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast =secondLast.next;
        }

        secondLast.next = null;
    }

    public void getSize() {
        return size;
    }
    

    // Main Function
    public static void main(String[] args) {
        LL list = new LL();       // creating object list
        list.addFirst("a");
        list.addFirst("is");
        list.printList();

        list.addLast("list");
        list.printList();

        list.addFirst("this");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        System.out.println(list.getSize());
        list.addFirst("this");
        System.out.println(list.getSize());
    }
}
