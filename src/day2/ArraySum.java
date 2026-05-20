package day2;

    import java.util.Scanner;

class ArraySum {
   ArraySum() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("enter number of element:");
      int var2 = var1.nextInt();
      int[] var3 = new int[var2];
      int var4 = 0;
      System.out.println("enter array elements:");

      for(int var5 = 0; var5 < var2; ++var5) {
         var3[var5] = var1.nextInt();
      }

      for(int var6 = 0; var6 < var2; ++var6) {
         var4 += var3[var6];
         System.out.println("sum of array elements=" + var4);
      }

   }
}
