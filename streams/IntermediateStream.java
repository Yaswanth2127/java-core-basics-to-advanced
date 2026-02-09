package streams;

import java.util.Map;
import java.util.stream.Collectors;

public class IntermediateStream {
    public static void main(String[] args) {
        //find frequency of each character in a string
        //using stream
        String s="leetcode";

        Map<Character,Long> res=s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
        System.out.println(res);
    }
}
