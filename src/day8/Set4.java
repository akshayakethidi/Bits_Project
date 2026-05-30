package day8;

import java.util.HashSet;
import java.util.Iterator;

public class Set4 {
    public static void main(String[] args) {
            HashSet<Integer>s1=new HashSet<>();
            s1.add(6);
            s1.add(8);
            s1.add(9);
            Iterator s=s1.iterator();
            while(s.hasNext()){
                System.out.println(s.next());
            }
    }
}
