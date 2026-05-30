package day7;
import java.util.Scanner;
public class PowerOf4 {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0; i<n; i++){
            int t=sc.nextInt();
            if((t&(t-2))==0)
            {
                System.out.print("power of 4 numbers");
            }else{
                System.out.print("not power of 4 numbers");
            }
            }
            }

        } 

