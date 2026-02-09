package conditionsandloops;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        //scanner class initiation
        Scanner sc=new Scanner(System.in);

        //input value
        int n;
        System.out.print("Enter number :");
        n=sc.nextInt();

        //input validation
        if(n<=0){
            System.out.println("Invalid input");
            return;
        }

        //core logic
        int sumOfDivisors =0;
        for(int i = 1; i<=n/2 && !(sumOfDivisors >n); i++){
            if(n%i==0){
                sumOfDivisors +=i;
            }

        }
        //printing based on result
        if(sumOfDivisors >n){
            System.out.println("Abundant");
        }else if(sumOfDivisors ==n){
            System.out.println("Perfect");
        }else{
            System.out.println("Deficient");
        }

        sc.close();
    }
}
