package lambdaExpressions;
// lambda expression declaration
//(parameters) -> expression
//        (parameters) -> { statements }

import java.util.Scanner;

// lambdas only work with functional interfaces only
// where each interface having only one method
public class Example {
    public static void main(String[] args) {
        //scanner class initiation
        Scanner sc=new Scanner(System.in);

        int a,b;
        System.out.print("Enter number a: ");
        a=sc.nextInt();
        System.out.print("Enter number b: ");
        b=sc.nextInt();

        Addition add= Integer::sum;
        System.out.println(add.add(a,b));

        //without lambdas expressions
        // the above can be implemented

//        Addition add1=new Addition() {
//            @Override
//            public int add(int a, int b) {
//                return a+b;
//            }
//        };
    }
}


