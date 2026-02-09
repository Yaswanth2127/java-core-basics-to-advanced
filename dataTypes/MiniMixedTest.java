package dataTypes;

import java.util.Scanner;

public class MiniMixedTest {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        n=sc.nextInt();
        sc.close();

        if(willOverflow(n,(long)n+1)){
            System.out.println("Overflow");
            return;
        }
        long t1=(long)n*(n+1);

        if(willOverflow((long)n+2,t1)){
            System.out.println("Overflow");
        }else{
            long res=t1*(n+2);
            System.out.println("Result is "+res);
            if(res%2==0){
                System.out.println("Final result is "+sumOfDigits(Math.abs(res)));
            }
            else{
                System.out.println("Final result is "+productOfDigits(Math.abs(res)));
            }

        }
    }
    public static boolean willOverflow(long a,long b){
        if(a==0 || b==0){
            return false;
        }
        return Math.abs(a)>(Long.MAX_VALUE/Math.abs(b));
    }
    public static long sumOfDigits(long num){
        long res=0;
        while(num!=0){
            res+=num%10;
            num/=10;
        }
        return res;
    }
    public static long productOfDigits(long num){
        if(num==0)return 0;
        long res=1;
        while(num!=0){
            res*=(num%10);
            num/=10;
        }
        return res;
    }
}
