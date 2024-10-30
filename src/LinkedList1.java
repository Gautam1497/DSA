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
    public static int size;
    public void addFirst(int data){
        Node nn=new Node(data);  //Create new Node nn
        if(head==null){
            head=tail=nn;  //If head is empty then point head and tail to nn
            size++;
            return;
        }
        nn.next=head;  //Point nn to head
        head=nn;  // assign head to nn
        size++;
    }
    public void addLast(int data){
        Node nn=new Node(data);
        if(head==null){
            head=tail=nn;
            size++;
            return;
        }
        tail.next=nn;
        tail=nn;
        size++;
    }
    public void print(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void addMiddle(int n,int data){
        if(n==0){
            addFirst(data);
            size++;
            return;
        }
        int i=0;
        Node nn=new Node(data);
        Node temp=head;
        while(i++<n-1){
            temp=temp.next;
        }
        nn.next=temp.next;
        temp.next=nn;
        size++;
    }

    public int removeFirst(){
        if(size==0)return Integer.MIN_VALUE;
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size==0){
            System.out.println("LL is empty:");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            size--;
            int val=tail.data;
            head=tail=null;
            return val;
        }
        Node prev=head;
        for (int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }

    public static void main(String[] args) {
        LinkedList1 ll=new LinkedList1();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.print();
        System.out.println(size);
        ll.addMiddle(2,5);
        ll.removeFirst();
        ll.print();
        ll.removeLast();
        ll.print();
        System.out.println(size);
    }
}
