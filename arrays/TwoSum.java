package arrays;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        //scanner class initiation
        Scanner sc=new Scanner(System.in);

        //input value
        int n;
        System.out.print("Enter number of values :");
        n=sc.nextInt();

        if(n<=0){
            sc.close();
            System.out.println("Invalid input");
            return;
        }
        //target value
        int target;
        System.out.print("Enter target sum :");
        target=sc.nextInt();

        //array
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter value "+(i+1)+" :");
            arr[i]=sc.nextInt();
        }
        sc.close();

        //core logic
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int req=target-arr[i];
            if(map.containsKey(req)) {
                System.out.println("result array is [" + map.get(req) + "," + i + "]");
                return;
            }
            map.put(arr[i],i);
        }
        System.out.println("No two elements having that sum");

    }
}
