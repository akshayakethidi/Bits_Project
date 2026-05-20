package day2;

    import java.util.Scanner;

public class Reverse {
   public Reverse() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      int var2 = var1.nextInt();

      for(int var3 = 1; var3 < var2; ++var3) {
         int var4 = var2 / 10;
         var4 = var4 * 10 + var2;
         System.out.print(var4);
      }

      var1.close();
   }
}
