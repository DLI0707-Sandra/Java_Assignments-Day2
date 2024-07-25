package additional.com;

import java.util.Scanner;

public class RotateArray
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
        System.out.println("Enter the number of shifts:");
        int number=sc.nextInt();
        int[] rotated=new int[size];

        for(int i=number;i<size;i++)
        {
//            System.out.println(array[i]);
//            System.out.println(i-number);
            rotated[i-number]=array[i];
        }

        for(int i=0;i<number;i++)
        {
            rotated[i+number+1]=array[i];
        }

        for (int i=0;i<size;i++)
        {
            System.out.print(rotated[i]+" ");
        }

    }
}
