package arrays2D;

import java.util.Arrays;
import java.util.Scanner;

public class Rotate90ClockWise {
    public static void main(String[] args) {
        //scanner class initiation
        Scanner sc=new Scanner(System.in);

        //input rows and columns
        System.out.print("Enter number of rows :");
        int m=sc.nextInt();

        if(m<=0){
            sc.close();
            System.out.println("Invalid input ");
            return;
        }

        //input array
        int [][]mat=new int[m][m];
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                System.out.print("Enter value at position "+(i+1)+" "+(j+1)+": ");
                mat[i][j]=sc.nextInt();
            }
        }

        sc.close();

        //transpose matrix
        for(int i=0;i<m;i++){
            for(int j=i;j<m;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }

        //core logic
        for(int []i:mat){
            reverseMatrix(i);
        }

        //result
        System.out.println(Arrays.deepToString(mat));

    }
    public static void reverseMatrix(int []arr){
        int start=0,end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
