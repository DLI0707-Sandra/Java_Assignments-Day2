package average.com;

import java.util.Scanner;

public class Average
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] array=new int[5];
        double sum=0.0;
        System.out.println("Enter 5 numbers:");
        for(int i=0;i<5;i++)
        {
            array[i]=sc.nextInt();
            sum+=array[i];
        }
        double avg=sum/5;
        System.out.println("Average="+avg);
    }
}
