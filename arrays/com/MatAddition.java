package arrays.com;

import java.util.Scanner;

public class MatAddition
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the dimensions of the matrices:");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] mat1=new int[n][m];
        int[][] mat2=new int[n][m];
        int[][] sum=new int[n][m];
        System.out.println("Enter the first matrix:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                mat1[i][j]= sc.nextInt();
            }
        }
        System.out.println("Enter the second matrix:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                mat2[i][j]= sc.nextInt();
            }
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                sum[i][j]=mat1[i][j]+mat2[i][j];
            }
        }
        System.out.println("Sum of matrices:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }


    }
}
