package arrays;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSubArrayWithEqual0sAnd1s {
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

        //array declaration

        int []arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Value "+(i+1)+":");
            arr[i]=sc.nextInt();

        }

        //core logic
        int maxLen=0;
        HashMap<Integer,Integer> preSum=new HashMap<>();
        int prefix=0;
        for(int i=0;i<n;i++){
            arr[i]=arr[i]==0?-1:1;
            prefix+=arr[i];
            if(prefix==0){
                maxLen=i+1;
            }
            if(preSum.containsKey(prefix)){
                maxLen=Math.max(maxLen,i-preSum.get(prefix));
            }
            preSum.putIfAbsent(prefix,i);
        }

        System.out.println("Maximum length is "+maxLen);
        sc.close();



    }
}
