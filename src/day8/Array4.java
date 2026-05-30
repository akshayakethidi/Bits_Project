package day8;
import java.util.*;
public class Array4 {
    public static void main(String[] args){
    TreeSet<Integer>set=new TreeSet();
      set.add(6);
      set.add(8);
      set.add(6);
      set.add(9);
      set.add(8);
        System.out.println(set);
        LinkedList<Integer> s=new LinkedList<>(set);
        System.out.println(s);
    }
}
