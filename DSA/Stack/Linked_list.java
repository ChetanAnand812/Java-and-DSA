public class Linked_list {

    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            next = null;
        }
    }

    static class Stack{
        public static Node head;

        // empty function
        public static boolean isEmpty() {
            return head == null;
        }
        
        // Push Function
        public static void push(int data) {
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
            System.out.println(data + " pushed to stack");
        }

        // Pop Function
        private static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        //Peak function
        private static int peak() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }

    }


    // Main Function
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);


        System.out.println(s.pop()+ " popped from stack");
 
        System.out.println("Top element is " + s.peak());

    }
}
