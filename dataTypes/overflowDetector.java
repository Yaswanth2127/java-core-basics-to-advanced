package dataTypes;

import java.util.Scanner;

public class overflowDetector {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n;
        System.out.print("Enter the value of a:");
        n=sc.nextInt();

        if(willOverflow(n,n+1)){
            System.out.println("Overflow");
            return;
        }
        //core logic
        long t1=(long)n*(n+1);
        if(willOverflow(t1,n+2)){
            System.out.println("Overflow");

        }
        else{
            System.out.println(t1*(n+2));
        }
        sc.close();

    }
    public static boolean willOverflow(long a,long b){
        if(a==0|| b==0){
            return false;
        }
        return Math.abs(a)>(Long.MAX_VALUE/Math.abs(b));
    }
}
