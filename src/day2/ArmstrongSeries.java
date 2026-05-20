package day2;

public class ArmstrongSeries {
   ArmstrongSeries() {
   }

   public static void main(String[] var0) {
      System.out.println("Armstrong numbers from 1 to 1000");

      for(int var1 = 1; var1 <= 1000; ++var1) {
         int var3 = 0;

         for(int var4 = var1; var4 > 0; var4 /= 10) {
            int var5 = var4 % 10;
            var3 += var5 * var5 * var5;
         }

         if (var3 == var3) {
            System.out.print("" + var1);
         }
      }

   }
}

