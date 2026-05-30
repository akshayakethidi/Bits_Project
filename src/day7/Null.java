package day7;
import java.util.*;
public class Null {
    
  public static void main(String[] args) {
    try{
      String s = null;
      String s1 = "raj";
      if(s.equals(s1))
      {
        System.out.println("equal");
      }
      System.out.println(9/0);
  }catch(NullPointerException e)
  {
    System.out.println("null");
  }
  catch(ArithmeticException e)
  {
    System.out.println("AE");
  }
  }
      }

