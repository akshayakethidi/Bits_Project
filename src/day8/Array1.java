package day8;

import java.util.LinkedList;
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         String k = sc.next();
        int n = sc.nextInt();
       
        LinkedList<String> ll =new LinkedList();
        for(int i = 0;i<n ;i++);
        {
            String val = sc.next();
            ll.add(val);

        }
        System.out.println(ll.contains(k));
        for(String d : ll)
        {
            if(d.equals(k))
            {
                System.out.println(d);
            }
        }
    }
}
