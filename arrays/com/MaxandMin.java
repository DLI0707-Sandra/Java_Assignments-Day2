package arrays.com;

import java.util.Arrays;
import java.util.Scanner;

public class MaxandMin
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
        int min=array[0],max=array[0];
        for(int i=1;i<size;i++)
        {
            if(array[i]>max)
                max=array[i];
            if(array[i]<min)
                min=array[i];
        }

        System.out.println("Th minimum value:"+min);
        System.out.println("Th maximum value:"+max);
//        Using sort function
//        Arrays.sort(array);
//        System.out.println("Th minimum value:"+array[0]);
//        System.out.println("Th maximum value:"+array[size-1]);



    }
}
