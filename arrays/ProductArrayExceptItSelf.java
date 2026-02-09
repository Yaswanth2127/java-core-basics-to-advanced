package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ProductArrayExceptItSelf {
    public static void main(String[] args) {
        //Scanner class initiation
        Scanner sc=new Scanner(System.in);

        //input value
        int n;
        System.out.print("Enter number of values :");
        n=sc.nextInt();

        //handling negative n value
        if(n<=0){
            sc.close();
            System.out.println("Invalid input");
            return;
        }

        //array declaration and its values

        int []arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Value "+(i+1)+":");
            arr[i]=sc.nextInt();
        }

        //core logic with using division

        int zeroes=0,index=-1;
        int product=1;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                product*=arr[i];
            }else{
                zeroes++;
                index=i;
                if(zeroes>1)break;
            }
        }

        if(zeroes>1){
            Arrays.fill(arr,0);
        }
        else if(zeroes==1){
            Arrays.fill(arr,0);
            arr[index]=product;
        }else{
            for(int i=0;i<n;i++){
                arr[i]=product/arr[i];
            }
        }

        //displaying the result
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
