package comparator;

import java.util.ArrayList;
import java.util.List;

public class MultiLevelSorting {
    public static void main(String[] args) {
        Student1 s1=new Student1(1,"yaswanth",99);
        Student1 s2=new Student1(2,"lahari",100);
        Student1 s3=new Student1(3,"yashri",90);
        Student1 s4=new Student1(4,"layansh",89);

        ArrayList<Student1> arr=new ArrayList<>(List.of(s1,s2,s3,s4));
        System.out.println("before sorting ");
        for(Student1 s:arr){
            System.out.println(s);
        }

        arr.sort(Student1::compareTo);
        System.out.println("After sorting");
        for(Student1 s:arr){
            System.out.println(s);
        }

    }
}
class Student1 implements Comparable<Student1>{
    int rollNo;
    String name;
    int marks;
    Student1 (int rollNo,String name,int marks){
        this.rollNo=rollNo;
        this.name=name;
        this.marks=marks;
    }

    @Override
    public int compareTo(Student1 o) {
        int cmp = Integer.compare(o.marks, this.marks);


        if (cmp == 0) {
            return this.name.compareTo(o.name);
        }

        return cmp;
    }

    @Override
    public String toString() {
        return "roll no->"+rollNo+" marks-> "+marks+" name->"+name;
    }
}