package arrays2D;

import java.util.Arrays;
import java.util.Scanner;

public class SetMatrixZeroes {
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
        int [][]mat=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print("Enter value at position "+(i+1)+" "+(j+1)+": ");
                mat[i][j]=sc.nextInt();
            }
        }
        //setting zeroes for first row and column
        boolean row=false,col=false;
        for(int i=0;i<m;i++){
                if(mat[i][0]==0){
                    row=true;
                    break;
                }
        }

        //
        for(int i=0;i<n;i++){
            if(mat[0][i]==0){
                col=true;
                break;
            }
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(mat[i][j]==0){
                    mat[i][0]=0;
                    mat[0][j]=0;
                }

            }
        }


        //setting zeroes
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(mat[0][j]==0 || mat[i][0]==0){
                    mat[i][j]=0;
                }
            }
        }

        System.out.println(Arrays.deepToString(mat));
        //filling first row and column
        if(row){
            for(int i=0;i<m;i++){
                mat[i][0]=0;
            }
        }
        if(col){
            for(int i=0;i<n;i++){
                mat[0][i]=0;
            }
        }

        System.out.println(Arrays.deepToString(mat));

    }
}
