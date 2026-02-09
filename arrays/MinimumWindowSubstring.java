package arrays;


import java.util.Scanner;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        //scanner class initiation
        Scanner sc=new Scanner(System.in);

        //input strings
        System.out.print("Enter source string :");
        String s=sc.next().toLowerCase();

        System.out.print("Enter target string :");
        String t=sc.next().toLowerCase();

        sc.close();

        //CHECK
        if(t.length()>s.length()){
            System.out.println("string is "+"Empty string");
            return;
        }


        int [][]chars=new int[26][2];
        for(char c:t.toCharArray()){
            chars[c-'a'][0]++;
        }
        int required=0;

        for(int i=0;i<26;i++){
            if(chars[i][0]>0)required++;
        }

        //now source string
        //CORE LOGIC
        int formed=0;
        int start=0,minLen=Integer.MAX_VALUE;
        int minStart=0;

        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);
            int idx = c - 'a';

            // expand window
            if (chars[idx][0] > 0) {
                chars[idx][1]++;
                if (chars[idx][1] == chars[idx][0]) {
                    formed++;
                }
            }

            // shrink while valid
            while (formed == required) {

                if (end - start + 1 < minLen) {
                    minLen = end - start + 1;
                    minStart = start;
                }

                char leftChar = s.charAt(start);
                int leftIdx = leftChar - 'a';

                if (chars[leftIdx][0] > 0) {
                    if (chars[leftIdx][1] == chars[leftIdx][0]) {
                        formed--;
                    }
                    chars[leftIdx][1]--;
                }

                start++;
            }
        }
        if(minLen==Integer.MAX_VALUE){
            System.out.println("No String is present");
        }
        else{
            System.out.println("Minimum substring is "+s.substring(minStart,minStart+minLen));
        }


    }
    public static boolean check(int [][]chars){

        for(int []i:chars){
            if(i[0]>i[1]){
                return  false;
            }
        }
        return true;
    }
}
