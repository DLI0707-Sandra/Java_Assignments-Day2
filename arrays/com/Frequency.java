package arrays.com;

import java.util.Scanner;

public class Frequency
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
        int[] freq=new int[size];
        for(int i=0;i<size;i++)
        {
            freq[i]=0;
            for (int j=0;j<size;j++)
            {
                if(array[j]==array[i])
                {
                    freq[i]++;
                }
            }
        }

        for(int i=0;i<size;i++)
        {
            System.out.println("Frequency of "+array[i]+":"+freq[i]);
        }

    }
}
