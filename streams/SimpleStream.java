package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SimpleStream {
    public static void main(String[] args) {
        //suppose a  list is there

        ArrayList<Integer> arr=new ArrayList<>(List.of(12,34,56,686,8,9,0,89,89));

        //now the question is
        // filter the above array list so that square the even numbers and discard the odd elements
        //traditional method

        List<Integer> res=new ArrayList<>();
        for(int i:arr){
            if(i%2==0)res.add(i*i);
        }
        //after that
        res.forEach(System.out::println);


        System.out.println("After using streams");
        //using streams
        res=arr.stream().filter(x->x%2==0).map(x->x*x).collect(Collectors.toList());

        res.forEach(System.out::println);


    }
}
