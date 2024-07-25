package additional.com;

import java.util.Scanner;

public class PairSum
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
        System.out.println("Enter the sum:");
        int sum=sc.nextInt();
        int[][] pairs=new int[size][2];
        int index=0;
        for(int i=0;i<size;i++)
        {
            for(int j=1;j<size;j++)
            {
                if((array[i]+array[j]==sum)&&array[j]!=-1)
                {
                    pairs[index][0]=array[i];
                    pairs[index][1]=array[j];
                    index++;
                    array[j]=-1;
                }
            }
        }
        for (int i=0;i<index;i++)
        {
            for (int j=0;j<2;j++)
            {
                System.out.print(pairs[i][j]+" ");
            }
            System.out.println();
        }
    }

}
