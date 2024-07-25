package arrays.com;

import java.util.Scanner;

public class Reverse
{
    public static void main(String [] args)
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
        for(int i=0;i<size/2;i++)
        {
            int temp=array[i];
            array[i]=array[size-i-1];
            array[size-i-1]=temp;
        }
        System.out.println("After reversal");
        for(int i=0;i<size;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
}
