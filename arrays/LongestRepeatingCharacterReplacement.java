package arrays;

import java.util.PriorityQueue;
import java.util.Scanner;

public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        //Scanner class initiation
        Scanner sc=new Scanner(System.in);

        //input string
        System.out.print("enter string in upper case letters :");
        String s=sc.next();

        //no of distinct chars
        int k;
        System.out.print("Enter k value :");
        k=sc.nextInt();

        sc.close();

        if(k<=0){
            System.out.println("Invalid k value ");
            return;
        }

        int []count=new int[26];
        int maxLength=0;
        int start=0;
        int maxFrequency=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int idx=c-'A';
            count[idx]++;
            maxFrequency=Math.max(maxFrequency,count[idx]);

            while((i-start+1)-maxFrequency>k){
                count[s.charAt(start)-'A']--;
                start++;
            }
            maxLength=Math.max(maxLength,i-start+1);
        }





        System.out.println("Maximum substring length is "+maxLength);

    }
}
