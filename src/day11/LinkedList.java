package day11;
import java.util.*;
public class LinkedList {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public void addFirst(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        Node curr=head;
        while(curr.next!=null)
        {
            curr=curr.next;
        }
        curr.next=newNode;
    }
    public void printList()
    {
        Node curr=head;
        while(curr!=null)
        {
            System.out.print( curr.data+" ");
            curr=curr.next;
        }
    }
     public void countNodes()
    {
        Node curr=head;
        int count=0;
        while(curr!=null)
        {
            count++;
            curr=curr.next;
        }
        System.out.println("Number of nodes: " + count);
    }
   public void add1(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        Node curr=head;
        while(curr.next!=null)
        {
            curr=curr.next;
        }
        curr.next=newNode;
    }
    public void delf()
    {
        if(head==null)
        {
            return;
        }
        if(head.next==null)
        {
            head=null;
            return;
        }
        Node curr=head;
        while(curr.next.next!=null)
        {
            curr=curr.next;
        }
        curr.next=null;
    }
    public void delLast()
    {
        if(head==null)
        {
            return;
        }
        if(head.next==null)
        {
            head=null;
            return;
        }
        Node curr=head;
        while(curr.next.next!=null)
        {
            curr=curr.next;
        }
        curr.next=null;
    }
    public class LinkedCycle {
    public boolean hasCycle(Node head) {;
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) 
        {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) 
                { 
                return true;
            }
        }
        return false; 
    }
}

    public static void main(String[] args){
        LinkedList list=new LinkedList();
        list.addFirst(10);
        list.addFirst(20);
        list.addLast(30);
        list.addLast(40);
        list.printList();
        list.countNodes();
        list.add1(50);
        list.delf();
        list.delLast();
        list.hasCycle(list.head);
        list.printList();
    }
    
}
