package day9;

public class Ds1 {
    int arr[]=new int[5];
    int top=-1;
    public void push(int data)
    {
        if(top==arr.length-1)
        {
            System.out.println("Stack is overflow");
            return;
        }
            ++top;
            arr[top]=data;
            System.out.println(arr[top]+" ->inserted");
        }
        void pop(int data)
    {
        if(top==-1)
        {
            System.out.println("Stack is underflow");
            return;
        }
            
            System.out.println(arr[top]+" ->deleted");
            top--;
        }
        void peek()
    {
        if(top==-1)
        {
            System.out.println("no values in stack");
            return;
        }
            
            System.out.println(arr[top]+" ->is peek element");
        
        }
        boolean search(int data)
    {
        if(top==-1)
        {
            System.out.println("no values in stack");
            return false;
        }
        for(int i=0;i<=top;i++)
        {
            if(arr[i]==data)
            {
                System.out.println(data+" ->found at position "+i);
                return true;
            }
        }
        System.out.println(data+" ->not found");
        return false;
    }
    void display()
    {
        if(top==-1)
        {
            System.out.println("no values in stack");
            return;
        }
           for(int i=top;i>0;i--) 
           {
            if(i==0)
            System.out.print(arr[i]);
        else
            System.out.print(arr[i]+"->");
    }
        }
        void count()
    {
        if(top==-1)
        {
            System.out.println("values in stack");
            return;
        }
        int c=0;
        for (int i=top;i>=0;i--)
        {
            c++;
        }
         System.out.println(c);

        }
          
        
        public static void main(String[] args) {
            Ds1 s=new Ds1();
            s.push(10);
            s.push(20);
            s.push(30);
            s.push(40);
            s.push(50);
           
            s.count();
}
}



