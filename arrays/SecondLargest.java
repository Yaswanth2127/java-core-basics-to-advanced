package arrays;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        //Scanner class initiation
        Scanner sc=new Scanner(System.in);

        //input values
        int n;
        System.out.print("Enter number of values :");
        n=sc.nextInt();

        if(n<=0){
            System.out.println("Invalid input");
            return;
        }

        if(n<2){
            System.out.println("Second largest element doesn't exist");
            return;
        }

        //array declaration
        int []array=new int[n];
        //array input
        for(int i=0;i<n;i++){
            System.out.print("Enter number "+(i+1)+":");
            array[i]=sc.nextInt();
        }

        //core logic

        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;

        for(int i:array){
            if(i>max1){
                max2=max1;
                max1=i;
            }else if(i<max1 && i>max2){
                max2=i;
            }
        }
        if(max2==Integer.MIN_VALUE){
            System.out.println("Second largest maximum doesn't exist");
            return;
        }
        System.out.println("Second largest element is "+max2);
    }
}
