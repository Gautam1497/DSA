public class LinkedList2 {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
        public static Node head;
        public static Node tail;
        public static int size;
        public void addFirst(int data){
            Node nn=new Node(data);
            if(head==null){
                head=tail=nn;
                size++;
                return;
            }
            nn.next=head;
            head=nn;
            size++;
        }
        public int findData(int data){
            int i=0;
            Node nn=head;
            while(nn!=null){
                if(nn.data==data){
                    return i;
                }
                nn=nn.next;
                i++;
            }
            return -1;
        }
    public void print(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public int recSearch(int key) {
        return helper(head, key);  // Start the recursive search from the head node
    }
    private int helper(Node head, int key) {
        if (head == null) return -1;  // Base case: if we've reached the end of the list and haven't found the key
        if (head.data == key) return 0;  // Check if the current node contains the key
        int i = helper(head.next, key);  // Recursively search in the remaining list
        if (i == -1) return -1; // If the key was not found in the remainder of the list, return -1
        return i + 1;  // If the key is found in the remaining list, return the current index by adding 1
    }


    public static void main(String[] args) {
        LinkedList2 ll=new LinkedList2();
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
        System.out.println(ll.findData(3)); // Iterative search
        System.out.println(ll.findData(5));
        System.out.println(ll.recSearch(3));// Recursive search
        System.out.println(ll.recSearch(10));
    }
}
