package arrays;

import java.util.Scanner;

public class MaxSubArraySumWithSizeK {
    public static void main(String[] args) {
        //Scanner class initiation
        Scanner sc=new Scanner(System.in);

        //input value
        int n;
        System.out.print("Enter number of values :");
        n=sc.nextInt();

        //handling negative n value
        if(n<=0){
            sc.close();
            System.out.println("Invalid input");
            return;
        }

        int k;
        System.out.print("Enter window size:");
        k=sc.nextInt();

        //handling window size
        if(k>n || k<=0){
            sc.close();
            System.out.println("Invalid window size");
            return;
        }

        //array declaration

        int []arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Value "+(i+1)+":");
            arr[i]=sc.nextInt();
        }

        //core logic
        int maxSum,tempSum=0;
        for(int i=0;i<k;i++){
            tempSum+=arr[i];
        }

        //initial assumption
        maxSum=tempSum;

        for(int i=k;i<n;i++){
            tempSum+=arr[i];
            tempSum-=arr[i-k];
            maxSum=Math.max(maxSum,tempSum);
        }

        System.out.println("maximum sum with window size k is "+maxSum);
        sc.close();
    }
}
