package additional.com;

import java.util.Scanner;

public class SecondLargest
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
        int largest=array[0];
        for(int i=1;i<size;i++)
        {
            if(array[i]>largest)
                largest=array[i];
        }
        int second=array[0];
        for(int i=1;i<size;i++)
        {
            if(array[i]<largest&&array[i]>second)
            {
                second=array[i];
            }
        }
        System.out.println("Second Largest:"+second);
    }
}
