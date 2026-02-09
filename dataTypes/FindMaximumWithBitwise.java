package dataTypes;

import java.util.Scanner;

public class FindMaximumWithBitwise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //declaring variables
        int a,b;

        //input a
        System.out.print("Enter the value of a:");
        a=sc.nextInt();

        //input b
        System.out.print("Enter the value of b:");
        b=sc.nextInt();

        int diff=a-b;
        int i=diff>>31 &1;
        int max=a-(i*diff);
        System.out.println("diff->"+diff);
        System.out.println(("i -->")+i);
        System.out.println("Maximum is "+max);
    }
}
