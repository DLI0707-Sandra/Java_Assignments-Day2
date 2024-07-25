package arrays.com;

import java.util.Arrays;
import java.util.Scanner;

public class Duplicate
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

        int[] duplicate=new int[size];
        int k=0;
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                if(array[i]==array[j]&&i!=j)
                {
                    int flag=0;
                    for(int l:duplicate)
                    {
                        if(l==array[i])
                        {
                            flag=1;
                            break;
                        }
                    }
                    if(flag==0)
                        duplicate[k++]=array[i];
                }
            }
        }
        for(int i=0;i<k;i++)
        {
            System.out.println(duplicate[i]);
        }
    }
}
