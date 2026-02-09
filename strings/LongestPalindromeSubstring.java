package strings;

import java.util.Scanner;

public class LongestPalindromeSubstring {
    public static void main(String[] args) {
        //Scanner class initiation
        Scanner sc=new Scanner(System.in);

        //string
        System.out.print("Enter string :");
        String s=sc.next();

        int start = 0, end = 0;

        int maxLen=0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandFromCenter(s, i, i);     //odd length
            int len2 = expandFromCenter(s, i, i + 1); //even length
            int len = Math.max(len1, len2);
            maxLen=Math.max(maxLen,len);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        System.out.println("maximum length is "+maxLen);



    }
    public static int expandFromCenter(String s,int left,int right){
        while (left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
}
