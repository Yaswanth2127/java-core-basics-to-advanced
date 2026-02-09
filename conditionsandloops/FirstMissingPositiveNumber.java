package conditionsandloops;

import java.util.Scanner;

public class FirstMissingPositiveNumber {
    public static void main(String[] args) {
        //scanner class initiation
        Scanner sc=new Scanner(System.in);

        //input value
        int n;
        System.out.print("Enter number ");
        n= sc.nextInt();

        //core logic
        //for negative Numbers and positive numbers >1
        if(n<=0 || n>1){
            System.out.println("1");
        }else{
            System.out.println("2");
        }
        sc.close();
    }
}
