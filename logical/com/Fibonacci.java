package logical.com;

import java.util.Scanner;

public class Fibonacci
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the limit:");
        int limit=sc.nextInt();
        int[] series= new int[limit];
        series[0]=0;
        series[1]=1;
        for(int i=2;i<limit;i++)
        {
            series[i]=series[i-1]+series[i-2];
        }

        System.out.println("Fibonacci series till "+limit+"elements:");
        for (int i=0;i<limit;i++)
        {
            System.out.print(series[i]+" ");
        }
    }
}
