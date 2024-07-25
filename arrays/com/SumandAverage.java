package arrays.com;

import java.util.Scanner;

public class SumandAverage
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
        //Sum and Average
        double sum=0.0,average;
        for(int i=0;i<size;i++)
        {
            sum+=array[i];
        }
        average=sum/size;
        System.out.println("Sum of elements:"+(int)sum);
        System.out.println("Average:"+average);
    }
}
