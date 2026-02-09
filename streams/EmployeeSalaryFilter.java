package streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeSalaryFilter {
    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee(1, "Amit", "IT", 60000),
                new Employee(2, "Ravi", "HR", 45000),
                new Employee(3, "Sneha", "IT", 75000),
                new Employee(4, "Priya", "Finance", 50000),
                new Employee(5, "Arjun", "Finance", 90000),
                new Employee(6, "Neha", "HR", 55000),
                new Employee(7, "Kiran", "IT", 40000)
        );

        //salary greater than 50k
        List<Employee> highPaid=employees.stream().filter(e->e.salary>50000).toList();
        System.out.println("Employees having salary greater than 50k is ");
        highPaid.forEach(System.out::println);

        //group employees by department

        System.out.println("Employee in each department are");
        Map<String,List<Employee>> departmentWise=employees.stream().collect(Collectors.groupingBy(e->e.dept));

        for(String s:departmentWise.keySet()){
            System.out.println("Department name "+s);
            departmentWise.get(s).forEach(System.out::println);
            System.out.println("--------");
        }


        //highest paid in each dept

        Map<String, Optional<Employee>> maxInDept=employees.stream().
                collect(Collectors.groupingBy(e->e.dept,Collectors.maxBy(Comparator.comparingInt(e->e.salary))));

        System.out.println("Highest paid in each department ");
        for(String s: maxInDept.keySet()){
            System.out.println(s+" -> "+maxInDept.get(s));
        }

        //average salary by each department
        Map<String,Double> avg=employees.stream().collect(Collectors.groupingBy(e->e.dept,Collectors.averagingInt(e->e.salary)));
        System.out.println("Avg salary of each department is ");
        for(String s:avg.keySet()){
            System.out.println(s+"->"+avg.get(s));
        }


        //total salary of all employees
        Integer total=employees.stream().map(e->e.salary).reduce(0,Integer::sum);
        System.out.println("Total salary of all employees is "+total);




    }
}
class Employee{
    int id;
    String name;
    String dept;
    int salary;

    public Employee(int id, String name, String dept, int salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }
}