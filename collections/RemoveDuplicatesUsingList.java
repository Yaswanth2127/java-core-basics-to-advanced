package collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicatesUsingList {
    public static void main(String[] args) {
        //Scanner class initiation
        Scanner sc=new Scanner(System.in);

        //n is not needed but in this case we don't have lists, so we have to create at this time
        int n;
        System.out.print("Enter number of elements ");
        n=sc.nextInt();

        if(n<=0){
            sc.close();
            System.out.println("Invalid input");
            return;
        }
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            System.out.print("Enter value :");
            arr.add(sc.nextInt());
        }

        LinkedHashSet<Integer> set=new LinkedHashSet<>(arr);

        arr.clear();
        arr.addAll(set);

        System.out.println("All elements in a set are "+arr);


    }
}
