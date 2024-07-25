package additional.com;

import java.util.Arrays;
import java.util.Scanner;

public class Merge
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int size1=sc.nextInt();
        int[] array1=new int[size1];
        System.out.println("Enter the elements:");
        for(int i=0;i<size1;i++)
        {
            array1[i]=sc.nextInt();
        }
        System.out.println("Enter the number of elements:");
        int size2=sc.nextInt();
        int[] array2=new int[size2];
        System.out.println("Enter the elements:");
        for(int i=0;i<size2;i++)
        {
            array2[i]=sc.nextInt();
        }
        Arrays.sort(array1);
        Arrays.sort(array2);
        int[] sorted=new int[(array1.length+array2.length)];
        int index=0;
        int i=0,j=0;
        while(i<array1.length&&j<array2.length)
        {
            if(array1[i]<array2[j])
            {
                sorted[index++]=array1[i];
                i++;
            }
            else
            {
                sorted[index++]=array2[j];
                j++;
            }
        }
        while(i<array1.length)
        {
            sorted[index++]=array1[i];
            i++;
        }
        while(j<array2.length) {
            sorted[index++] = array2[j];
            j++;
        }

        System.out.println("After merging:");
        for(int num:sorted)
        {
            System.out.print(num+" ");
        }

    }
}
