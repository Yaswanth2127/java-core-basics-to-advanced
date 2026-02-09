package conditionsandloops;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        //scanner class initiation
        Scanner sc=new Scanner(System.in);

        //input value
        int n;
        System.out.print("Enter number ");
        n=sc.nextInt();

        //finding factorials to avoid computation
        int []fact=new int[10];
        findFactorials(fact);

        //handling negative numbers
        if(n<=0){
            System.out.println("Invalid input");
            return;
        }

        for(int i=1;i<=n;i++){
            if(checkStrongNumber(i,fact)){
                System.out.println(i);
            }
        }


        sc.close();


    }
    static void findFactorials(int []fact){
        fact[0]=1;
        for(int i=1;i<=9;i++){
            fact[i]=fact[i-1]*i;
        }
    }

    static boolean checkStrongNumber(int n,int []fact){


        //core logic
        int factSum=0;
        int temp=n;
        while(temp!=0 && factSum<=n){
            factSum+=fact[temp%10];
            temp/=10;
        }
       return factSum==n;
    }
}
