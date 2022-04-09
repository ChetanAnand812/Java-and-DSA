public class Reverse_LL{
    Node head;

    class Node{
        String data;
        Node next;

        Node(String data){            // Constructor
            this.data = data;
            this.next = null;
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


    public void reverseIterate() {
        if (head == null || head.next == null) {
            return;     
        }

        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            
            // update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }
    
    // Main Function
    public static void main(String[] args) {
        Reverse_LL list = new Reverse_LL();       // creating object list
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.printList();

        list.reverseIterate();
        list.printList();
    }
}
