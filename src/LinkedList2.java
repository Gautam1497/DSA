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

    public static void main(String[] args) {
        LinkedList2 ll=new LinkedList2();
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
        System.out.println(ll.findData(3));
        System.out.println(ll.findData(5));
    }
}
