package day7;
import java.util.*;
public class TryCatch {
    
  public static void main(String[] args) {
      int n = 7;
      int arr[]=new int[5];
      try{
        for(int i = 0;i<7;i++)
        {
          arr[i]=2;
          System.out.println(arr[i]);
        }
      }
      catch(Exception e){
        System.out.println("array is full");
      }
    }
}