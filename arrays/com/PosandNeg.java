package arrays.com;

import java.util.Scanner;

public class PosandNeg
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int size=sc.nextInt();
        int[] array=new int[size];
        System.out.println("Enter the elements:");
        for(int i=0;i<size;i++)
        {
            array[i]=sc.nextInt();
        }
        int [] positive=new int[size];
        int[] negative=new int[size];
        int i=0,j=0;

        for(int k:array)
        {
            if(k>=0)
            {
                positive[i++]=k;
            }
            else
            {
                negative[j++]=k;
            }
        }
        System.out.println("\nPositive elements::");
        for(int k=0;k<i;k++)
        {
            System.out.print(positive[k]+" ");
        }
        System.out.println("\nNegative elements::");
        for(int k=0;k<j;k++)
        {
            System.out.print(negative[k]+" ");
        }
    }
}
