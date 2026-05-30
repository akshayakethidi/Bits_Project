package day7;

public class Work {
  public static void main(String[] args) {
    int n = 25;
    try{
      if(n>18){
        throw new ArithmeticException(">18");
      }
      System.out.println("enable to work");
    }catch(ArithmeticException e){
    }
      System.out.println("not enable to work");
}
}