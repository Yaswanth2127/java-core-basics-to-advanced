package exceptions;

import java.util.Scanner;

public class InvalidAgeException {
    public static void main(String[] args) {
        //Scanner class initiation
        Scanner sc = new Scanner(System.in);

        int age;
        System.out.print("Enter your age :");
        age = sc.nextInt();
        sc.close();
        try{
            if (age < 0 || age > 120) {
                throw new InvalidAgeInput("Invalid age entered ");
            }
            System.out.println("Your age is "+age);
        }catch (InvalidAgeInput ex){
            System.out.println(ex.getMessage());
        }finally {
            System.out.println("finally checked");
        }
    }
}
 class InvalidAgeInput extends RuntimeException{
    public InvalidAgeInput(String message){
        super(message);
    }
    public InvalidAgeInput(String message, Throwable cause) {
        super(message, cause);
    }
}