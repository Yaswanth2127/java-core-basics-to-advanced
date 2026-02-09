package dataTypes;

import java.util.Scanner;

public class no_if_maximum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //declaring variables
        int a,b;

        //input a
        System.out.print("Enter the value of a:");
        a=sc.nextInt();

        //input b
        System.out.print("Enter the value of b:");
        b= sc.nextInt();

        int result=a>b?a:b;

        //another way

        System.out.println(result);

    }
}