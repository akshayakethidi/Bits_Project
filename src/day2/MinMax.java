package day2;

    import java.util.*;
class MaxMinArray{
public static void main(String args[]){
int arr[]={12,23,98,67,9};
int max=arr[0];
int min=arr[0];
for(int i =1;i<arr.length;i++){
if(arr[i]>max){
max=arr[i];
}
if(arr[i]<min){
min=arr[i];
}
}
System.out.println("maximum elments =" +max);
System.out.println("minimum elments ="  +min);
}
}
