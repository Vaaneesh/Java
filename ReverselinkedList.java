import java.util.*;

public class ReverselinkedList {
    static class Node{
        int data;
        Node next;
        Node(int val){
            data=val;
            next=null;
        }
    } 
    static Node head;
    Node reverse(Node node){
        Node prev=null;
        Node curr=node;
        Node next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        node=prev;
        return node;
    }
    void printlist(Node node){
        while(node!=null){
            System.out.print(node.data+"->");
            node=node.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        ReverselinkedList list=new ReverselinkedList();
        list.head=new Node(85);
        ReverselinkedList.head.next=new Node(40);
        list.head.next.next=new Node(50);
        list.printlist(head);
        head=list.reverse(head);
        list.printlist(head);
        ob.close();
    }
}
