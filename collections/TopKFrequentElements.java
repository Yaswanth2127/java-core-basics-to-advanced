package collections;

import java.util.*;

public class TopKFrequentElements {
    public static void main(String[] args) {
        //Scanner class initiation
        Scanner sc=new Scanner(System.in);

        //n is not needed but in this case we don't have lists, so we have to create at this time
        int n;
        System.out.print("Enter number of elements ");
        n=sc.nextInt();
        int k;
        System.out.print("Enter k value ");
        k=sc.nextInt();

        if(n<=0 || k<=0){
            sc.close();
            System.out.println("Invalid input");
            return;
        }

        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            System.out.print("Enter value :");
            arr.add(sc.nextInt());
        }
        sc.close();

        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
                        Comparator.comparingInt(Map.Entry<Integer, Integer>::getValue).reversed());
        pq.addAll(map.entrySet());

        //resultant list
        ArrayList<Integer> res=new ArrayList<>();
        while(k>0 && !pq.isEmpty()){
            res.add(pq.poll().getKey());
            k--;
        }
        System.out.println("Result is "+res);
    }
}
