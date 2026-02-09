package generics;

import java.util.ArrayList;
import java.util.List;

public class SimpleGeneric<T>{
    public static void main(String[] args) {
        SimpleGeneric<Integer> s=new SimpleGeneric<>();
        s.showGeneric(1234);

        SimpleGeneric<String> s1=new SimpleGeneric<>();
        s1.showGeneric("Yaswanth");

        Calculator<Integer> a1=new Calculator<>(12);
        System.out.println(a1.square());

    }
    public void showGeneric(T val){
        List<T>list=new ArrayList<>();
        list.add(val);
        System.out.println(val);
    }
}
class Calculator<T extends Number>{
    T num;
    public Calculator(T num){
        this.num=num;
    }

    double square(){
        return num.doubleValue()*num.doubleValue();
    }
}
