package comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorOnly {
    public static void main(String[] args) {
        Product p1=new Product(1,"Shampoo",169);
        Product p2=new Product(2,"Biscuit",20);
        Product p3=new Product(3,"Laptop",35000);
        Product p4=new Product(4,"Mobile",20000);

        ArrayList<Product> arr=new ArrayList<>(List.of(p1,p2,p3,p4));
        System.out.println("Before sorting");
        arr.forEach(System.out::println);
        //sorting
        arr.sort(Comparator.comparingInt(p->p.price));

        System.out.println("After sorting");
        arr.forEach(System.out::println);

    }
}
class Product{
    int id;
    String name;
    int price;

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
