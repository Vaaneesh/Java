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
        Node n=new Node(val); //new node is created
        // n.data=val; //value of new node will be = val

        if(size==0){
            head=n;
            tail=n; //for size 0 tail will be this only
            size++;
        }
        else{
            n.next=head; //next node will point to head 
            head=n; //new node will be at head
            size++;
        }
    }

    public void addLast(int val){
        if(size==0){
            addFirst(val);
        }
        else{
            Node n=new Node(val);
            // n.data=val;
            tail.next=n;
            tail=n;
            size++;
        }
    }

    public Node getNode(int k){ //to get address of the next node where we want to add new node
        Node temp=head;
        for(int i=1;i<k;i++){
            temp=temp.next;
        }
        return temp;
    }

    public void addAtpos(int val,int k){
        if(size==0){
            addFirst(val);
        }

        else{
            Node temp1=getNode(k-1);
            Node temp2=getNode(k);
            Node n=new Node(val);
            temp1.next=n;
            n.next=temp2;
            size++;
        }
    }

    public void deleteFirst(){
        Node temp=head;
        head=head.next;
        temp.next=null;
        size--;
    }

    public void deleteLast(){
        Node temp=getNode(size-1);
        temp.next=null;
        tail=temp;
        size--;
    }
    public void deleteAtpos(int k){
        if(k==1){
            deleteFirst();
        }
        else if(k==size){
            deleteLast();
        }
        else{
            Node temp1=getNode(k-1);
            Node temp2=getNode(k);
            temp1.next=temp2.next;
            temp2=null;
            size--;
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
