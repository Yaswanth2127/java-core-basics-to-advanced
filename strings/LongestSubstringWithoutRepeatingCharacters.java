package strings;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        //Scanner class initiation
        Scanner sc=new Scanner(System.in);

        //input strings
        System.out.print("Enter String :");
        String s1=sc.next().toLowerCase();

        sc.close();
        HashMap<Character,Integer>map=new HashMap<>();

        int start=0,end=0;
        int maxLen=0;
        while(end<s1.length()){
            char c=s1.charAt(end);
            while (map.containsKey(c)){
                char d=s1.charAt(start);
                map.remove(d);
                start++;
            }
            map.put(c,1);
            maxLen=Math.max(maxLen,end-start+1);
            end++;
        }
        System.out.println("Longest substring without repeating characters "+maxLen);
    }
}
