package conditionsandloops;

import java.util.Scanner;

public class LongestIncreasingRun {
    public static void main(String[] args) {
        //scanner class initiation
        Scanner sc=new Scanner(System.in);

        //input value
        int n;
        System.out.print("Enter number:");
        n= sc.nextInt();

        sc.close();

        //handling negative values
        if(n<=0){
            System.out.println("Invalid input ");
            return;
        }
        int currLen=1,maxLen=1;

        //string version
//        String number=String.valueOf(n);
//
//        for(int i=1;i<number.length();i++){
//            if(number.charAt(i)>number.charAt(i-1)){
//                currLen++;
//
//            }else {
//                maxLen=Math.max(maxLen,currLen);
//                currLen = 1;
//            }
//        }
//        maxLen=Math.max(maxLen,currLen);

        int left=n%10;
        n/=10;
        while(n!=0){
            int right=n%10;
            if(left<right){
                currLen++;
            }else{
                maxLen=Math.max(maxLen,currLen);
                currLen=1;
            }
            left=right;
            n/=10;
        }
        maxLen=Math.max(maxLen,currLen);
        System.out.println("Max length "+maxLen);


    }

}
