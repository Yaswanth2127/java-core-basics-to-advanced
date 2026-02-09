package arrays;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSubStringWithAtMostKDistinctChars {
    public static void main(String[] args) {
        //Scanner class initiation
        Scanner sc=new Scanner(System.in);

        //input string
        System.out.print("enter string:");
        String s=sc.next();

        int n=s.length();

        int k;
        System.out.print("Enter window size:");
        k=sc.nextInt();

        sc.close();

        //handling size
        if(k<=0){
            System.out.println("Invalid size");
            return;
        }

        //if window size is greater than string length
        if(k>=n){
            System.out.println("Length is "+n);
            return;
        }

        // core logic
        HashMap<Character,Integer> map=new HashMap<>();
        int maxLen=0;
        int count=0;
        int start=0;

        for(char c:s.toCharArray()){
            count++;
            map.put(c,map.getOrDefault(c,0)+1);

            while(map.size()>k){
                char prevChar=s.charAt(start);
                map.put(prevChar,map.get(prevChar)-1);

                if(map.get(prevChar)==0){
                    map.remove(prevChar);
                }
                count--;
                start++;
            }

            //updating length
            maxLen=Math.max(maxLen,count);
        }

        System.out.println("Maximum length :"+maxLen);

    }
}
