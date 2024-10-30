public class LinkedList1 {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public void addFirst(int data){
        Node nn=new Node(data);  //Create new Node nn
        if(head==null){
            head=tail=nn;  //If head is empty then point head and tail to nn
            return;
        }
        nn.next=head;  //Point nn to head
        head=nn;  // assign head to nn
    }
    public void addLast(int data){
        Node nn=new Node(data);
        if(head==null){
            head=tail=nn;
            return;
        }
        tail.next=nn;
        tail=nn;
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
        LinkedList1 ll=new LinkedList1();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.print();
    }
}
