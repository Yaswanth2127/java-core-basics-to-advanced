package arrays;

import java.util.HashMap;
import java.util.Scanner;

public class SubArraySumWithK {
    public static void main(String[] args) {
        //Scanner class initiation
        Scanner sc=new Scanner(System.in);

        //input value
        System.out.print("Enter number of values :");
        int n=sc.nextInt();

        if(n<=0){
            sc.close();
            System.out.println("Invalid input");
            return;
        }

        //target sum
        System.out.print("Enter target sum :");
        int target=sc.nextInt();

        //array
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter value "+(i+1)+":");
            arr[i]=sc.nextInt();
        }

        sc.close();
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);

        int currSum=0;
        for(int i=0;i<n;i++){
            currSum+=arr[i];
            int req=currSum-target;
            if(map.containsKey(req)){
                count+=map.get(req);
            }
            map.put(currSum,map.getOrDefault(currSum,0)+1);
        }
        System.out.println("Total sub arrays are  "+count);

    }
}
