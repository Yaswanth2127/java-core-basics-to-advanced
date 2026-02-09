package arrays2D;

import java.util.Scanner;

public class SearchIn2D_1 {
    public static void main(String[] args) {
        //scanner class initiation
        Scanner sc=new Scanner(System.in);

        //input rows and columns
        System.out.print("Enter number of rows :");
        int rows=sc.nextInt();
        System.out.print("Enter number of cols :");
        int cols =sc.nextInt();
        if(rows<=0|| cols <=0){
            sc.close();
            System.out.println("Invalid input ");
            return;
        }
        int [][]mat=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j = 0; j< cols; j++){
                System.out.print("Enter value at position "+(i+1)+" "+(j+1)+": ");
                mat[i][j]=sc.nextInt();
            }
        }

        sc.close();
        //target
        System.out.print("Enter target element :");
        int target=sc.nextInt();

        //core logic
        int left=0,right=rows* cols -1;
        while(left<=right){
            int mid=(left+right)/2;
            int row=mid/ cols;
            int col=mid%cols;

            if(mat[row][col]==target){
                System.out.println("element find at position "+(row+1)+" "+(col+1));
                return;
            }
            else if(mat[row][col]>target){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        System.out.println("Target element doesn't exist in the matrix");
    }
}
