package streams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args) {
        //flatmap means
        //Converts nested structures into a single stream

        //suppose
        List<List<Integer>> list = List.of(
                List.of(1, 2),
                List.of(3, 4),
                List.of(5)
        );

        // the above list cannot be converted into single stream using collectors
        // then we use flat map
        List<Integer> single=list.stream().flatMap(Collection::stream).toList();

        System.out.println("single list "+single);

        //skills having each employee

        List<Employee1> emp=new ArrayList<>(List.of(
                new Employee1("yaswanth",new ArrayList<>(List.of("Backend","MicroServices","Communication Skills"))),
                new Employee1("lahari",new ArrayList<>(List.of("Communication Skills","Literature","Crafts","IT Knowledge")))));

        Set<String>skills=emp.stream().flatMap(e->e.skills.stream()).collect(Collectors.toSet());

        System.out.println("Unique skills ");
        System.out.println(skills);
    }
}
class Employee1{
    String name;
    List<String>skills;

    public Employee1(String name, List<String> skills) {
        this.name = name;
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "name='" + name + '\'' +
                ", skills=" + skills +
                '}';
    }
}
