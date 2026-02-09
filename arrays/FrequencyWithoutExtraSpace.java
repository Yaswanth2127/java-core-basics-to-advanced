package arrays;

import java.util.Scanner;

public class FrequencyWithoutExtraSpace {
    public static void main(String[] args) {
        //scanner class initiation
        Scanner sc=new Scanner(System.in);

        //input value
        int n;
        System.out.print("Enter number of values :");
        n=sc.nextInt();

        //handling negative values
        if(n<=0){
            sc.close();
            System.out.println("Invalid input ");
            return;
        }

        //array declaration and its values

        int []arr=new int[n];
        System.out.println("Enter values in the range 1 to "+n+" only");
        for(int i=0;i<n;i++){
            System.out.print("Enter value "+(i+1)+":");
            arr[i]=sc.nextInt();
        }


        //in this loop we manage to settle the  elements

        for(int i=0;i<n;i++){
            int index=(arr[i]-1)%n;
            arr[index]+=n;
        }

        // displaying result

        for(int i=0;i<n;i++){
            System.out.println((i+1)+" -> "+(arr[i]/n));

        }


        sc.close();

    }
}
