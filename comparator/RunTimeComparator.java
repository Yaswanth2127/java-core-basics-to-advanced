package comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class RunTimeComparator {
    public static void main(String[] args) {
        //scanner class initiation
        Scanner sc=new Scanner(System.in);

        Employee1 e1=new Employee1(1,"Amit",89999,26);
        Employee1 e2=new Employee1(2,"Lokesh",68999,23);
        Employee1 e3=new Employee1(3,"Akbar",77899,29);

        ArrayList<Employee1>arr=new ArrayList<>(List.of(e1,e2,e3));

        int n;
        System.out.print("Enter \n1-Sort by salary(ascending)\n2-Sort by name(alphabetical)\n3-sort by age(descending):");
        n=sc.nextInt();
        sc.close();

        System.out.println("Before sorting ");
        arr.forEach(System.out::println);

        if(n==1){
            arr.sort(Comparator.comparingInt(p->p.salary));
        }else if(n==2){
            arr.sort(Comparator.comparing(p->p.name));
        }else if(n==3){
            arr.sort(Comparator.comparingInt((Employee1 p)->p.age).reversed());
        }else{
            System.out.println("invalid input");
            return;
        }
        System.out.println("After sorting ");
        arr.forEach(System.out::println);

    }
}
class Employee1{
    int id;
    String name;
    int salary;
    int age;

    public Employee1(int id, String name, int salary, int age) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
