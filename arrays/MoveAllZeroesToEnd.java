package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MoveAllZeroesToEnd {
    public static void main(String[] args) {
        //Scanner class initiation
        Scanner sc=new Scanner(System.in);

        //input value
        int n;
        System.out.print("enter number fo values :");
        n=sc.nextInt();

        //handling input values

        if(n<=0){
            sc.close();
            System.out.println("Invalid input ");
            return;
        }

        //array input and declaration
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Value "+(i+1)+" :");
            arr[i]=sc.nextInt();
        }

        //core logic
        // index is used to locate first zero index
        int index=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                if (index != i) {
                    int temp = arr[i];
                    arr[i] = arr[index];
                    arr[index] = temp;
                }
                index++;
            }
        }

        //displaying the array
        System.out.println(Arrays.toString(arr));

        sc.close();

    }
}
