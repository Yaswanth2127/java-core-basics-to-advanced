package collections;

import java.util.Scanner;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        //Scanner class initiation
        Scanner sc=new Scanner(System.in);

        String s;
        System.out.print("Enter String ");
        s=sc.next().toLowerCase();

        sc.close();

        int []count=new int[26];
        for(char c:s.toCharArray()){
            count[c-'a']++;
        }

        for(char c:s.toCharArray()){
            if(count[c-'a']==1){
                System.out.println("First non repeating character is "+c);
                return;
            }
        }
        System.out.println("No character exists "+-1);


    }
}
