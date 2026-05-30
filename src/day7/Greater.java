package day7;

public class Greater {
  public static void main(String[] args) {
    int n = 20;
    try{
      if(n>35){
        throw new ArithmeticException(">35");
      }
      System.out.println("<35");
    }catch(ArithmeticException e)
    {
      System.out.println(e.getMessage());
    }
      }
    }
