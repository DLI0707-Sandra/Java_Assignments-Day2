package arrays.com;

import java.util.Scanner;

public class EvenandOdd
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
        int even=0;
        int odd=0;
        int i=0,j=0;

        for(int k:array)
        {
            if(k%2==0)
            {
                even++;
            }
            else
            {
                odd++;
            }
        }
        System.out.println("Number of even elements:"+even);
        System.out.println("Number of odd elements:"+odd);


    }
}
