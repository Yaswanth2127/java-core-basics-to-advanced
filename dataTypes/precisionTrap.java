package dataTypes;
import  java.util.Scanner;

public class precisionTrap {
    public static void main(String[] args) {
        int a,b;
        //scanner class initiation for taking inputs from the user
        Scanner sc=new Scanner(System.in);

        //input a
        System.out.print("Enter the value of a :");
        a=sc.nextInt();

        //input b
        System.out.print("Enter the value of b:");
        b=sc.nextInt();

        if(a+b==0){
            System.out.println("Division by zero error (Undefined)");
            return ;
        }
        //core logic
        long t1= (long) a * a * a +(long) b*b*b;
        long t2=a+b;
        double result=(double) t1/t2;

        //printing result
        System.out.print("Result is :");

        //verification for data type
        if(result ==(long)result){
            System.out.println((long)result);
        }
        else{
           // System.out.format("%.2f",result);
            System.out.printf("%.2f",result);
        }
    }
}
