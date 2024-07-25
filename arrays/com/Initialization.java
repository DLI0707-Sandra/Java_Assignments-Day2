package arrays.com;

import java.util.Scanner;

public class Initialization
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
        System.out.print("The elements are:");
        for(int i=0;i<size;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
}
