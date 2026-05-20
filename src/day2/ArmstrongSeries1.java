package day2;

    import java.util.Scanner;
class ArmstrongSeries{
public static void main(String args[]){
System.out.println("Armstrong numbers from 1 to 1000");
for(int i = 1;i <=1000; i++){
int num = i;
int sum = 0;
int temp = num;
while(temp>0){
int rem=temp%10;
sum=sum+(rem*rem*rem);
temp=temp/10;
}
if(sum==num){
System.out.print(num+"");
}
}
}
}

