package day9;

public class Ds2 {
    int front=-1;
    int rear=-1;
    int arr[]=new int[5];
    void enqueue(int data)
    {
        if(rear==arr.length-1)
        {
            System.out.println("Queue is overflow");
            return;
        }
        if(front==-1)
        {
            front=0;
        }
        rear++;
        arr[rear]=data;
        System.out.println(arr[rear]+" ->inserted");
    }
    void dequeue()
    {
        if(front==-1 || front>rear)
        {
            System.out.println("Queue is underflow");
            return;
        }
        System.out.println(arr[front]+" ->deleted");
        front++;
    }
    void peek()
    {
        if(front==-1 || front>rear)
        {
            System.out.println("no values in queue");
            return;
        }
        System.out.println(arr[front]+" ->is peek element");
    }
    void display()
    {
        if(front==-1 || front>rear)
        {
            System.out.println("no values in queue");
            return;
        }
        for(int i=front;i<=rear;i++)
        {
            System.out.print(arr[i]+" ");
        }
         System.out.println();
    }
    void count()
    {
        if(front==-1 || front>rear)
        {
            System.out.println("no values in queue");
            return;
        }
        System.out.println("Total elements in queue: "+(rear-front+1));
    }
    public static void main(String[] args) {
        Ds2 q=new Ds2();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.dequeue();
        q.peek();
        q.display();
        q.count();
    }
}