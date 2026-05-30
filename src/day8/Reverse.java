package day8;
import java.util.*;
public class Reverse {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int j = 0 ; j < t ; j++){
        int ArrayListSize = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList();
        for(int i = 0 ; i < ArrayListSize ; i++)
            {
        int val = sc.nextInt();
        arr.add(val);
        }
        Collections.reverse(arr);
        System.out.println(arr);
    }
    }
}

