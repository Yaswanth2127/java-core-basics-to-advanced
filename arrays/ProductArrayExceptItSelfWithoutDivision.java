package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ProductArrayExceptItSelfWithoutDivision {
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

        //array declaration and its input
        int []arr=new int[n];
        //prefix product array
        int []prefix=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Value "+(i+1)+":");
            arr[i]=sc.nextInt();
            if(i==0){
                prefix[i]=arr[i];
            }else{
                prefix[i]=prefix[i-1]*arr[i];
            }
        }

        //core logic
        int suffix=1;
        for(int i=n-1;i>=1;i--){
            int temp=arr[i];
            arr[i]=prefix[i-1]*suffix;
            suffix*=temp;
        }
        arr[0]=suffix;


        //displaying the result

        System.out.println(Arrays.toString(arr));
        sc.close();


    }
}
