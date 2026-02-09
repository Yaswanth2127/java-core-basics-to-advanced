package dataTypes;

public class operatorPrecedence {
    public static void main(String[] args) {
        int a=8,b=3,c=5;

        int result=a++ +--b*c/a---++b;
        System.out.println(result);
    }
}
