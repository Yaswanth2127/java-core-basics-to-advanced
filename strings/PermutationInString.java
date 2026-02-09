package strings;


import java.util.Scanner;

public class PermutationInString {
    public static void main(String[] args) {
        //scanner class initiation
        Scanner sc=new Scanner(System.in);

        //input strings
        System.out.print("Enter string 1:");
        String str1=sc.next();

        System.out.print("Enter string 2: ");
        String str2=sc.next();

        sc.close();
        if(str1.length()>str2.length()){
            System.out.println("Not possible ");
            return;
        }

        int [] freq1 =new int[26];
        for(char c:str1.toCharArray()){
            freq1[c-'a']++;
        }

        int []freq2=new int[26];
        int end=0,start=0;
        while(end<str2.length()){
            char c=str2.charAt(end);
            freq2[c-'a']++;
            while(freq2[c-'a']>freq1[c-'a']){
                char d=str2.charAt(start);
                freq2[d-'a']--;
                start++;
            }
            if(end-start+1 ==str1.length()){
                boolean res=true;
               for(int i=0;i<26;i++){
                   if(freq2[i]!=freq1[i]){
                       res=false;
                       break;
                   }
               }
               if(res){
                   System.out.println("True");
                   return;
               }

            }

            end++;
        }

        System.out.println("Not found");
    }



}
