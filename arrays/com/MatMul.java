package arrays.com;

import java.util.Scanner;

public class MatMul
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the dimensions of matrix 1:");
        int p=sc.nextInt();
        int q=sc.nextInt();
        System.out.println("Enter the dimensions of matrix 2:");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] mat1=new int[p][q];
        int[][] mat2=new int[n][m];
        int[][] product=new int[p][m];
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


        if(q==n)
        {
            for(int i=0;i<p;i++)
            {
                for(int j=0;j<q;j++)
                {
                    product[i][j]=0;
                    for(int k=0;k<n;k++)
                    {
                        product[i][j] += mat1[i][k] * mat2[k][j];
                    }
                }
            }
        }
        else
        {
            System.out.println("Not Compatible.");
        }

        System.out.println("Product of matrices:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(product[i][j]+" ");
            }
            System.out.println();
        }

    }
}
