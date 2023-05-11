public class LinkedList_Client {
    public static void main(String[] args) {
        LinkedList l1=new LinkedList();
        l1.addFirst(10); 
        l1.addFirst(20);
        l1.addFirst(30);
        l1.addFirst(40);
        l1.addFirst(50);
        l1.addLast(60);
        l1.display();
        System.out.println();
        // System.out.println(l1.getNode(2).data);
        // l1.addAtpos(70, 3);
        // l1.deleteFirst();
        // l1.deleteLast();
        l1.deleteAtpos(4);
        System.out.println(l1.getMid());
        l1.display();
        System.out.println();
        System.out.println(l1.tail.data);
    }
}
