package conditionsandloops;

import java.util.Scanner;

public class ConditionalPattern {
    public static void main(String[] args) {

        //scanner class initiation
        Scanner sc=new Scanner(System.in);

        //input value
        int n;
        System.out.print("Enter number of levels needed:");
        n=sc.nextInt();

        //handing negative values
        if(n<=0){
            System.out.println("Invalid input");
            sc.close();
            return;
        }

        for(int i=1;i<=n;i++){
            for(int j=i;j>=1;j--){
                if(j%2==0){
                    System.out.print("* ");
                }else{
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
