package arrays2D;

import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        //scanner class initiation
        Scanner sc=new Scanner(System.in);

        //input rows and columns
        System.out.print("Enter number of rows :");
        int m=sc.nextInt();
        System.out.print("Enter number of cols :");
        int n=sc.nextInt();
        if(m<=0|| n<=0){
            sc.close();
            System.out.println("Invalid input ");
            return;
        }

        //input array
        int [][]mat=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print("Enter value at position "+(i+1)+" "+(j+1)+": ");
                mat[i][j]=sc.nextInt();
            }
        }

        int left=0,right=n-1;
        int top=0,bottom=m-1;

        while(left<=right && top<=bottom){
            for(int i=left;i<=right;i++){
                System.out.print(mat[top][i]+" ");
            }
            top++;

            for(int i=top;i<=bottom;i++){
                System.out.print(mat[i][right]+" ");
            }
            right--;

            if(top<=bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(mat[bottom][i] + " ");
                }
                bottom--;
            }
            if(left<=right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(mat[i][left] + " ");
                }
                left++;
            }
        }

    }
}
