package day8;
import java.util.*;
public class Array3 {
    public static void main(String[] args){
    HashSet<Integer>set=new HashSet();
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
