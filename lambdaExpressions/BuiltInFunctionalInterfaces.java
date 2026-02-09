package lambdaExpressions;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class BuiltInFunctionalInterfaces {
    public static void main(String[] args) {
        //some built in functional interfaces
//        Predicate<T>
//
//        Takes input
//        Returns boolean

        Predicate<Integer>isEven=n->n%2==0;
        System.out.println("Is 8 even number or not "+isEven.test(8));

//        Consumer<T>
//
//        ✔ Takes input
//        ✔ Returns nothing

        Consumer<String> print=s-> System.out.println("Hello "+s);

        print.accept("Yaswanth");


//        🔸 Supplier<T>
//
//✔ Takes no input
//✔ Returns output

        Supplier<Double> random = Math::random;

        System.out.println(random.get());

    }
}
