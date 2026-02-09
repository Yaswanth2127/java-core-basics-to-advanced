package conditionsandloops;

import java.util.Scanner;

public class ReverseOnlyPrimeDigits {
    public static void main(String[] args) {
        //Scanner class initiation
        Scanner sc=new Scanner(System.in);

        //input value
        int n;
        System.out.print("Enter number:");
        n=sc.nextInt();

        if(n<=0){
            System.out.println("Invalid input ");
            return;
        }

        //to find prime numbers in a given number
        StringBuilder primes=new StringBuilder();
        String number=String.valueOf(n);


       //to find primes and group into a string
        while (n!=0){
            int digit=n%10;
            if(digit==2 || digit ==3 || digit==5 || digit ==7){
                primes.append(digit);
            }
            n/=10;
        }

        //prime index
        int index=0;

        //replacing prime numbers
        StringBuilder res=new StringBuilder();
        for(char c:number.toCharArray()){
           int d=c-'0';
           if(d==2 || d==3 || d==5|| d==7){
               res.append(primes.charAt(index++));
           }else{
               res.append(c);
           }
        }

        System.out.println(res);
        sc.close();
    }
}
