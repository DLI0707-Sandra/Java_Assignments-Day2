package additional.com;

import java.util.Scanner;

public class Intersection
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
        int max_length=array1.length>array2.length?array2.length:array1.length;
        int[] common=new int[max_length];
        int index=0;

        for(int j:array1)
        {
            for(int k:array2)
            {
                if(j==k)
                {
                    common[index] = j;
                    index++;
                }
            }
        }
        System.out.println("\nCommon in array1 and array2:");
        for(int j=0;j<index;j++)
        {
            System.out.print(common[j]+" ");
        }
    }
}
