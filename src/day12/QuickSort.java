package day12;
import java.util.*;
public class QuickSort {
    public static void conquer(int arr[],int start,int end,int pivot)
    {
        int i=start;
        int j=end;
        while(i<=j)
        {
            while(arr[i]<=pivot)
            {
                i++;
            }
            while(arr[j]>pivot)
            {
                j--;
            }
            if(i<=j)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
    }
    public static void divide(int arr[],int start,int end)
    {
        if(start>=end)
        {
            return;
        }
        int pivot=arr[end];
        conquer(arr,start,end,pivot);
        divide(arr,start,end-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        divide(arr, 0, n-1);
        System.out.println(Arrays.toString(arr));
}
}