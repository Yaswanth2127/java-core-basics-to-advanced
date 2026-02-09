package comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorChaining {
    public static void main(String[] args) {
        Product1 p1=new Product1("Apple",90);
        Product1 p2=new Product1("Apple",80);
        Product1 p3=new Product1("Guava",90);
        Product1 p4=new Product1("Mango",70);

        ArrayList<Product1>arr=new ArrayList<>(List.of(p1,p4,p2,p3));

        System.out.println("Before sorting");
        arr.forEach(System.out::println);

        arr.sort(Comparator.comparing((Product1 p)->p.name)
                .thenComparing(Comparator.comparingInt((Product1 p) -> p.price).reversed()));
        System.out.println("After sorting");
        arr.forEach(System.out::println);

    }
}
class Product1{
    String name;
    int price;

    public Product1(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product1{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
