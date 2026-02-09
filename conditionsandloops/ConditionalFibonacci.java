package conditionsandloops;

import java.util.Scanner;

public class ConditionalFibonacci {
    public static void main(String[] args) {
        //Scanner class initiation
        Scanner sc=new Scanner(System.in);

        //input value
        int n;
        System.out.println("Enter number of digits ");
        n=sc.nextInt();

        sc.close();
        //handling negative numbers
        if(n<=0){
            System.out.println("Invalid input ");
            return;
        }
        //core logic

        //for n==1
        int a=0;
        int b=1;

        for(int i=1;i<=n;i++){
            int curr;
            if(i==1)curr=0;
            else if(i==2)curr=1;
            else{
                curr=a+b;
                a=b;
                b=curr;
            }
            if(isPrime(curr)){
                System.out.print("# ");
            }else if(curr%2==0){
                System.out.print("E ");
            }else{
                System.out.print(curr+" ");
            }
        }


    }

    public static boolean isPrime(int n){
       if(n==1)return false;
       else if(n==2)return true;
        for(int i=3;i*i<=n;i+=2){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
