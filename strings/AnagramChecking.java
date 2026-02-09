package strings;

import java.util.Scanner;

public class AnagramChecking {
    public static void main(String[] args) {
        //Scanner class initiation
        Scanner sc=new Scanner(System.in);

        //input strings
        System.out.print("Enter String 1 :");
        String s1=sc.next().toLowerCase();
        System.out.print("Enter string 2 :");
        String s2=sc.next().toLowerCase();

        sc.close();

        //checking if lengths are equal or not
        if(s1.length()!=s2.length()){
            System.out.println("Two strings are not anagrams ");
            return;
        }

        int []count=new int[26];
        for(char c:s1.toCharArray()){
            count[c-'a']++;
        }

        for(char c:s2.toCharArray()){
            count[c-'a']--;
        }

        for(int i:count){
            if(i!=0){
                System.out.println("Two Strings are not anagrams ");
                return;
            }
        }
        System.out.println("The above strings are anagrams ");
    }
}
