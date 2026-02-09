package arrays;

import java.util.Scanner;

public class LongestSubArrayWithSumLessThanOrEqualsToK {
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

        //array declaration

        int []arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Value "+(i+1)+":");
            arr[i]=sc.nextInt();
        }

        int start=0,end=0;
        int sum=0,maxLen=0;
        while(end<n){
            if(arr[end]>k){
                start=end+1;
                sum=0;
                end++;
                continue;
            }
            sum+=arr[end];

            while(sum>k){
                sum-=arr[start];
                start++;
            }
            maxLen=Math.max(maxLen,end-start+1);
            end++;
        }
        System.out.println("Maximum length of sub array with sum k is "+maxLen);
        sc.close();
    }
}
