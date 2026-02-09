package arrays;

import java.util.Scanner;

public class EquilibriumIndex {
    public static void main(String[] args) {
        //scanner class initiation
        Scanner sc=new Scanner(System.in);

        //input value
        int n;
        System.out.println("Enter number of values :");
        n=sc.nextInt();

        //handle negative numbers
        if(n<=0){
            System.out.println("Invalid input");
            sc.close();
            return;
        }

        //array declaration
        int []array=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Number "+(i+1)+":");
            array[i]=sc.nextInt();
        }

        sc.close();

        //finding total sum
        int totalSum=0;
        for(int i:array){
            totalSum+=i;
        }

        //core logic
        int left=0;
        int index=0;

        while(index<n ){
            int right=totalSum-left-array[index];
            if(left==right){
                System.out.println(index);
                return;
            }
            left+=array[index];
            index++;
        }
        System.out.println(-1);

    }
}
