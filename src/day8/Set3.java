package day8;
import java.util.HashSet;

public class Set3 {

    public static void main(String[] args){
       HashSet<Integer>s1=new HashSet<>();
       s1.add(6);
       s1.add(8);
       s1.add(6);
       HashSet<Integer>s2=new HashSet<>();
         s2.add(6);
         s2.add(9);
         s2.add(8);
         s1.addAll(s2);
         System.out.println(s1.contains(s2));
    }
}
