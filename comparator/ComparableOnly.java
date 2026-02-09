package comparator;

import java.util.ArrayList;
import java.util.List;

public class ComparableOnly {
    public static void main(String[] args) {
        Student s1=new Student(1,"yaswanth",99);
        Student s2=new Student(2,"lahari",100);
        Student s3=new Student(3,"yashri",90);
        Student s4=new Student(4,"layansh",89);

        ArrayList<Student> arr=new ArrayList<>(List.of(s1,s2,s3,s4));
        System.out.println("before sorting ");
        for(Student s:arr){
            System.out.println(s);
        }

        arr.sort(Student::compareTo);
        System.out.println("After sorting");
        for(Student s:arr){
            System.out.println(s);
        }

    }
}
class Student implements Comparable<Student>{
    int rollNo;
    String name;
    int marks;
    Student (int rollNo,String name,int marks){
        this.rollNo=rollNo;
        this.name=name;
        this.marks=marks;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.rollNo,o.rollNo);
    }

    @Override
    public String toString() {
        return "roll no->"+rollNo+" marks-> "+marks+" name->"+name;
    }
}
