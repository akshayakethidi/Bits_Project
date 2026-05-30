package day8;
import java.util.*;
public class Array2 {
    public static void main(String[] args){
      ArrayList<String> emd=new ArrayList();
      emd.add ("maya");
      emd.add("mohit");
      emd.add("mohit");
        LinkedHashSet<String> lhs=new LinkedHashSet(emd);
        System.out.println(lhs);
    }
}