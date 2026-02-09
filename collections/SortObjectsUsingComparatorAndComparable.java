package collections;

import java.util.ArrayList;
import java.util.List;

public class SortObjectsUsingComparatorAndComparable {
    public static void main(String[] args) {
        Employee e1=new Employee(1,"yaswanth",90909);
        Employee e2=new Employee(2,"lahari",89989);
        Employee e3=new Employee(3,"yashri",78989);
        Employee e4=new Employee(4,"layansh",78989);

        ArrayList<Employee> arr=new ArrayList<>(List.of(e1,e2,e3,e4));
        System.out.println("Before sorting");
        for(Employee e:arr){
            System.out.println(e);
        }
        System.out.println("After sorting");
        arr.sort(Employee::compareTo);
        for(Employee e:arr){
            System.out.println(e);
        }



        System.out.println("After sorting");


    }
}
class Employee implements Comparable<Employee>{
    int id;
    int salary;
    String name;
    Employee(int id,String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    @Override
    public int compareTo(Employee e){
        if(this.salary==e.salary){
            return this.name.compareTo(e.name);
        }else{
            return Integer.compare(e.salary,this.salary);
        }
    }

    @Override
    public String toString() {
        return "id ->"+id+"\nName->"+name+"\nsalary->"+salary;
    }
}
