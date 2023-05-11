public class LinkedList {

    public class Node{
        int data;
        Node next;

        public Node(){

        }
        public Node(int val){
            this.data=val;
        }
    }

    Node head;
    int size;
    Node tail;

    public void addFirst(int val){
        Node n=new Node(); //new node is created
        n.data=val; //value of new node will be = val

        if(size==0){
            head=n;
            size++;
        }
        else{
            n.next=head; //next node will point to head 
            head=n; //new node will be at head
            size++;
        }
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
    }
}
